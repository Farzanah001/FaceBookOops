package com.facebook;

public class MethodDeclaration implements MainMethods{
    @Override
    public void homeFeed() {
        System.out.println("You're viewing the Home Feed.");
    }

    @Override
    public void addStory() {
        System.out.println("New Story Added.");
    }

    @Override
    public void viewStory() {
        System.out.println("You're viewing a Story.");
    }

    @Override
    public void likePost() {
        System.out.println("Post Liked!");
    }

    @Override
    public void commentPost() {
        System.out.println("Comment Posted!");
    }

    @Override
    public void sharePost() {
        System.out.println("Post Shared!");
    }

    @Override
    public void requestFriend() {
        System.out.println("Friend Request Sent!");
    }

    @Override
    public void acceptFriendAccept() {
        System.out.println("Friend Request Accepted!");
    }

    @Override
    public void sendMessage() {
        System.out.println("Message Sent!");
    }

    @Override
    public void receiveMessage() {
        System.out.println("You received a New Message!");
    }
}
