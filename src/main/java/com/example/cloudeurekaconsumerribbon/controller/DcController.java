package com.example.cloudeurekaconsumerribbon.controller;

import com.example.cloudeurekaconsumerribbon.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: czw
 * @Date: 2018-11-30 11:07
 **/
@RestController
public class DcController {

    @Autowired
    private ConsumerService consumer;

    @GetMapping("/consumer")
    public String dc() {
        return consumer.consumer();
    }

}
