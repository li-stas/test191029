package com.lista.testthread;

import java.util.concurrent.atomic.AtomicInteger;


class RunSum implements Runnable {

    private long from;
    private long to;
    private AtomicInteger result;

    RunSum(long from, long to, AtomicInteger result) {
        this.from = from;
        this.to = to;
        this.result = result;
    }


    public void run() {
        long curNum = from;
        int sum = 0;
        //sum += from;
        System.out.printf("%d\n",curNum);
        while (curNum >= from  && curNum < to  ) {
            sum += curNum ;
            curNum++;
        }
        System.out.printf("%d,%d\n",sum,curNum);
        result.addAndGet(sum);
    }

}
