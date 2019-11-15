package com.lista.testCollect;

import java.util.Scanner;

public class TestCollectMakeChoice {
    static void menu() {
        System.out.println("1. ArrayList                     ");
        System.out.println("2. LinkedList                    ");
        System.out.println("3. HashSet                       ");
        System.out.println("4. HashMap                       ");
        System.out.println("5. TreeMap                       ");
        System.out.println("6. Statistics                    ");
        System.out.println("0. Exit                          ");
        System.out.println("");
        System.out.print("Write action (1 - 6, 0 - exit): ");
    }

    static int nChoice(Scanner scan) {
        //int nChoice = scan.nextInt();
        return scan.nextInt();
    }
}
