package com.github.sunsheng;


import com.github.sunsheng.service.MessageService;

import org.apache.log4j.Logger;

/**
 * Created by sunsheng1 on 15/9/11.
 */
public class Main {
    public static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        MessageService service = new MessageService();
        String message = service.getMessage();

        LOGGER.info(message);

    }
}
