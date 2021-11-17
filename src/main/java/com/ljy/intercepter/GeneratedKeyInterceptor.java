package com.ljy.intercepter;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.persistence.Id;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * @author fengyue
 * @date 2021/8/18
 */
@Intercepts({@Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class})})
public class GeneratedKeyInterceptor implements Interceptor {
    private static final Logger LOGGER = LoggerFactory.getLogger(GeneratedKeyInterceptor.class);
    private static final long MAX_WAIT_TIME = 600000L;
    private static final long PER_WAIT_TIME = 30000L;
    private static final String KEY_NAME = "id";
    private static final String KEY_TYPE = "Long";
    private static final String INSERT = "insert";
    private static final String BATCH_INSERT = "batchInsert";
    private static final String INSERT_BATCH = "insertBatch";
    //private DistributedIdGenerator distributedIdGenerator;  分布式id生成器


    public GeneratedKeyInterceptor() {}

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        MappedStatement mappedStatement = (MappedStatement)invocation.getArgs()[0];
        SqlCommandType sqlCommandType = mappedStatement.getSqlCommandType();
        if (!SqlCommandType.INSERT.equals(sqlCommandType)) {
            return invocation.proceed();
        } else {
            Object parameter = invocation.getArgs()[1];
            if (!mappedStatement.getId().contains("batchInsert") && !mappedStatement.getId().contains("insertBatch")) {
                if (mappedStatement.getId().contains("insert")) {
                    this.generatedKey(parameter);
                }
            } else if (parameter instanceof HashMap) {
                Object list = ((Map)parameter).get("list");
                if (list instanceof ArrayList) {
                    Iterator var6 = ((ArrayList)list).iterator();

                    while (var6.hasNext()) {
                        Object o = var6.next();
                        this.generatedKey(o);
                    }
                }
            }

            return invocation.proceed();
        }
    }

    private void generatedKey(Object parameter) throws Throwable {
        List<Field> fieldList = new ArrayList();

        for (Class tempClass = parameter.getClass();
            tempClass != null && !Object.class.getName().equals(tempClass.getName());
            tempClass = tempClass.getSuperclass()) {
            fieldList.addAll(Arrays.asList(tempClass.getDeclaredFields()));
        }

        Iterator var4 = fieldList.iterator();

        while (true) {
            Field field;
            do {
                if (!var4.hasNext()) {
                    return;
                }

                field = (Field)var4.next();
            } while (!"id".equals(field.getName()) && !field.isAnnotationPresent(Id.class));

            if ("Long".equals(field.getType().getSimpleName())) {
                field.setAccessible(true);
                if (field.get(parameter) == null) {
                    //field.set(parameter, this.getDistributedIdGenerator().getId());
                }
            }
        }
    }

    //private DistributedIdGenerator getDistributedIdGenerator() {
    //    if (this.distributedIdGenerator == null) {
    //        Long l = System.currentTimeMillis();
    //
    //        while (System.currentTimeMillis() < l + 600000L) {
    //            try {
    //                this. distributedIdGenerator=SpringUtil.getBeanByType(DistributedIdGenerator.class);
    //                if (this.distributedIdGenerator != null) {
    //                    return this.distributedIdGenerator;
    //                }
    //            } catch (Exception var4) {
    //                LOGGER.warn("waiting init snowflakeService:" + var4.getMessage());
    //            }
    //
    //            try {
    //                Thread.sleep(30000L);
    //            } catch (InterruptedException var3) {
    //                LOGGER.warn("waiting init snowflakeService:" + var3.getMessage());
    //            }
    //        }
    //    }
    //
    //    return this.distributedIdGenerator;
    //}

    @Override
    public Object plugin(Object o) {
        return o instanceof Executor ? Plugin.wrap(o, this) : o;
    }

    @Override
    public void setProperties(Properties properties) {}


//    <?xml version="1.0" encoding="UTF-8" ?>
//<!DOCTYPE configuration PUBLIC "-//mybatis.org//DTD Config 3.0//EN" "http://mybatis.org/dtd/mybatis-3-config.dtd">
//<configuration>
//    <plugins>
//        <plugin interceptor="xx.xxx.xxx.xxx.GeneratedKeyInterceptor"></plugin>
//        <plugin interceptor="xx.xxx.xxx.xxx.ReplaceEntityRoleInterceptor"></plugin>
//    </plugins>
//
//</configuration>


    //<!-- spring和MyBatis完美整合，不需要mybatis的配置映射文件 -->
	//<bean id="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
	//	<property name="configLocation">
	//		<value>classpath:mybatis-config-ext.xml</value>
	//	</property>
    //
	//</bean>
}
