package com.ua.lesson24.observer;

public class ObserverMain {
    public static void main(String[] args) {
        InstagramUser user = new InstagramUser("ALEX");

        Follower follower1 = new InstagramFollower("aaaaa");
        Follower follower2 = new InstagramFollower("bbbbb");
        Follower follower3 = new InstagramFollower("ccccc");
        Follower follower4 = new InstagramFollower("ddddd");
        Follower follower5 = new InstagramFollower("eeeee");

        user.subscribe(follower1);
        user.subscribe(follower2);
        user.subscribe(follower3);
        user.subscribe(follower4);
        user.subscribe(follower5);

        user.notifyFollowers(user.getUsername() + " added subscribers");
    }
}
