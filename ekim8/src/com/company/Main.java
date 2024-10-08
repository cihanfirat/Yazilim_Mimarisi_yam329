package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        User user1 = new User();
        User user2 = new User();*/

        User user1 = User.getUser();
        System.out.println(user1);

        User user2 = User.getUser();
        System.out.println(user2);
    }
}
