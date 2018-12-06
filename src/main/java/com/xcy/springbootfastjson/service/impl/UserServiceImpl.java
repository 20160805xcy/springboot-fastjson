package com.xcy.springbootfastjson.service.impl;

import com.xcy.springbootfastjson.mapper.UserMapper;
import com.xcy.springbootfastjson.model.User;
import com.xcy.springbootfastjson.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xcy
 * @date 2018/12/04 9:56
 * @description UserServiceImpl
 * @since V1.0.0
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> listAll() {
        return userMapper.selectAll();
    }

    @Override
    public User findUserById(Integer id) {
        return userMapper.findUserById(id);
    }
}
