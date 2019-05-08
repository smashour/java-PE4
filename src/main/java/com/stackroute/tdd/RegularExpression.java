//a program with the implementation of ​ Regular Expression​ to find the presence of the name
//Harry in a ​ string​


package com.stackroute.tdd;
import java.util.Scanner;
public class RegularExpression {
    Scanner scan;
    public static void main(String args[])
    {
       RegularExpression name=new RegularExpression();
        name.findName();
    }
    public void findName()
    {
        scan= new Scanner(System.in); //scanner function
        System.out.println("Enter a String");
        String text=scan.nextLine();
        System.out.printf("Is Harry Here?");
        boolean result=text.matches("(?s).*\\bHarry\\b.*"); //check wheather Harry is there in the string or not
        if(result)
            System.out.println("True");
        else
            System.out.println("False");
    }
}