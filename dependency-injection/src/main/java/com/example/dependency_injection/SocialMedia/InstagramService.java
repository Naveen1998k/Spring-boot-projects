package com.example.dependency_injection.SocialMedia;

public class InstagramService implements SocialMediaService
{

    @Override
    public void getUserFeeds()
    {
        System.out.println("user feeds loaded from instagram ...");
    }



}
