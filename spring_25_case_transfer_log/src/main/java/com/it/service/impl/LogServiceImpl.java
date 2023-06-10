package com.it.service.impl;

import com.it.dao.LogDao;
import com.it.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private LogDao logDao;
    @Transactional
    public void log(String out, String in,Double money) {
        logDao.log("转载操作从" + out + "到" + in + "金额为" + money);
    }
}
