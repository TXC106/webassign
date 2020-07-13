package com.qz.controller;

import com.qz.pojo.User;
import com.qz.service.UserService;
import com.qz.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")

public class userController {
    //controller层调用service层
    @Autowired
    //括号中填写-service中的beanID
    @Qualifier("UserServiceImp")
    private UserService userService = new UserServiceImp();
    //查询商家展示
    @RequestMapping("/alluser")
    public String list(Model model){
        List<User> list = userService.queryAllUser();
        model.addAttribute("list",list);
        return "alluser";
    }
    @RequestMapping("/getusers")
    @ResponseBody
    public List<User> queryAllUser() {
        List<User> list = userService.queryAllUser();
//        User list = userService.queryUserById(1);

//        HashMap list = new HashMap();
//        list.put("users",userService.queryAllUser());

//        Gson gson = new Gson();
//        String json = gson.toJson(list);
//        return json;
        return list;
    }
}

