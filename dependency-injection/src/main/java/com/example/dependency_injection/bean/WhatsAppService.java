package com.example.dependency_injection.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class WhatsAppService implements SocialMediaApp {

    @Override
    public void getUserFeeds() {
        System.out.println("WhatsApp user feeds");
    }
}
