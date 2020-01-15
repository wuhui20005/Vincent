package com.wzh.vincent.strategyModel;

import java.lang.annotation.*;

/**
 *@ClassName MsgTypeHandler
 *@Description TODO
 *@Author wuzenghui
 *@Date 2019/12/25 11:20
 */ 

@Documented
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MsgTypeHandler {
    MSG_TYPE value();
}
