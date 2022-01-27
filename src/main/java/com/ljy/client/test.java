package com.ljy.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.jws.soap.SOAPBinding.Use;

/**
 * @author fengyue
 * @date 2021/11/29
 */
public class test {

    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();

        User user2 = new User();
        user2.setName("name6");
        users.add(user2);

        for (int i=1;i<5;i++){
            User user = new User();
            user.setId(i);
            user.setName("name"+i);
            users.add(user);
        }

        User user1 = new User();
        user1.setName("name5");
        users.add(user1);

        Collections.sort(users,Comparator.comparing(User::getId));
        

        System.out.println(1);;

    }



}
