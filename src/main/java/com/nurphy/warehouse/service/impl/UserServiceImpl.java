package com.nurphy.warehouse.service.impl;

import com.nurphy.warehouse.mapper.UserMapper;
import com.nurphy.warehouse.pojo.Response;
import com.nurphy.warehouse.pojo.User;
import com.nurphy.warehouse.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *用户服务实现
 * @author Administrator
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public Response<User> addUser(User user) {
        if(userMapper.insert(user)>0){
            return Response.of().setData(user);
        }
        else{
            return Response.of().setCode(500).setMessage("插入用户失败！");
        }
    }

    @Override
    public Response<Boolean> updateUser(User user) {
        return null;
    }
}
