package com.kodilla.exception.test;

public class SecondChallenge {

    public String probablyIWillThrowException(double x, double y) throws Exception {

        if(x >= 2 || x < 1 || y == 1.5) {
            throw new Exception();
        }
        return "Done!";
    }

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {

            secondChallenge.probablyIWillThrowException(2,1);

        } catch (Exception e) {

            System.out.println("One or both of the parameters are wrong");

        } finally {

            System.out.println("It's done or not, this is finally the end");

        }

    }
}
