package com.blabz.day6;

import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long startTime = readStartTime(scanner);
        long stopTime = readStopTime(scanner);
        scanner.close();
        System.out.println("Elapsed time: "+(stopTime - startTime)/1000+"sec");
    }

    /**
     * @param scanner
     * @return
     */
    private static long readStopTime(Scanner scanner) {
        System.out.println("Press 'E' to stop");
        String userInput = scanner.next();
        return System.currentTimeMillis();
    }

    /**
     * @param scanner
     * @return Current time in milliseconds
     */
    private static long readStartTime(Scanner scanner) {
        System.out.println("Press 'S' to start");
        String userInput = scanner.next();
        return System.currentTimeMillis();
    }


}
