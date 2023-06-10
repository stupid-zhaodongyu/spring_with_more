package com.it.service;

import com.it.domain.Account;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface AccountService {
    /**
     * 转账操作
     * @param out 传出方
     * @param in 转入方
     * @param money 金额
     */
    @Transactional
    public void transfer(String out,String in ,Double money) ;
}