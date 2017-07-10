package com.biz.controller;/**
 * Created by dell on 2017/7/10.
 */

import com.biz.rabbit.Producer01;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

/**
 * @author
 * @description
 * @create 2017-07-10 13:34
 **/
@RestController
public class GroupChatController {
    @Autowired
    private Producer01 producer01;
    private Scanner scanner = null;

    @RequestMapping("/groupChat")
    public void groupChatTest() {
        scanner = new Scanner(System.in);
        System.out.println("聊天规则：当输入群发信息时，直接按回车发送！");
        System.out.println("当想发送给某些人时，在消息后加上@A@B,在回车发送消息，比如'hello world@A@B'");
        System.out.println("这里设定了只能向A,B,C三个人发送消息");
        System.out.println("输入exit离开消息室");
        System.out.println("请输入你要发送的信息：");
        while(true) {
            String next = scanner.next();
            String[] msgs = next.split("@");
            String msg = msgs[0];
            if ("exit".equals(msg)) {
                System.out.println("欢迎下次加入我们的聊天室");
                break;
            } else if(msgs.length == 1) {
                //实现群发
                producer01.sendAll(msg);
            } else {
                for (int i = 0; i < msgs.length; i++) {
                    if (i == 0) {
                        continue;
                    }
                    String name = msgs[i].toUpperCase();
                    producer01.sendToOne(msg,"person." + name);
                }
                System.out.println("****************华丽的分割线*************");
                //实现特定发送
            }
        }

    }
}
