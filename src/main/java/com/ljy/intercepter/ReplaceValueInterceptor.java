package com.ljy.intercepter;

import java.lang.reflect.Field;
import java.util.Objects;
import java.util.Properties;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.springframework.stereotype.Component;

/**
 * @author fengyue
 * @date 2021/10/21
 */
@Component
@Slf4j
@Intercepts(@Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class}))
public class ReplaceValueInterceptor implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        fillField(invocation);
        return invocation.proceed();
    }

    private void fillField(Invocation invocation) throws Throwable {
        Object[] args = invocation.getArgs();
        SqlCommandType sqlCommandType = null;
        for (int i = 0; i < args.length; i++) {
            Object arg = args[i];
            if (arg instanceof MappedStatement) {
                MappedStatement ms = (MappedStatement)arg;
                sqlCommandType = ms.getSqlCommandType();
                if (sqlCommandType == SqlCommandType.INSERT || sqlCommandType == SqlCommandType.UPDATE) {
                    continue;
                } else {
                    break;
                }
            }

            if (sqlCommandType == SqlCommandType.INSERT) {
                setPropertyValue(arg);
            } else if (sqlCommandType == SqlCommandType.UPDATE) {
                setPropertyValue(arg);
            }
        }
    }

    private void setPropertyValue(Object arg) throws IllegalAccessException {
        for (Field f : arg.getClass().getDeclaredFields()) {
            f.setAccessible(true);
            //修改字段
            if ("entityRole".equals(f.getName())) {
                //将要插入的值
                Object o = f.get(arg);
                String value = null;
                //修改将要插入的值
                if (Objects.nonNull(o)) {
                    if (o.toString().contains("anaun.")) {
                        value = o.toString().replace("anaun.", "");
                    }
                    if (o.toString().contains("paka.")) {
                        value = o.toString().replace("paka.", "");
                    }
                    if (StringUtils.isNotBlank(value)) {
                        f.set(arg, value);
                    }

                }

            }
        }
    }

    @Override
    public Object plugin(Object o) {
        return Plugin.wrap(o, this);
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
