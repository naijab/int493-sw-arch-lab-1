package com.naijab.int493softwarearch.week1.restapi.controller;

import com.naijab.int493softwarearch.week1.restapi.model.Message;
import com.naijab.int493softwarearch.week1.restapi.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessageController {

    @Autowired
    private MessageRepository messageRepository;

    @Cacheable("messages")
    @GetMapping
    public List<Message> findAll() {
       return messageRepository.findAll();
    }

    @Cacheable("messages")
    @PostMapping
    public Message save(@Validated @RequestBody Message message) {
        return messageRepository.save(message);
    }

}
