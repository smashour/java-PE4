//a program that ​ sets​ up a ​ String​ variable containing a paragraph of text of your choice.
//a. Extract the words from the text and sort them into alphabetical order.
//b. Display the sorted list of words.

package com.stackroute.tdd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortingWords {
    public static void main(String[] args) {

        System.out.println("Enter the string ");
        Scanner input=new Scanner(System.in); //scanner function
        String paragraph=input.nextLine(); //entering paragraph
        ArrayList<String> words=new ArrayList<String>(); //storing words into arraylist
        for(String word: paragraph.split(" ")) {

            words.add(word);
        }
        Collections.sort(words); //sorting words

        /* Sorted List*/
        System.out.println("After Sorting:");
        System.out.println(words);


    }
}
