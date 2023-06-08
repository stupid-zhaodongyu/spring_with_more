package com.it.factory;

import com.it.dao.OrderDao;
import com.it.dao.impl.OrderDaoImpl;

public class OrderDaoFactory {
    public static OrderDao getOrderDao() {
        return new OrderDaoImpl();
    }
}
