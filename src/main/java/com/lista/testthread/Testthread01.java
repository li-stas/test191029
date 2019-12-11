package com.lista.testthread;

import java.util.concurrent.atomic.AtomicInteger;

public class Testthread01 {

    public static void main(String[] args) throws InterruptedException {
        long lengthNum = 100;
        final int THREADS = 2;
        AtomicInteger result = new AtomicInteger(0);

        long begin = 0;
        long pLength = lengthNum / THREADS;
        pLength = (lengthNum % THREADS > 0) ? pLength + 1 : pLength;


        long rTime = System.currentTimeMillis();

        Thread[] thr = new Thread[THREADS]; // сколько задач
        for (int i = 0; i < THREADS; i++) {
            System.out.printf("begin=%d, begin+pLength=%d\n",begin, begin + pLength);
            thr[i] = new Thread(new RunSum(begin, begin + pLength, result));
            thr[i].start();
            begin += pLength;
        }
        for (int i = 0; i < THREADS; i++) {
            thr[i].join();
        }

        rTime = System.currentTimeMillis() - rTime;

        String formatStr = "sum: %d\t%2dms\t%5d threads\n";
        System.out.printf(formatStr, result.get()+lengthNum, rTime, THREADS);

    }

}

