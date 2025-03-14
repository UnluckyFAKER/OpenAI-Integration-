package com.moulik4.openAI.model;

import java.util.List;

public class chatMsg {
    private String role;
    private String content;

    public chatMsg(String role, String content) {
        this.role = role;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
