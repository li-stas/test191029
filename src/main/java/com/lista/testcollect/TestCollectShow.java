package com.lista.testcollect;

import java.util.Arrays;

public class TestCollectShow {
    static void all_aStatisticsShow( int nCntAdd, Object[][] aStatistics) {
        System.out.println("╔═══════════════════════════════════════════╗");
        System.out.println("║    Тест на " + nCntAdd + "                          ║");
        System.out.println("═════════════════════════════════════════════");
        System.out.println("║             ║   ADD   ║   GET   ║ REMOVE  ║");
        System.out.println("═════════════════════════════════════════════");

        for ( Object[] aElem: aStatistics ) {
            System.out.printf("║%13s║  %6d  ║  %6d  ║ %6d   ║%n",aElem[3],aElem[0],aElem[1],aElem[2]);
            System.out.println("═════════════════════════════════════════════");
        }
    }

    public static void elem_aStatisticsShow(Object[] aStatistic) {
        System.out.println("" + Arrays.toString(aStatistic));
    }
}
