package com.lista.testcollect;

import com.lista.Student;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestCollectMake {

    static void mTestSet(Set<Student> dbHashSet, int nCntAdd, long[] aStatistic) {
        Student getStudent;
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= nCntAdd; i++) {
            dbHashSet.add(new Student("stud" + i, 18, 1000 + i));
        }
        aStatistic[0] = System.currentTimeMillis() - startTime;
        startTime = System.currentTimeMillis();
        for (Student studXXX:dbHashSet) {
            getStudent = studXXX;
        }

        aStatistic[1] = System.currentTimeMillis() - startTime;
        startTime = System.currentTimeMillis();
        for (int i = 1; i <= nCntAdd; i++) {
            dbHashSet.remove(0);
        }
        aStatistic[2] = System.currentTimeMillis() - startTime;
    }

     static void mTestMap(Map<String, Student> dbHashMap, int nCntAdd, long[] aStatistic) {
        Student getStudent;
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= nCntAdd; i++) {
            dbHashMap.put("stud" + i, new Student("stud" + i, 18, 1000 + i));
        }
        aStatistic[0] = System.currentTimeMillis() - startTime;
        startTime = System.currentTimeMillis();
        for (Map.Entry<String, Student> entry: dbHashMap.entrySet()) {
            getStudent = entry.getValue();
        }
        aStatistic[1] = System.currentTimeMillis() - startTime;
        startTime = System.currentTimeMillis();
        for (int i = 1; i <= nCntAdd; i++) {
            dbHashMap.remove("stud" + i);
        }
        aStatistic[2] = System.currentTimeMillis() - startTime;
    }

    static void mTestList(List<Student> dbArrayList, int nCntAdd, long[] aStatistic) {
        Student getStudent;
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= nCntAdd; i++) {
            dbArrayList.add(new Student("stud" + i, 18, 1000 + i));
        }
        aStatistic[0] = System.currentTimeMillis() - startTime;
        startTime = System.currentTimeMillis();
        for (int i = 1; i <= nCntAdd; i++) {
            getStudent = dbArrayList.get(i - 1);
        }
        aStatistic[1] = System.currentTimeMillis() - startTime;
        startTime = System.currentTimeMillis();
        for (int i = 1; i <= nCntAdd; i++) {
            dbArrayList.remove(0);
        }
        aStatistic[2] = System.currentTimeMillis() - startTime;
    }


}
