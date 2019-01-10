package com.ncepu.jdbc.service;

import com.ncepu.jdbc.bean.Message;
import com.ncepu.jdbc.dao.MessageDAO;

import java.util.List;

public class MessageService {

    private MessageDAO messageDAO;

    public MessageService(){
        messageDAO = new MessageDAO();
    }

    public List<Message> getMessages(int page,int pageSize) {
        return messageDAO.getMessages(page,pageSize);
    }

    public int countMessages(){
        return messageDAO.countMessages();
    }
}
