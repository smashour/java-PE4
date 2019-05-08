//program to find out the multiple occurrences of the given word in a ​ string​ using Matcher methods


package com.stackroute.tdd;
import java.util.Scanner;
import java.util.regex.*;
public class Matching {
    public static void main(String[] args) {

        System.out.println("Enter the string ");
        Scanner input = new Scanner(System.in); //scanner function
        String paragraph = input.nextLine();
        System.out.println("Enter the word to search");

        String string = input.next();
        Pattern pattern = Pattern.compile(string);
        Matcher matcher = pattern.matcher(paragraph);

        while (matcher.find()) {
            System.out.println("Found at: " + matcher.start() //print the start and end index of string
                    +
                    " - " + matcher.end());
        }
    }
}
