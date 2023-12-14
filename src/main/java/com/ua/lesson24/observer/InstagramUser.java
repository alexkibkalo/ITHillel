package com.ua.lesson24.observer;

import java.util.ArrayList;
import java.util.List;

public class InstagramUser {
    private String username;
    private List<Follower> followers = new ArrayList<>();

    public InstagramUser(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void subscribe(Follower follower){
        followers.add(follower);
    }

    public void unsubscribe(Follower follower){
        followers.remove(follower);
    }

    public void notifyFollowers(String message){
        for (Follower follower : followers) {
            follower.update(message);
        }
    }
}
