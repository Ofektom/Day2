package org.example.day2;


import org.example.day2.library.Book;

public class DayTwo {
    public static void main(String[] args) {
//        String welcome = new String();
//        String welcome2 = new String("Hello");
//        welcome = "Hi || ";
//        System.out.println(welcome + welcome2 + " || You're welcome");
//
        Book libraryBook = new Book();
        libraryBook.setTheName("Spider Man");
        String name = libraryBook.getTheName();
        System.out.println(name);
    }

}
