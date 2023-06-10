package com.it.service.impl;

import com.it.dao.AccountDao;
import com.it.domain.Account;
import com.it.service.AccountService;
import com.it.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;
    @Autowired
    private LogService logService;

    public void transfer(String out,String in ,Double money) throws IOException {
        try {
            accountDao.outMoney(out,money);
            int i = 1/0;
            accountDao.inMoney(in,money);
        }finally {
            logService.log(out,in,money);
        }
    }

}
