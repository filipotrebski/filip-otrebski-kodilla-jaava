package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userId;
    private final String username;
    private final char userSex;
    private final LocalDate birthDate;
    private final int numberOfPosts;

    public ForumUser(final int userId, final String username, final char userSex
            , final int year, final int month, final int dayOfMonth, final int numberOfPosts) {
        this.userId = userId;
        this.username = username;
        this.userSex = userSex;
        this.birthDate = LocalDate.of(year, month, dayOfMonth);
        this.numberOfPosts = numberOfPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", userSex=" + userSex +
                ", birthDate=" + birthDate +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
