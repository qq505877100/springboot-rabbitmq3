package com.biz;/**
 * Created by dell on 2017/7/10.
 */

import com.biz.rabbit.Producer01;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Scanner;

/**
 * @author
 * @description
 * @create 2017-07-10 13:04
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitTest {

   /* @Test
    public void groupChatTest() {
    }*/

    @Test
    public void test1() {
        String msg = "kkkk";
        String[] msgs = msg.split("@");
        for (String s : msgs) {
            System.out.println(s);
        }
        System.out.println("********************");
        msg = "sdsdsds@dsd@dsd";
        msgs = msg.split("@");
        for (String s : msgs) {
            System.out.println(s);
        }
    }
}
