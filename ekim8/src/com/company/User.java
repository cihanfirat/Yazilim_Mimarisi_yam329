package com.company;
//singleton(tek kopya) desenine uygun olarak olusturulacak
public class User {
    static User user;

    private User(){

    }

    public static User getUser(){
        if(user==null){
            user = new User();
        }return user;
    }

    public User getUser2(){
        return user;
    }
}
