package com.lista.total;

import java.io.IOException;
import java.util.*;

public class doWork {

    static void run() throws IOException {

        Scanner scan = new Scanner(System.in);
        Object lExit = false;
        while (!(boolean)lExit) {
            menuWk.menu();
            int nChoice = menuWk.nChoice(scan);
            switch (nChoice) {
                case 1:
                    System.out.println("1. Решить квадратное уравнение:                     ");
                    System.out.println("Введите параметры a, b, c");
                    int a, b, c;

                    a = scan.nextInt();
                    b = scan.nextInt();
                    c = scan.nextInt();
                    Equation equation = new Equation(a, b, c);
                    System.out.println(equation.firstX(a, b, c));
                    System.out.println(equation.secondX(a, b, c));
                    break;
                case 2: //System.out.println("2. LinkedList                    ");
                    System.out.println("2.Найти сумму элементов матрицы ниже диагонали");
                    System.out.println("Введите размер матрицы");

                    System.out.println(new None());
                    break;
                case 0: //System.out.println("0. Exit                          ");
                    lExit = true;
                    break;
                default:
                    //throw new IllegalStateException("Unexpected value: " + nChoice);
            }
        }
    }




}
