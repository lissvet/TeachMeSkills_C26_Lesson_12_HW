package com.teachmeskills.lesson12.task2.service;

import com.teachmeskills.lesson12.task2.utils.Const;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextAnalyzer {

    public static void checkEmailPhoneDocNumber(String userText){
        Pattern doc = Pattern.compile(Const.DOCUMENT_REGEXP);
        Pattern phone = Pattern.compile(Const.PHONE_NUMBER_REGEXP);
        Pattern email = Pattern.compile(Const.EMAIL_REGEXP);
        Matcher verificationDoc = doc.matcher(userText);
        Matcher verificationPhone = phone.matcher(userText);
        Matcher verificationEmail = email.matcher(userText);

        if(verificationDoc.find()){
            int counter = 1;
            System.out.println("Document number " + counter + ": " + verificationDoc.group());
            while(verificationDoc.find()){
                counter++;
                System.out.println("Document number "+ counter + ": " + verificationDoc.group());
            }
        } else {
            System.out.println("Document number wasn't found");
        }

        if(verificationPhone.find()){
            int counter = 1;
            System.out.println("Phone number " + counter + ": " + verificationPhone.group());
            while(verificationPhone.find()){
                counter++;
                System.out.println("Phone number " + counter + ": " + verificationPhone.group());
            }
        } else {
            System.out.println("Phone number wasn't found");
        }

        if(verificationEmail.find()){
            int counter = 1;
            System.out.println("Email " + counter + ": " + verificationEmail.group());
            while(verificationEmail.find()){
                counter++;
                System.out.println("Email " + counter + ": " + verificationEmail.group());
            }
        } else {
            System.out.println("Email wasn't found");
        }
    }

}
