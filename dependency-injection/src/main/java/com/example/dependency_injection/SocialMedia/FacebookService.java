package com.example.dependency_injection.SocialMedia;

public class FacebookService implements SocialMediaService
{

    @Override
    public void getUserFeeds()
    {
        System.out.println("user feeds loaded from facebook ...");
    }


}
