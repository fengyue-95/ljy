package com.ljy.java.rpc;

/**
 * @author fengyue
 * @date 2021/6/4
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public void sayHello() {
        System.out.println("hello");
    }
}
