package com.wzh.vincent.strategyModel;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName MessageServiceContext
 * @Description TODO
 * @Author wuzenghui
 * @Date 2019/12/25 11:19
 */
@Component
public class MessageServiceContext {
    private final Map<Integer, MessageService> handlerMap = new HashMap<>();

    public MessageService getMessageService(Integer type) {
        return handlerMap.get(type);
    }

    public void putMessageService(Integer code, MessageService messageService) {
        handlerMap.put(code, messageService);
    }
}
