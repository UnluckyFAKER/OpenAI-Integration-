package com.moulik4.openAI.Controller;

import com.moulik4.openAI.model.Chatrequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.moulik4.openAI.model.chatResponse;
import com.moulik4.openAI.model.Chatrequest;

@RestController
@RequestMapping("AI")
public class Maincontroller {
    @Autowired
    RestTemplate restTemplate;
    @PostMapping("apihit")
    public String getans(@RequestBody String promt){
        Chatrequest chatrequest=new Chatrequest("gpt-4o-mini",promt);
        chatResponse cR= restTemplate.postForObject("https://api.openai.com/v1/chat/completions",chatrequest,chatResponse.class);
        return cR.getChoices().get(0).getMessage().getContent();
    }

}
