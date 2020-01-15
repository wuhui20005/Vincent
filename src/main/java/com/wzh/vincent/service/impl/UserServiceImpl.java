package com.wzh.vincent.service.impl;

import com.wzh.vincent.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author wuzenghui
 * @Date 2020/1/14 17:49
 */
//@Service
public class UserServiceImpl  implements UserService {

    @Override
    public String TestAutowired() {
        return "test";
    }
}
