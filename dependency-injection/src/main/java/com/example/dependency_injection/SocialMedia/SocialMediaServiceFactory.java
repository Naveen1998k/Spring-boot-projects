package com.example.dependency_injection.SocialMedia;

public class SocialMediaServiceFactory {

    public static SocialMediaService getSocialMediaService(String serviceType) {
        if (serviceType.equalsIgnoreCase("facebook")) {
            return new FacebookService();
        } else if (serviceType.equalsIgnoreCase("instagram")) {
            return new InstagramService();
        } else {
            throw new IllegalArgumentException("Unknown service type: " + serviceType);
        }
    }
}
