package com.fancky.service;

import com.fancky.dao.UserInfoMapper;
import com.fancky.model.entity.UserInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {
    private final static Logger logger = LogManager.getLogger(UserInfoService.class);

    @Autowired
    private UserInfoMapper userInfoMapper;

    public UserInfo queryById(Integer id) {

        UserInfo userInfo = this.userInfoMapper.queryById(1);
        return this.userInfoMapper.queryById(id);
    }
}
