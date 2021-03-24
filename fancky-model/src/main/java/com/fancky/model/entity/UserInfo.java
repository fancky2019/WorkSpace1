package com.fancky.model.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * (UserInfo)实体类
 *
 * @author fancky
 * @since 2021-03-24 09:44:35
 */
@Getter
@Setter
public class UserInfo implements Serializable {
    private static final long serialVersionUID = -67400312429463546L;
    
    private Integer id;
    /**
    * 姓名
    */
    private String userName;
    
    private Integer userAge;
    
    private String address;
    /**
    * bi
    */
    private LocalDateTime birthday;
    
    private Boolean isDelete;

}