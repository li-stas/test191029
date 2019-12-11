package com.lista.total;

import java.util.InputMismatchException;
import java.util.Scanner;

public class menuWk {
    static void menu() {
        System.out.println("1. Решить задачу №1              ");
        System.out.println("2. Решить задачу №2              ");
        System.out.println("0. Выход           ф              ");
        System.out.println("");
        System.out.print("Write action (1 - 2, 0 - exit): ");
    }

    static int nChoice(Scanner scan) throws InputMismatchException {
        int nCh = 0;
        try {
            nCh = scan.nextInt();
        } catch (Exception e) {
            nCh = 99;
        }
        return nCh;
    }
}
