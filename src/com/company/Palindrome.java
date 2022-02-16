package com.company;

import java.lang.reflect.Array;
//Класс проверки слова на палиндром
public class Palindrome {
    //Метод вывода результата на экран
    public static void main(String[] args) {
        String[] arr = {"java", "Palindrome", "madam", "racecar", "apple", "kayak", "song", "noon"};
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            if (isPalindrome(s)) {
                System.out.println(s + " является палиндромом");
            } else {
                System.out.println(s + " не является палиндромом");
            }
        }
    }
    //Метод, возвращающий перевёрнутую строку
    public static String reverseString(String strings) {
        String temp = "";
        for (int i = 1; i <= strings.length(); i++) {
            temp += strings.charAt(strings.length() - i);
        }
        return (temp);
    }
    //Метод, непосредственно проверяющий строку на палиндром
    public static boolean isPalindrome(String s) {
        String rev = reverseString(s);
        return s.equals(rev);
    }
}