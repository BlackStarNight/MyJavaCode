package com.Project.Al;

public class Main_Project {
    public static void main(String[] args) {
        String str1 = "cat ate a mouse";
        String str2 = "mouse ate cat food";
        JaroWinkler jeck = new JaroWinkler(str1,str2);
        System.out.println(jeck.getSimilarity());

        Levenshtein_Old lev = new Levenshtein_Old(str1,str2);
        lev.getSimilarity();
        System.out.println();
    }
}
