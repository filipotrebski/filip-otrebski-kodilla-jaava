package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private int numberOfUsers; //liczbę użytkowników,
    private int numberOfPosts; //liczbę postów,
    private int numberOfComments; //liczbę komentarzy,
    private double postsPerUser; //średnią liczbę postów na użytkownika,
    private double commentsPerUser;//średnią liczbę komentarzy na użytkownika,
    private double commentsPerPost;//średnią liczbę komentarzy na post// .
    private Statistics statistics;

    public void calculateAdvStatistics(Statistics statistics){
        this.statistics = statistics;
        numberOfUsers = statistics.userNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        if(numberOfPosts>0) {
            commentsPerPost = (double) numberOfComments / numberOfPosts;
        } else {
            commentsPerPost = 0.0;
        }
        if (numberOfUsers > 0) {
            postsPerUser = (double) numberOfPosts / numberOfUsers;
            commentsPerUser = (double) numberOfComments / numberOfUsers;
        } else {
            postsPerUser = 0.0;
            commentsPerUser = 0.0;
        }
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }
}
