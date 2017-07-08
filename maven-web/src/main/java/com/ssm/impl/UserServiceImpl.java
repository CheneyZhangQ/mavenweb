package com.ssm.impl;

import com.ssm.dao.UserMapper;
import com.ssm.model.User;
import com.ssm.model.UserDTO;
import com.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhangqiang on 2017/7/8.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 查询用户信息
     * @param id
     * @return
     */
    @Override
    public UserDTO getUser(String id){
        User user = userMapper.selectByPrimaryKey(Integer.parseInt(id));
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setPassword(user.getPassword());
        userDTO.setUsername(user.getUsername());
        return userDTO;
    }

    /**
     * 添加用户信息
     * @param user
     * @return
     */
    @Override
    public int addUser(UserDTO user){
        User userDTO = new User();
        userDTO.setId(user.getId());
        userDTO.setPassword(user.getPassword());
        userDTO.setUsername(user.getUsername());
        return userMapper.insert(userDTO);
    }
}
