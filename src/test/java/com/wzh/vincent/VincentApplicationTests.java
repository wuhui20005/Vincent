package com.wzh.vincent;

import com.wzh.vincent.strategyModel.MSG_TYPE;
import com.wzh.vincent.strategyModel.MessageInfo;
import com.wzh.vincent.strategyModel.MessageService;
import com.wzh.vincent.strategyModel.MessageServiceContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VincentApplicationTests {

    @Autowired
    MessageServiceContext messageServiceContext;
    @Test
    public void contextLoads() {
        // 构建一个文本消息
        MessageInfo messageInfo = new MessageInfo(MSG_TYPE.IMAGE.code, "消息内容");
        MessageService messageService = messageServiceContext.getMessageService(messageInfo.getType());
        // 处理文本消息 消息内容
        // 可以看到文本消息被文本处理类所处理
        messageService.handleMessage(messageInfo);
    }

}
