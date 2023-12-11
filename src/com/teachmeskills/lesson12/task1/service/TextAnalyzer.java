package com.teachmeskills.lesson12.task1.service;

import com.teachmeskills.lesson12.task1.utils.Const;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextAnalyzer {

    public static void checkAbbreviation(String userString) {
        Pattern abbreviations = Pattern.compile(Const.ABBREVIATIONS_REGEXP);
        Matcher verification = abbreviations.matcher(userString);
        StringBuilder result = new StringBuilder();
        while (verification.find()) {
            result.append(verification.group());
            result.append(" ");
        }
        if (!result.toString().isEmpty()) {
            System.out.println("Abbreviations in line: " + result);
        } else {
            System.out.println("Abbreviations were not found");
        }
    }

}
