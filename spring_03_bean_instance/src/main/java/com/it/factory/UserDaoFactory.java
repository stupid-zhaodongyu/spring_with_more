package com.it.factory;

import com.it.dao.UserDao;
import com.it.dao.impl.UserDaoImpl;

public class UserDaoFactory {
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
