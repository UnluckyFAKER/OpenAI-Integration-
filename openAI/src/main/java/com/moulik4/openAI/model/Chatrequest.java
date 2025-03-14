package com.moulik4.openAI.model;

import java.util.ArrayList;
import java.util.List;

public class Chatrequest {
    private String model;
    private List<chatMsg> messages;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<chatMsg> getMessages() {
        return messages;
    }

    public void setMessages(List<chatMsg> messages) {
        this.messages = messages;
    }

    public Chatrequest(String model, String prompt) {
        this.model = model;
        this.messages = new ArrayList<chatMsg>();
        this.messages.add(new chatMsg("user",prompt));
    }
}
