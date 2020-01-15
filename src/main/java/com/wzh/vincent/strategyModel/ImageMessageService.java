package com.wzh.vincent.strategyModel;

import org.springframework.stereotype.Service;

/**
 * @ClassName ImageMessageService
 * @Description TODO
 * @Author wuzenghui
 * @Date 2019/12/25 10:53
 */
@Service
@MsgTypeHandler(value = MSG_TYPE.IMAGE)
public class ImageMessageService implements MessageService {

    @Override
    public void handleMessage(MessageInfo messageInfo) {
        System.out.println("处理图片消息 " + messageInfo.getContent());
    }

}
