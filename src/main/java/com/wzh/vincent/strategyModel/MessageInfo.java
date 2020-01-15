package com.wzh.vincent.strategyModel;

/**
 * @ClassName MessageInfo
 * @Description TODO
 * @Author wuzenghui
 * @Date 2019/12/25 10:51
 */
public class MessageInfo {
    // 消息类型
    private int type;
    // 消息内容
    private String content;

    public MessageInfo(int type, String content) {
        this.type = type;
        this.content = content;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
