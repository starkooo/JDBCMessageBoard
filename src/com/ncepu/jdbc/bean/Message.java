package com.ncepu.jdbc.bean;

import java.util.Date;

public class Message {

    private long id;

    private long user_id;

    private String username;

    private String title;

    private String content;

    private Date createTime;

    public Message(long id, long user_id, String username, String title, String content, Date createTime) {
        this.id = id;
        this.user_id = user_id;
        this.username = username;
        this.title = title;
        this.content = content;
        this.createTime = createTime;
    }

    public Message( long user_id, String username, String title, String content) {
        this.user_id = user_id;
        this.username = username;
        this.title = title;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
