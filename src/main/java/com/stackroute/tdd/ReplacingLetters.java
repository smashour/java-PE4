package com.stackroute.tdd;

//program to replace all d with f and all l with t in the given ​ String

import java.util.Scanner;

public class ReplacingLetters {
    public static void main(String[] args) {
        String s=new String(" ");
        Scanner input=new Scanner(System.in); //scanner function
        System.out.println("Enter the string ");
        s=input.nextLine();
        // replacing all d with f and all l with t in the given ​ String
        System.out.println( s.replaceAll("d","f").replace("l","t"));

    }
}
