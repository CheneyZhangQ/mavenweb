package com.ssm.service;

import com.ssm.model.UserDTO;

/**
 * Created by zhangqiang on 2017/7/8.
 */
public interface IUserService {

    UserDTO getUser(String id);

    int addUser(UserDTO user);
}
