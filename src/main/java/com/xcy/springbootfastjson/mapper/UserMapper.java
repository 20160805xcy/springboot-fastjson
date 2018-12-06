package com.xcy.springbootfastjson.mapper;

import com.xcy.springbootfastjson.model.User;
import com.xcy.springbootfastjson.util.MyMapper;

public interface UserMapper extends MyMapper<User> {
    User findUserById(Integer id);

}