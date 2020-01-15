package com.wzh.vincent.controller;

import com.wzh.vincent.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserCroller
 * @Description TODO
 * @Author wuzenghui
 * @Date 2020/1/14 17:50
 */
@RestController
@RequestMapping("/test")
public class UserCroller {

    @Autowired(required = false)
    private UserService userService;
    /***
     * 测试异步风控
     */
    @RequestMapping(value ="/testAutowired",method = RequestMethod.GET)
    public String  testAutowired( String vo) {
        String  s= "" ;
        s = userService.TestAutowired();
        return  s;
    }

}
