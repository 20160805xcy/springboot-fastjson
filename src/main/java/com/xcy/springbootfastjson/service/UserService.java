package com.xcy.springbootfastjson.service;

import com.xcy.springbootfastjson.model.User;

import java.util.List;

/**
 * @author xcy
 * @date 2018/12/04 9:53
 * @description UserService
 * @since V1.0.0
 */
public interface UserService {
    List<User> listAll();

    User findUserById(Integer id);
}
