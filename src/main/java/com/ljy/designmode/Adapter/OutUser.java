package com.ljy.designmode.Adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fengyue
 * @date 2021/11/9
 */
public class OutUser implements IOutUserInfo {

    @Override
    public Map getOutName() {

        Map<String, String> map = new HashMap<>();
        map.put("name","outName");
        return map;
    }

    @Override
    public Map getOutPhone() {
        Map<String, String> map = new HashMap<>();
        map.put("phone","outPhone");
        return map;
    }

    @Override
    public Map getOutAddress() {
        Map<String, String> map = new HashMap<>();
        map.put("address","outAddress");
        return map;
    }
}
