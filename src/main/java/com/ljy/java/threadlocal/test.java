package com.ljy.java.threadlocal;

/**
 * @author fengyue
 * @date 2021/5/5
 */
public class test {

    public static final Integer SIZE  = 20;

    static ThreadLocal<String>    local = new ThreadLocal();

    public static void main(String[] args) {

        //try {
        //    for (int i = 0; i < SIZE; i++) {
        //        local.set(new User("zhangsan" + i, "address" + i));
        //    }
        //    System.gc();
        //    User user = local.get();
        //    System.out.println(user);
        //
        //} catch (Exception e) {
        //    e.printStackTrace();
        //}

        //new Thread(new Runnable() {
        //    @Override public void run() {
        //        local.set("zhan高三");
        //    }
        //}).start();
        //
        //new Thread(new Runnable() {
        //    @Override public void run() {
        //        local.set("zhan高二");
        //    }
        //}).start();
        for(int i=0;i<10000;i++){
            local.set(Math.random()+"ha");
        }




        String s = local.get();
        System.out.println(s);

    }

}
