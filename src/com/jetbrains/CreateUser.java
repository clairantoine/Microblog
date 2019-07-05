package com.jetbrains;
import java.util.Scanner;

public class CreateUser
{   private Scanner keyboard;

    // Creates a new user and gets user info from user
    private User newUser(){
        User user = new User(); //creates an OBJECT called "user"
        System.out.println("Great, let's make a new user account for you. Just answer some questions:");
        System.out.println("What's your avatar URL?");
        user.setAvatarUrl(keyboard.nextLine());

        System.out.println("What's your Username?");
        user.setUsername(keyboard.nextLine());

        System.out.println("What's your first name?");
        user.setFirstName(keyboard.nextLine());

        System.out.println("What's your last name?");
        user.setLastName(keyboard.nextLine());

        System.out.println("What's your email?");
        user.setEmail(keyboard.nextLine());
        return new User("", "", "", "", "");
    }


}
