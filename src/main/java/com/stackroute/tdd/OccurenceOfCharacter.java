//program to count the total number of occurrences of a given character in a ​ string
//without using any loop


package com.stackroute.tdd;
import java.util.Scanner;

public class OccurenceOfCharacter {
    public static void main(String[] args) {
        String s=new String(" ");
        Scanner input=new Scanner(System.in); //scanner function
        System.out.println("Enter the string ");
        s=input.nextLine();
        System.out.println("enter the character"); //entering character to find its occurrences
        String ch=input.next();
        int count=s.length()-s.replaceAll(ch,"").length(); //finding total no. of occurrences
        System.out.println(count);
    }
}
