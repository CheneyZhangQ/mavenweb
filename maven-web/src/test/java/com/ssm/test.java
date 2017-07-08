package com.ssm;

import com.ssm.model.UserDTO;
import com.ssm.service.IUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zhangqiang on 2017/7/8.
 */
public class test extends BaseTest {

    @Autowired
    private IUserService userService;

    @Test
    public void addUser() {
        UserDTO user = new UserDTO();
        user.setPassword("qwer1234");
        user.setUsername("测试账号");
        System.out.println(userService.addUser(user));
    }
}
