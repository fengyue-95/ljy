package com.ljy.other.Proxy.cglib;

import java.lang.reflect.Method;

import com.ljy.other.Proxy.jdk.ProxySubject;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @author fengyue
 * @date 2021/6/4
 */
public class MyMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("目标类增强前！！！");
        // 注意这里的方法调用，不是用反射哦！！！
        Object object = methodProxy.invokeSuper(obj, args);
        System.out.println("目标类增强后！！！");
        return object;
    }


    static class CGlibProxy{
        public static void main(String[] args) {
            //创建Enhancer对象，类似于JDK动态代理的Proxy类，下一步就是设置几个参数
            Enhancer enhancer = new Enhancer();
            //设置目标类的字节码文件
            enhancer.setSuperclass(ProxySubject.class);
            //设置回调函数
            enhancer.setCallback(new MyMethodInterceptor());

            //这里的creat方法就是正式创建代理类
            ProxySubject proxyDog = (ProxySubject) enhancer.create();
            //调用代理类的eat方法
            proxyDog.request();
        }

    }}
