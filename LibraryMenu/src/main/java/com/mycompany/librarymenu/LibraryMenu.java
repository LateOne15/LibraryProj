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
        int keyIn = 0;
        
        System.out.println("Overview of menu options");
        keyIn = sc.nextInt();
        switch(keyIn){
            case 0 -> {
                System.out.println("Menu A");
            }
            case 1 -> {
                System.out.println("Menu B");
            }
            case 2 -> {
                System.out.println("Menu C");
            }
            case 3 -> {
                System.out.println("Menu D");
            }
        }
    }
}
