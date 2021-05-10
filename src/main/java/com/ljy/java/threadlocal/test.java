package com.ljy.java.threadlocal;

/**
 * @author fengyue
 * @date 2021/5/5
 */
public class test {

    public static final Integer SIZE  = 20;

    static ThreadLocal<User>    local = new ThreadLocal<>();

    public static void main(String[] args) {

        try {
            for (int i = 0; i < SIZE; i++) {
                local.set(new User("zhangsan" + i, "address" + i));
            }
            System.gc();
            User user = local.get();
            System.out.println(user);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
