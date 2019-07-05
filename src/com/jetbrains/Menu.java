package com.jetbrains;
import java.util.Scanner;

public class Menu
{   private Scanner keyboard;
    System.out.println("Hello! Welcome to MicroBlog.");
    System.out.println("What would you like to do today?");
    System.out.println("1) Create a new user?/n2)Create a new post as the current user/n3)Print all posts/n4)Print all users");
    System.out.println("Enter the number for the option you want to select.");

    int firstChoice = keyboard.nextInt();
    keyboard.skip("/n")

}
