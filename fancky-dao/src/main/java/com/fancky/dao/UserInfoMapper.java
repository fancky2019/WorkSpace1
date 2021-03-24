package com.fancky.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fancky.model.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * (UserInfo)表数据库访问层
 *
 * @author fancky
 * @since 2021-03-24 09:47:31
 */
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserInfo queryById(Integer id);



    /**
     * 通过实体作为筛选条件查询
     *
     * @param userInfo 实例对象
     * @return 对象列表
     */
    List<UserInfo> queryAll(UserInfo userInfo);

    /**
     * 新增数据
     *
     * @param userInfo 实例对象
     * @return 影响行数
     */
    int insert(UserInfo userInfo);

    /**
     * 修改数据
     *
     * @param userInfo 实例对象
     * @return 影响行数
     */
    int update(UserInfo userInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}