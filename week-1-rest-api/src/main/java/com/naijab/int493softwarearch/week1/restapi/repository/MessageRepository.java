package com.naijab.int493softwarearch.week1.restapi.repository;

import com.naijab.int493softwarearch.week1.restapi.model.Message;

import java.util.List;

public interface MessageRepository {
    List<Message> findAll();

    Message save(Message message);
}
