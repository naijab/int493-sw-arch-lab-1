package com.naijab.int493softwarearch.week1.restapi.repository;

import com.naijab.int493softwarearch.week1.restapi.model.Message;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MessageRepositoryImpl implements MessageRepository {

    public Map<String, Message> messages = new HashMap<>();

    @Override
    public List<Message> findAll() {
        return new ArrayList<>(messages.values());
    }

    @Override
    public Message save(Message message) {
        int count = message.getCount();
        if (messages.containsKey(message.getText())) {
            message.setCount(count+1);
        } else {
            message.setCount(1);
        }
        messages.put(message.getText(), message);
        return message;
    }
}
