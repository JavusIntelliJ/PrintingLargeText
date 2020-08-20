package com.kupa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        printOutWelcomeMessage();
        printOutTheMenu();
        boolean flag = true;
        System.out.print("Enter option: ");
        while (flag) {
            switch (scanner.nextLine()) {
                case "1" :
                    printOutDefult();
                    System.out.print("Enter option: ");
                    break;
                case "2" :
                    System.out.print("Enter the text: ");
                    printOutLetters(scanner.nextLine());
                    System.out.print("Enter option: ");
                    break;
                case "3" :
                    printOutTheMenu();
                    System.out.print("Enter option: ");
                    break;
                case "4" :
                    System.out.println("Closing the program...");
                    flag = false;
                    break;
                default :
                    System.out.print("Wrong option number. Enter correct option: ");
                    break;
            }
        }
    }

    private static void printOutLetters (String stringToPrint) {
        String convertedString = stringToPrint.toLowerCase();
        int length = checkLengthOfAString(convertedString);
        System.out.println("");
        printFirstRow(convertedString, length);
        printSecondRow(convertedString, length);
        printThirdRow(convertedString, length);
        printFourthRow(convertedString, length);
        printFifthRow(convertedString, length);
        System.out.println("");
    }

    private static int checkLengthOfAString (String stringToCheck) {
        return stringToCheck.length();
    }

    private static void printFirstRow (String stringToBePrinted, int stringLength) {
        char currentChar;
        for (int i = 0; i < stringLength; i++) {
            currentChar = stringToBePrinted.charAt(i);

            switch (currentChar) {
                case ' ' :
                    System.out.print("        ");
                    break;
                case 'a' :
                    System.out.print("     A     ");
                    break;
                case 'b' :
                    System.out.print(" BBBBBBB  ");
                    break;
                case 'c' :
                    System.out.print("  CCCCCC ");
                    break;
                case 'd' :
                    System.out.print(" DDDDDD  ");
                    break;
                case 'e' :
                    System.out.print(" EEEEEEE ");
                    break;
                case 'f' :
                    System.out.print(" FFFFFFF ");
                    break;
                case 'g' :
                    System.out.print("  GGGGG  ");
                    break;
                case 'h' :
                    System.out.print(" HH   HH ");
                    break;
                case 'i' :
                    System.out.print(" II ");
                    break;
                case 'j' :
                    System.out.print("      JJ ");
                    break;
                case 'k' :
                    System.out.print(" KK  KK ");
                    break;
                case 'l' :
                    System.out.print(" LL     ");
                    break;
                case 'm' :
                    System.out.print(" MMM     MMM ");
                    break;
                case 'n' :
                    System.out.print(" NNN   NN ");
                    break;
                case 'o' :
                    System.out.print("  OOOOOO  ");
                    break;
                case 'p' :
                    System.out.print(" PPPPPP  ");
                    break;
                case 'q' :
                    System.out.print("  QQQQQ   ");
                    break;
                case 'r' :
                    System.out.print(" RRRRRR   ");
                    break;
                case 's' :
                    System.out.print("  SSSSSSS  ");
                    break;
                case 't' :
                    System.out.print(" TTTTTTTT ");
                    break;
                case 'u' :
                    System.out.print(" UU     UU ");
                    break;
                case 'v' :
                    System.out.print(" VV       VV ");
                    break;
                case 'w' :
                    System.out.print(" WW   W   WW ");
                    break;
                case 'x' :
                    System.out.print(" XX   XX ");
                    break;
                case 'y' :
                    System.out.print(" YY    YY ");
                    break;
                case 'z' :
                    System.out.print(" ZZZZZZ ");
                    break;
                default:
                    break;
            }
        }
        System.out.println("");
    }

    private static void printSecondRow (String stringToBePrinted, int stringLength) {
        char currentChar;
        for (int i = 0; i < stringLength; i++) {
            currentChar = stringToBePrinted.charAt(i);

            switch (currentChar) {
                case ' ' :
                    System.out.print("        ");
                    break;
                case 'a' :
                    System.out.print("    A A    ");
                    break;
                case 'b' :
                    System.out.print(" BB    BB ");
                    break;
                case 'c' :
                    System.out.print(" CC      ");
                    break;
                case 'd' :
                    System.out.print(" DD   DD ");
                    break;
                case 'e' :
                    System.out.print(" EE      ");
                    break;
                case 'f' :
                    System.out.print(" FF      ");
                    break;
                case 'g' :
                    System.out.print(" GG      ");
                    break;
                case 'h' :
                    System.out.print(" HH   HH ");
                    break;
                case 'i' :
                    System.out.print(" II ");
                    break;
                case 'j' :
                    System.out.print("      JJ ");
                    break;
                case 'k' :
                    System.out.print(" KK KK  ");
                    break;
                case 'l' :
                    System.out.print(" LL     ");
                    break;
                case 'm' :
                    System.out.print(" MMMM   MMMM ");
                    break;
                case 'n' :
                    System.out.print(" NNNN  NN ");
                    break;
                case 'o' :
                    System.out.print(" OO    OO ");
                    break;
                case 'p' :
                    System.out.print(" PP   PP ");
                    break;
                case 'q' :
                    System.out.print(" QQ   QQ  ");
                    break;
                case 'r' :
                    System.out.print(" RR   RR  ");
                    break;
                case 's' :
                    System.out.print(" SS        ");
                    break;
                case 't' :
                    System.out.print("    TT    ");
                    break;
                case 'u' :
                    System.out.print(" UU     UU ");
                    break;
                case 'v' :
                    System.out.print("  VV     VV  ");
                    break;
                case 'w' :
                    System.out.print(" WW  WWW  WW ");
                    break;
                case 'x' :
                    System.out.print("  XX XX  ");
                    break;
                case 'y' :
                    System.out.print("  YY  YY  ");
                    break;
                case 'z' :
                    System.out.print("    ZZ  ");
                    break;
                default:
                    break;
            }
        }
        System.out.println("");
    }

    private static void printThirdRow (String stringToBePrinted, int stringLength) {
        char currentChar;
        for (int i = 0; i < stringLength; i++) {
            currentChar = stringToBePrinted.charAt(i);

            switch (currentChar) {
                case ' ' :
                    System.out.print("        ");
                    break;
                case 'a' :
                    System.out.print("   A   A   ");
                    break;
                case 'b' :
                    System.out.print(" BBBBBBB  ");
                    break;
                case 'c' :
                    System.out.print(" CC      ");
                    break;
                case 'd' :
                    System.out.print(" DD   DD ");
                    break;
                case 'e' :
                    System.out.print(" EEEEE   ");
                    break;
                case 'f' :
                    System.out.print(" FFFF    ");
                    break;
                case 'g' :
                    System.out.print(" GG  GGG ");
                    break;
                case 'h' :
                    System.out.print(" HHHHHHH ");
                    break;
                case 'i' :
                    System.out.print(" II ");
                    break;
                case 'j' :
                    System.out.print("      JJ ");
                    break;
                case 'k' :
                    System.out.print(" KKKK   ");
                    break;
                case 'l' :
                    System.out.print(" LL     ");
                    break;
                case 'm' :
                    System.out.print(" MM MM MM MM ");
                    break;
                case 'n' :
                    System.out.print(" NN NN NN ");
                    break;
                case 'o' :
                    System.out.print(" OO    OO ");
                    break;
                case 'p' :
                    System.out.print(" PPPPPP  ");
                    break;
                case 'q' :
                    System.out.print(" QQ   QQ  ");
                    break;
                case 'r' :
                    System.out.print(" RRRRRR   ");
                    break;
                case 's' :
                    System.out.print("  SSSSSSS  ");
                    break;
                case 't' :
                    System.out.print("    TT    ");
                    break;
                case 'u' :
                    System.out.print(" UU     UU ");
                    break;
                case 'v' :
                    System.out.print("   VV   VV   ");
                    break;
                case 'w' :
                    System.out.print(" WW WW WW WW ");
                    break;
                case 'x' :
                    System.out.print("   XXX   ");
                    break;
                case 'y' :
                    System.out.print("   YYYY   ");
                    break;
                case 'z' :
                    System.out.print("   ZZ   ");
                    break;
                default:
                    break;
            }
        }
        System.out.println("");
    }

    private static void printFourthRow (String stringToBePrinted, int stringLength) {
        char currentChar;
        for (int i = 0; i < stringLength; i++) {
            currentChar = stringToBePrinted.charAt(i);

            switch (currentChar) {
                case ' ' :
                    System.out.print("        ");
                    break;
                case 'a' :
                    System.out.print("  AAAAAAA  ");
                    break;
                case 'b' :
                    System.out.print(" BB    BB ");
                    break;
                case 'c' :
                    System.out.print(" CC      ");
                    break;
                case 'd' :
                    System.out.print(" DD   DD ");
                    break;
                case 'e' :
                    System.out.print(" EE      ");
                    break;
                case 'f' :
                    System.out.print(" FF      ");
                    break;
                case 'g' :
                    System.out.print(" GG   GG ");
                    break;
                case 'h' :
                    System.out.print(" HH   HH ");
                    break;
                case 'i' :
                    System.out.print(" II ");
                    break;
                case 'j' :
                    System.out.print(" JJ   JJ ");
                    break;
                case 'k' :
                    System.out.print(" KK KK  ");
                    break;
                case 'l' :
                    System.out.print(" LL     ");
                    break;
                case 'm' :
                    System.out.print(" MM  MMM  MM ");
                    break;
                case 'n' :
                    System.out.print(" NN  NNNN ");
                    break;
                case 'o' :
                    System.out.print(" OO    OO ");
                    break;
                case 'p' :
                    System.out.print(" PP      ");
                    break;
                case 'q' :
                    System.out.print(" QQ   QQ  ");
                    break;
                case 'r' :
                    System.out.print(" RR   RR  ");
                    break;
                case 's' :
                    System.out.print("        SS ");
                    break;
                case 't' :
                    System.out.print("    TT    ");
                    break;
                case 'u' :
                    System.out.print(" UU     UU ");
                    break;
                case 'v' :
                    System.out.print("    VV VV    ");
                    break;
                case 'w' :
                    System.out.print(" WWWW   WWWW ");
                    break;
                case 'x' :
                    System.out.print("  XX XX  ");
                    break;
                case 'y' :
                    System.out.print("    YY    ");
                    break;
                case 'z' :
                    System.out.print("  ZZ    ");
                    break;
                default:
                    break;
            }
        }
        System.out.println("");
    }

    private static void printFifthRow (String stringToBePrinted, int stringLength) {
        char currentChar;
        for (int i = 0; i < stringLength; i++) {
            currentChar = stringToBePrinted.charAt(i);

            switch (currentChar) {
                case ' ' :
                    System.out.print("        ");
                    break;
                case 'a' :
                    System.out.print(" A       A ");
                    break;
                case 'b' :
                    System.out.print(" BBBBBBB  ");
                    break;
                case 'c' :
                    System.out.print("  CCCCCC ");
                    break;
                case 'd' :
                    System.out.print(" DDDDDD  ");
                    break;
                case 'e' :
                    System.out.print(" EEEEEEE ");
                    break;
                case 'f' :
                    System.out.print(" FF      ");
                    break;
                case 'g' :
                    System.out.print("  GGGGG  ");
                    break;
                case 'h' :
                    System.out.print(" HH   HH ");
                    break;
                case 'i' :
                    System.out.print(" II ");
                    break;
                case 'j' :
                    System.out.print("  JJJJJ  ");
                    break;
                case 'k' :
                    System.out.print(" KK  KK ");
                    break;
                case 'l' :
                    System.out.print(" LLLLLL ");
                    break;
                case 'm' :
                    System.out.print(" MM   M   MM ");
                    break;
                case 'n' :
                    System.out.print(" NN   NNN ");
                    break;
                case 'o' :
                    System.out.print("  OOOOOO  ");
                    break;
                case 'p' :
                    System.out.print(" PP      ");
                    break;
                case 'q' :
                    System.out.print("  QQQQQ Q ");
                    break;
                case 'r' :
                    System.out.print(" RR    RR ");
                    break;
                case 's' :
                    System.out.print("  SSSSSSS  ");
                    break;
                case 't' :
                    System.out.print("    TT    ");
                    break;
                case 'u' :
                    System.out.print("  UUUUUUU  ");
                    break;
                case 'v' :
                    System.out.print("     VVV     ");
                    break;
                case 'w' :
                    System.out.print(" WWW     WWW ");
                    break;
                case 'x' :
                    System.out.print(" XX   XX ");
                    break;
                case 'y' :
                    System.out.print("    YY    ");
                    break;
                case 'z' :
                    System.out.print(" ZZZZZZ ");
                    break;
                default:
                    break;
            }
        }
        System.out.println("");
    }

    private static void printOutTheMenu () {
        System.out.println("Menu: \n" +
                "1. Print out all possible signs \n" +
                "2. Print out entered text \n" +
                "3. Print out the menu \n" +
                "4. Close the program");
    }

    private static void printOutDefult () {
        printOutLetters("abcdefghijklmnopqrstuvwxyz");
    }

    private static void printOutWelcomeMessage () {
        System.out.println("Welcome to the Printing Large Text ver. 1.0.0 by JavusIntelliJ! ");
    }

}
