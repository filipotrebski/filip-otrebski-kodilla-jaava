package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    @Test
    public void testCalculatedStatisticsZeroPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(10);
        List<String> users = new ArrayList<>();
        users.add("user1");
        users.add("user2");
        when(statisticsMock.userNames()).thenReturn(users);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0,forumStatistics.getPostsPerUser(),0.001);
        Assert.assertEquals(0,forumStatistics.getCommentsPerPost(),0.001);
        Assert.assertEquals(5,forumStatistics.getCommentsPerUser(),0.001);
    }


    @Test
    public void testCalculateStatisticsThousandPosts(){
        //Given
        Statistics statisticsMock =mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(10);
        List<String> users = new ArrayList<>();
        users.add("user1");
        users.add("user2");
        when(statisticsMock.userNames()).thenReturn(users);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(500,forumStatistics.getPostsPerUser(),0.001);
        Assert.assertEquals(0.01,forumStatistics.getCommentsPerPost(),0.001);
        Assert.assertEquals(5,forumStatistics.getCommentsPerUser(),0.001);
    }

    @Test
    public void testCalculateStatisticsZeroComments(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(0);
        List<String> users = new ArrayList<>();
        users.add("user1");
        users.add("user2");
        when(statisticsMock.userNames()).thenReturn(users);
        //Given
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(5,forumStatistics.getPostsPerUser(),0.01);
        Assert.assertEquals(0,forumStatistics.getCommentsPerPost(),0.01);
        Assert.assertEquals(0,forumStatistics.getCommentsPerUser(),0.01);
    }

    @Test
    public void testCalculateStatisticsMorePostsThenComments(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(25);
        List<String> users = new ArrayList<>();
        users.add("user1");
        users.add("user2");
        when(statisticsMock.userNames()).thenReturn(users);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(50,forumStatistics.getPostsPerUser(),0.001);
        Assert.assertEquals(0.25,forumStatistics.getCommentsPerPost(),0.001);
        Assert.assertEquals(12.5,forumStatistics.getCommentsPerUser(),0.001);
    }

    @Test
    public void testCalculateStatisticsMoreCommentsThenPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(25);
        when(statisticsMock.commentsCount()).thenReturn(100);
        List<String> users =  new ArrayList<>();
        users.add("user1");
        users.add("user2");
        when(statisticsMock.userNames()).thenReturn(users);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(12.5,forumStatistics.getPostsPerUser(),0.001);
        Assert.assertEquals(4,forumStatistics.getCommentsPerPost(),0.001);
        Assert.assertEquals(50,forumStatistics.getCommentsPerUser(),0.001);
    }

    @Test
    public void testCalculateStatisticsZeroUsers(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(10);
        List<String> users =  new ArrayList<>();
        when(statisticsMock.userNames()).thenReturn(users);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0,forumStatistics.getPostsPerUser(),0.001);
        Assert.assertEquals(1,forumStatistics.getCommentsPerPost(),0.001);
        Assert.assertEquals(0,forumStatistics.getCommentsPerUser(),0.001);
    }

    @Test
    public void testCalculateSatistics100Users(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(100);
        List<String> users = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            String user = "user" + (i+1);
            users.add(user);
        }
        when(statisticsMock.userNames()).thenReturn(users);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(1,forumStatistics.getPostsPerUser(),0.01);
        Assert.assertEquals(1,forumStatistics.getCommentsPerPost(),0.01);
        Assert.assertEquals(1,forumStatistics.getCommentsPerUser(),0.01);
    }
}
