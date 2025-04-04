package com.example.dependency_injection.SocialMedia;

public class UserServices {

    public void displayFeeds()
    {
        //Approach 1: Using the class directly
        SocialMediaApp serivce = new SocialMediaApp();
        //serivce.getUserFeeds();

        FacebookService facebookService = new FacebookService();
        //facebookService.getUserFeeds();

        InstagramService instagramService = new InstagramService();
        //instagramService.getUserFeeds();

        //Approach 2: Using the interface
        SocialMediaService socialMediaService = new InstagramService();
       // socialMediaService.getUserFeeds();


        //Approach 3: Using the factory
        SocialMediaService socialMediaService1 = SocialMediaServiceFactory.getSocialMediaService("instagram");
        socialMediaService1.getUserFeeds();

    }

    public static void main(String[] args) {
        UserServices userServices = new UserServices();
        userServices.displayFeeds();
    }
}
