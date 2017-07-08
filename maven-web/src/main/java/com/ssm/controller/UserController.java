package com.ssm.controller;

import com.ssm.model.UserDTO;
import com.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zhangqiang on 2017/7/8.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request, Model model){
        String userId = request.getParameter("id");
        UserDTO user = userService.getUser(userId);
        model.addAttribute("user", user);
        return "showUser";
    }
}
