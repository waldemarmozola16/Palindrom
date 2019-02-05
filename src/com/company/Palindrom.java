package com.company;

public class Palindrom {
    public static void main(String[] args) {
        String wort = "potop";
        char[] warray = wort.toCharArray();
        System.out.println(isPalindrom(warray));
    }
    public static boolean isPalindrom(char[] word){
        int i1 = 0;
        int i2 = word.length - 1;
        while (i2 > i1) {
            if (word[i1] != word[i2]) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }
}
