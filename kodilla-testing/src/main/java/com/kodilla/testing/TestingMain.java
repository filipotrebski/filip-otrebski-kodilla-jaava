package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        Calculator calculator = new Calculator();

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        int addresult = calculator.add(5,7);
        int substractResult = calculator.substract(17,13);

        if (addresult == 12) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        if (substractResult == 4) {
            System.out.println("test OK");
        } else{
            System.out.println("Error!");
        }


    }
}
