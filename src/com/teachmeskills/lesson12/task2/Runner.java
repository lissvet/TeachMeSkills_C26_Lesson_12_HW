package com.teachmeskills.lesson12.task2;

import com.teachmeskills.lesson12.task2.service.TextAnalyzer;

import java.util.Scanner;
/**The program receives an arbitrary text as input.
 * This text may contain a document number (one or more), e-mail and phone number.
 * The document number is in the format: xxxx-xxxxxx-xxxx, where x is any digit;
 * phone number in the format: +(xx)xxxxxxxxxx.
 * The document may not contain all the information, for example, it may not contain the phone number, or other.
 * It is necessary to find this information and output it to the console in the format:
 email: teachmeskills@gmail.com
 document number: 1423-1512-51 **/
public class Runner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter text that may contain emails, phone and document numbers:");
        String userText = scan.nextLine();
        TextAnalyzer.checkEmailPhoneDocNumber(userText);
    }

}
