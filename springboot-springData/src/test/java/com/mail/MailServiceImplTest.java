package com.mail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by conglin.liu on 2017/10/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MailServiceImplTest {
    @Autowired
    private MailService MailService;

    @Test
    public void testSimpleMail() throws Exception {
        MailService.sendMail("conglin.liu@quantgroup.cn","test simple mail"," hello this is simple mail");
    }
}