package com.biz;/**
 * Created by dell on 2017/7/10.
 */

import com.biz.hello.Producer1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author
 * @description
 * @create 2017-07-10 11:27
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestHello {

    @Autowired
    private Producer1 producer1;

    @Test
    public void test1() {
        producer1.send1();
    }
}
