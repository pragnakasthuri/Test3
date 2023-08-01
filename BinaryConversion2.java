package com.blabz.day6;

import java.util.HashMap;
import java.util.Scanner;

public class BinaryConversion2 {
    public static void main(String[] args) {
        int userInput = readUserInput();
        String binary = toBinary(userInput);
        swapNibblesAndFindNewNumber(binary);
    }

    /**
     * @param binary
     */
    private static void swapNibblesAndFindNewNumber(String binary) {
        String nibble1 = binary.substring(0, 4);
        String nibble2 = binary.substring(4);
        String newBinary = nibble2+nibble1;
        System.out.println("New number is: "+binaryToDecimal(Integer.parseInt(newBinary)));
    }

    /**
     * @param n
     * @return Decimal value
     */
    static int binaryToDecimal(int n)
    {
        int num = n;
        int decimalValue = 0;
        int base = 1;
        int temp = num;

        while (temp > 0) {
            int lastDigit = temp % 10;
            temp = temp / 10;
            decimalValue += lastDigit * base;
            base = base * 2;
        }
        return decimalValue;
    }

    /**
     * @param userInput
     * @return This method will return the binary form of given number
     */
    private static String toBinary(int userInput) {
        StringBuffer binary = new StringBuffer("");
        while (userInput > 0) {
            binary.append(userInput%2);
            userInput = userInput/2;
        }

        while(binary.length() < 8) {
            binary.append("0");
        }

        return binary.reverse().toString();
    }

    /**
     * @return user input of type int
     */
    private static int readUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input :");
        int userInput = scanner.nextInt();
        scanner.close();
        return userInput;
    }
}