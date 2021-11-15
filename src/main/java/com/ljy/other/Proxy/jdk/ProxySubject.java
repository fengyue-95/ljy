package com.ljy.other.Proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author fengyue
 * @date 2021/6/4
 */
public class ProxySubject implements Subject {

    @Override
    public void request() {
        System.out.println(this.getClass().getClassLoader().toString());
    }

    static class ProxyFactory {

        private final Object object;

        public ProxyFactory(Object object){
            this.object = object;
        }

        public Object getProxyInstance() {
            return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(),
                                          new InvocationHandler() {

                                              @Override
                                              public Object invoke(Object proxy, Method method,
                                                                   Object[] args) throws Throwable {
                                                  System.out.println("计算开始时间");
                                                  // 执行目标对象方法
                                                  method.invoke(object, args);
                                                  System.out.println("计算结束时间");
                                                  return null;
                                              }
                                          });
        }

    }

    public static void main(String[] args) {
        ProxySubject proxySubject = new ProxySubject();
        ProxyFactory proxyFactory = new ProxyFactory(proxySubject);
        Subject proxyInstance = (Subject)proxyFactory.getProxyInstance();
        proxyInstance.request();


    }
}
