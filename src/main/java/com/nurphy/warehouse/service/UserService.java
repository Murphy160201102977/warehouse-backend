package com.nurphy.warehouse.service;

import com.nurphy.warehouse.pojo.Response;
import com.nurphy.warehouse.pojo.User;

/**
 * TODO
 *
 * @author lianekai
 * @version: 1.0
 * @date 2021/04/13 01:07
 */
public interface UserService {
    /**
     * 增加用户
     * @param user
     * @return
     */
    Response<User> addUser(User user);
    /**
     * 增加用户
     * @param user
     * @return
     */


    Response<Boolean> updateUser(User user);

    Response<User> getUser();
}
