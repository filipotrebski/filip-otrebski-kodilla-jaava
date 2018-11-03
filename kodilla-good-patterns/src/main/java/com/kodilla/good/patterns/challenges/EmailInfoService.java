package com.kodilla.good.patterns.challenges;

public class EmailInfoService implements InformationService{
    @Override
    public void inform(User user) {
        System.out.println("Sending email to :"  + user.getEmail());
        System.out.println("Dear " + user.getUsername() + " your ordering process is finished");
    }
}
