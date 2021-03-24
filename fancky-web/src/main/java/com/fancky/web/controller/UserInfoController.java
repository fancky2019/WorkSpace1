package com.fancky.web.controller;

import com.fancky.model.entity.UserInfo;
import com.fancky.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * (UserInfo)表控制层
 *
 * @author fancky
 * @since 2021-03-24 10:00:51
 */
@RestController
@RequestMapping("/userInfo")
public class UserInfoController {
    /**
     * 服务对象
     */
    @Autowired
    private UserInfoService userInfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    public UserInfo selectOne(Integer id) {
        UserInfo userInfo=this.userInfoService.queryById(id);
        return userInfo;
    }

}