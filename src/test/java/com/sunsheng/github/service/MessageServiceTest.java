package com.sunsheng.github.service;

import com.github.sunsheng.service.MessageService;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by sunsheng1 on 15/9/11.
 */
public class MessageServiceTest {

    private MessageService service;

    @Before
    public void setUp() throws Exception {
        service = new MessageService();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetMessage() throws Exception {
        assertEquals("hello", service.getMessage());
    }
}