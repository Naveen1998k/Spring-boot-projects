package com.example.dependency_injection.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserApp
{
    @Autowired
    @Qualifier("tiktokService")
    private SocialMediaApp socialMediaApp;

    public void getUserFeeds()
    {
        socialMediaApp.getUserFeeds();
    }

}
