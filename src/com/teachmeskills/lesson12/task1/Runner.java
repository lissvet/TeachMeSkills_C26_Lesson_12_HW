package com.teachmeskills.lesson12.task1;

import com.teachmeskills.lesson12.task1.service.TextAnalyzer;

import java.util.Scanner;
/** Output to the console from the string that the user enters from the keyboard all the abbreviations.
 * An abbreviation will be a word from 2 to 6 characters, consisting only of capital letters, without numbers.*/
public class Runner {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter line with any abbreviations: ");
        String userString = scan.nextLine();
        TextAnalyzer.checkAbbreviation(userString);
    }

}

