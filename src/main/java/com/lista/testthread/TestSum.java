package com.lista.testthread;

import java.util.concurrent.atomic.AtomicInteger;

public class TestSum {
    public static void main(String[] args) throws InterruptedException {
        long i0 = 1000000;
        final int THREADS = 2;
        AtomicInteger result = new AtomicInteger(0);

        //Runnable r1 = new RunSum(1, 500000,result);         //Thread t1 = new Thread(r1);
        Thread t1 = new Thread(new RunSum(1, 500000,result));

        //Runnable r2 = new RunSum(500001, 100000,result);         //Thread t2 = new Thread(r2);
        Thread t2 = new Thread(new RunSum(500001, 1000000,result));

        long rTime = System.currentTimeMillis();
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        rTime = System.currentTimeMillis() - rTime;

        String formatStr = "sum: %d\t%2dms\t%5d threads\n";
        System.out.printf(formatStr, result.get(), rTime, THREADS);

    }

}





