package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User mike = new Millenials("Michael Jordan");
        User paul = new YGeneration("Paul Walker");
        User steve = new ZGeneration("Stephen King");

        //Then
        String mikesPost = mike.sharePost();
        System.out.println("Mike: " + mikesPost);
        String paulPost = paul.sharePost();
        System.out.println("Paul: " + paulPost);
        String stevenPost = steve.sharePost();
        System.out.println("Steven: " + stevenPost);

        //Then
        Assert.assertEquals("Facebook post",mikesPost);
        Assert.assertEquals("This is tweet",paulPost);
        Assert.assertEquals("Snapchat post",stevenPost);
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User mike = new Millenials("Michael Jordan");

        //When
        String mikePost = mike.sharePost();
        System.out.println("Mike: "+ mikePost);
        mike.setSocialPublisher(new SnapchatPublisher());
        mikePost = mike.sharePost();
        System.out.println("Mike: "+ mikePost);

        //Then
        Assert.assertEquals("Snapchat post",mikePost);
    }

}
