/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution, Exercise 15
 *  Copyright 2021 Mayank Goyal
 */

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  
    Scanner scanner = new Scanner(System.in);

    String pwd = "abc$123";

    System.out.println("What is the password? ");
    String epwd = scanner.nextLine();

    if(pwd.equalsIgnoreCase(epwd))
    {
      System.out.println("Welcome!");
    }
    else
    {
      System.out.println("I don't know you.");
    }
  }
}