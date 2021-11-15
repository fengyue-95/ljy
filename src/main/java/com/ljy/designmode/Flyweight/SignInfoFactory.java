package com.ljy.designmode.Flyweight;

import java.util.HashMap;

import sun.misc.Cache;

/**
 * @author fengyue
 * @date 2021/11/15
 */
public class SignInfoFactory {

    private static HashMap<String, SignInfo> cache = new HashMap<>();

    @Deprecated
    public static SignInfo getSignInfo() {
        return new SignInfo();
    }

    public static SignInfo getSignInfo(String key) {
        SignInfo result = null;
        if (cache.containsKey(key)) {
            cache.get(key);
        } else {
            result = new SignInfo4Pool(key);
            cache.put(key, result);
        }
        return result;
    }

}
