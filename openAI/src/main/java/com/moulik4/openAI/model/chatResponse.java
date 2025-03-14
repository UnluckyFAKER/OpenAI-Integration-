package com.moulik4.openAI.model;

import java.util.List;

public class chatResponse {
    private List<Choice> choices;

    public chatResponse(List<Choice> choices) {
        this.choices = choices;
    }

    public List<Choice> getChoices() {
        return choices;
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }

    public static class Choice{

        int index;
        private chatMsg message;

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public chatMsg getMessage() {
            return message;
        }

        public void setMessage(chatMsg message) {
            this.message = message;
        }

        public Choice(int index, chatMsg message) {
            this.index = index;
            this.message = message;
        }
    }
}
