package com.fantsey.service;

import com.fantsey.entity.TUser;
import com.fantsey.mapper.TUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author fantsey
 * @date 2019/6/24
 */
@Component
public class UserService {

    @Autowired
    private TUserMapper userMapper;

    public TUser findByUserId(String userId){
        return userMapper.selectByPrimaryKey(userId);
    }



}
