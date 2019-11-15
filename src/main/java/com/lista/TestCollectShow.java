package com.lista;

import java.util.Arrays;

public class TestCollectShow {
    static void all_aStatisticsShow( int nCntAdd, long[][] aStatistics) {
        System.out.println("╔═══════════════════════════════════════════╗");
        System.out.println("║    Тест на " + nCntAdd + "                         ║");
        System.out.println("═════════════════════════════════════════════");
        System.out.println("║             ║   ADD   ║   GET   ║ REMOVE  ║");
        System.out.println("═════════════════════════════════════════════");
        System.out.printf("║1. ArrayList ║  %6d  ║  %6d  ║ %6d   ║%n",aStatistics[0][0],aStatistics[0][1],aStatistics[0][2]);
        System.out.println("═════════════════════════════════════════════");
        System.out.printf("║2. LinkedList║ %6d   ║ %6d   ║%6d    ║%n",aStatistics[1][0],aStatistics[1][1],aStatistics[1][2]);
        System.out.println("═════════════════════════════════════════════");
        System.out.printf("║3. HashSet   ║ %6d   ║ %6d   ║%6d    ║%n",aStatistics[2][0],aStatistics[2][1],aStatistics[2][2]);
        System.out.println("═════════════════════════════════════════════");
        System.out.printf("║4. HashMap   ║ %6d   ║ %6d   ║%6d    ║%n",aStatistics[3][0],aStatistics[3][1],aStatistics[3][2]);
        System.out.println("═════════════════════════════════════════════");
        System.out.printf("║5. TreeMap   ║ %6d   ║ %6d   ║%6d    ║%n",aStatistics[4][0],aStatistics[4][1],aStatistics[4][2]);
        System.out.println("═════════════════════════════════════════════");
    }

    public static void elem_aStatisticsShow(long[] aStatistic) {
        System.out.println("" + Arrays.toString(aStatistic));
    }
}
