package com.JanInc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Hämta textrad att testa från användaren och skriv ut huruvida det är ett palindrom eller inte
        String sInput = getInputString();
        System.out.printf("%s: %s", sInput, isPalindrome(sInput) ? "Japp, ett palindrom!":"Sorry, inget palindrom");
    } // main

    private static boolean isPalindrome(String sInput) {
        boolean bIsNotPalindrome = false;

        // Jämför endast små tecken, och ta bort alla mellanslag, både före i och efter
        sInput = sInput.toLowerCase().strip().replace(" ", "");

        // Gå igenom halva strängen och kolla framifrån och bakifrån samtidigt.
        // Om respektive tecken från vardera kant inte är samma är det inget palindrom
        for (int i = 0; i < sInput.length() / 2 && !bIsNotPalindrome; i++) {
            bIsNotPalindrome = sInput.charAt(i) != sInput.charAt(sInput.length() - 1 - i);
        }
        return !bIsNotPalindrome;
    } // isPalindrome

    private static String getInputString() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ange textrad att testa: ");
        return scan.nextLine();
    } // getInputString
} // class
