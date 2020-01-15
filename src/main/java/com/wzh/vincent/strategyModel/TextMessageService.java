package com.wzh.vincent.strategyModel;

import org.springframework.stereotype.Service;

/**
 * @ClassName TextMessageService
 * @Description TODO
 * @Author wuzenghui
 * @Date 2019/12/25 10:53
 */
@Service
@MsgTypeHandler(value = MSG_TYPE.TEXT)
public class TextMessageService  implements MessageService {

    @Override
    public void handleMessage(MessageInfo messageInfo) {
        System.out.println("处理文本消息 " + messageInfo.getContent());
    }

}
