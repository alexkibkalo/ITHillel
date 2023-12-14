package com.ua.lesson24.observer;

public class InstagramFollower implements Follower {
    private String username;

    public InstagramFollower(String username) {
        this.username = username;
    }

    @Override
    public void update(String message) {
        System.out.println(message);
    }
}
