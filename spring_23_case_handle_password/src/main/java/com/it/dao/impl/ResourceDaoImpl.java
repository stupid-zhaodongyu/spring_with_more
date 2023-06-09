package com.it.dao.impl;

import com.it.dao.ResourceDao;
import org.springframework.stereotype.Repository;

@Repository
public class ResourceDaoImpl implements ResourceDao {
    public boolean readResources(String url, String password) {
        System.out.println(password.length());
        //模拟校验
        return password.equals("root");
    }
}
