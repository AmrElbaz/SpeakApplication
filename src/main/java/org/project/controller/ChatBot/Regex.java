/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.project.controller.ChatBot;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * MajBot 1.0
 *
 * @author Seyed Majid Khosravi
 */
public class Regex {

    public static String match(String pattern, String keyword){
        Pattern p = Pattern.compile(pattern.toLowerCase());
        Matcher m = p.matcher(keyword.toLowerCase());
        
        if (m.matches()) {
            System.out.println("pattern"+pattern);
                        System.out.println("keyword"+keyword);

            return m.group(0);
        }
        return "";
    }

    public static String clear(String text){
        System.out.println("ffff"+text);
        Pattern pattern = Pattern.compile("\\[.*\\]");

        // Replace all occurrences of pattern in input
        Matcher matcher = pattern.matcher(text);
        return matcher.replaceAll("");
    }
}
