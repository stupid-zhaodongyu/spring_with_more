package com.it.service.impl;

import com.it.dao.ResourceDao;
import com.it.service.ResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourcesServiceImpl implements ResourcesService {
    @Autowired
    private ResourceDao resourcesDao;

    public boolean openURL(String url, String password) {
        return resourcesDao.readResources(url,password);
    }
}