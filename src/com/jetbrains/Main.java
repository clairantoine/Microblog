package com.jetbrains;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Creates user objects
        User john = new User("url", "coolGuyJohn", "John", "Doe", "john@gmail.com");
        User mary = new User("url2", "maryMary", "Mary", "Bob", "mary@yahoo.com");
        User joe = new User("url", "JoeJo", "Joe", "Louis", "joe@hockey.com");

        //Creates an list of posts to store each post object
        List<Post> postList = new ArrayList<>();

        //Creates post object without a url
        Post first = new Post(john, "My first post!");

        //Adds the post to the list
        postList.add();

        //Creates a post object with a url
        postList.add(new Post(mary, "My second post", "www.awesome.com"));
        postList.add(new Post(joe, "The third Post"));
        postList.add(new Post(joe, "Another post", "www.google.com"));
        postList.add(new Post(joe, "Joe posts a lot"));

        //Loops through the list of posts, pulling out each post
        //and storing it into a variable. Then prints the results
        //of the toString method.
        for(Post post: postList){
            System.out.println(post.toString());
            System.out.println("");
        }



    }
}

