package com.kodilla.stream.forumuser;


import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUsers = new ArrayList<>();

    public Forum() {
        forumUsers.add(new ForumUser(1,"pudelek21",'F',2001,02,03,17));
        forumUsers.add(new ForumUser(2,"ważniak34",'M',1997,3,13,135));
        forumUsers.add(new ForumUser(3,"slłoik79",'M',1979,12,31,325));
        forumUsers.add(new ForumUser(4,"czarcik99",'F',2002,7,19,33));
        forumUsers.add(new ForumUser(5,"żmijka07",'F',1982,01,29,117));
        forumUsers.add(new ForumUser(6,"albercik111",'M',2010,5,3,2));
        forumUsers.add(new ForumUser(7,"ruda1313",'F',2003,11,11,12));
        forumUsers.add(new ForumUser(8,"wilczek312",'M',1996,2,28,0));
    }

    public List<ForumUser> getForumUsers() {
        return new ArrayList<>(forumUsers);
    }
}
