package com.lista;

import java.util.*;

public class TestCollect {
    public static void main( String[] args ) {
        long[][] aStatistics = {{0,0,0},{0,0,0},{0,0,0},{0,0,0},{0,0,0}};
        int nCntAdd = 10000;
        boolean lExit = false;
        Scanner scan = new Scanner(System.in);
        while (!lExit) {
            TestCollectMakeChoice.menu();
            int nChoice = TestCollectMakeChoice.nChoice(scan);
            switch (nChoice) { 
                case 1: //System.out.println("1. ArrayList                     ");
                    ArrayList<Student>  dbArrayList = new ArrayList<>();
                    TestCollectMake.mTestList(dbArrayList,nCntAdd,aStatistics[0]);
                    TestCollectShow.elem_aStatisticsShow(aStatistics[0]);
                    //System.out.println("" + Arrays.toString(aStatistics[0]));
                    break;
                case 2: //System.out.println("2. LinkedList                    ");
                    LinkedList<Student>  dbLinkedList = new LinkedList<>();
                    TestCollectMake.mTestList(dbLinkedList,nCntAdd,aStatistics[1]);
                    TestCollectShow.elem_aStatisticsShow(aStatistics[1]);
                    break;
                case 3: //System.out.println("3. HashSet                       ");
                    HashSet<Student>  dbHashSet = new HashSet<>();
                    TestCollectMake.mTestSet(dbHashSet,nCntAdd,aStatistics[2]);
                    TestCollectShow.elem_aStatisticsShow(aStatistics[2]);
                    break;
                case 4: //System.out.println("4. HashMap                       ");
                    HashMap<String,Student>  dbHashMap = new HashMap<>();
                    TestCollectMake.mTestMap(dbHashMap,  nCntAdd, aStatistics[3]);
                    TestCollectShow.elem_aStatisticsShow(aStatistics[3]);
                    break;
                case 5: //System.out.println("5. TreeMap                       ");
                    TreeMap<String,Student>  dbTreeMap = new TreeMap<>();
                    TestCollectMake.mTestMap(dbTreeMap,  nCntAdd, aStatistics[4]);
                    TestCollectShow.elem_aStatisticsShow(aStatistics[4]);
                    break;
                case 6: //System.out.println("6. Statistics                    ");
                    TestCollectShow.all_aStatisticsShow( nCntAdd,aStatistics);
                    break;
                case 0: //System.out.println("0. Exit                          ");
                    lExit = true;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + nChoice);
            }
        }
    }


}
