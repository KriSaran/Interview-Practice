package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println(mergeAlternately("Sara", "Krish"));

    }


    public static StringBuilder mergeAlternately(String word1, String word2) {

        StringBuilder result = new StringBuilder();
        int minLength = 0;
        if (word1.length() <= word2.length()) {
            minLength = word1.length();
        } else {
            minLength = word2.length();
        }

        for (int i = 0; i < minLength; i++) {
            result.append("" + word1.charAt(i) + "" + word2.charAt(i));
        }
        if (word1.length() > word2.length()) {
            for (int i = minLength; i < word1.length(); i++) {
                result.append("" + word1.charAt(i));
            }
        }else{
                for (int i = minLength; i < word2.length(); i++) {
                    result.append("" + word2.charAt(i));
                }
            }



        return result;

    }

}