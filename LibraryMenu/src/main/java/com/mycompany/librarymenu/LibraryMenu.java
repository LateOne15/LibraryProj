/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.librarymenu;

import java.util.Scanner;
/**
 *
 * @author 30128198
 */
public class LibraryMenu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int keyIn = -1;
        
        System.out.println("Welcome to the library system!");
        while (keyIn != 0) {
            System.out.println("Library System Menu:");
            System.out.println("1. Borrow a book");
            System.out.println("2. Return a book");
            System.out.println("3. View catalogue");
            System.out.println("4. Pay late fees");
            System.out.println("0. Exit program");
            System.out.print("Please input your choice: ");
            keyIn = sc.nextInt();
            switch(keyIn){
                case 0 -> {
                    System.out.println("Thank you for stopping by!");
                }
                case 1 -> {
                    System.out.println("Please enjoy your book!");
                }
                case 2 -> {
                    System.out.println("Thank you for returning this book.");
                }
                case 3 -> {
                    System.out.println("Here is our selection:");
                    System.out.println("Indentation and you - by Me");
                    System.out.println("Joke options and where not to use them - by You");
                    System.out.println("That concludes our catalogue.");
                }
                case 4 -> {
                    System.out.println("Thank you for paying the fees.");
                    System.out.println("We encourage you to not let your books become overdue next time.");
                }
                default -> {
                    System.out.println("That is not a valid option.");
                }
            }
        }
    }
}
