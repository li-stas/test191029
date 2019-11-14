package com.lista;

import java.util.*;

public class TestCollect {
    public static void main( String[] args ) {
        long[][] aStatistics = {{0,0,0},{0,0,0},{0,0,0},{0,0,0},{0,0,0}};
        int nCntAdd = 100000;
        long startTime;
        boolean lExit = false;
        Student getStudent;
        Scanner scan = new Scanner(System.in);
        while (!lExit) {
            
            System.out.println("1. ArrayList                     ");
            System.out.println("2. LinkedList                    ");
            System.out.println("3. HashSet                       ");
            System.out.println("4. HashMap                       ");
            System.out.println("5. TreeMap                       ");
            System.out.println("6. Statistics                    ");
            System.out.println("0. Exit                          ");
            System.out.println("");
            System.out.print("Write action (1 - 6, 0 - exit): ");

            int nChoice = scan.nextInt();
            switch (nChoice) { 
                case 1: //System.out.println("1. ArrayList                     ");
                    ArrayList<Student>  dbArrayList = new ArrayList<>();

                    startTime = System.currentTimeMillis();
                    for (int i = 1; i <= nCntAdd; i++  ){
                        dbArrayList.add(new Student("stud" + i,18, 1000 + i ));
                    }
                    aStatistics[0][0] = System.currentTimeMillis() - startTime;
                    startTime = System.currentTimeMillis();
                    for (int i = 1; i <= nCntAdd; i++  ){
                        getStudent = dbArrayList.get(i - 1);
                    }
                    aStatistics[0][1] = System.currentTimeMillis() - startTime;
                    startTime = System.currentTimeMillis();
                    for (int i = 1; i <= nCntAdd; i++  ){
                        dbArrayList.remove(0);
                    }
                    aStatistics[0][2] = System.currentTimeMillis() - startTime;
                    System.out.println("" + Arrays.toString(aStatistics[0]));

                    break;
                case 2: //System.out.println("2. LinkedList                    ");
                    LinkedList<Student>  dbLinkedList = new LinkedList<>();

                    startTime = System.currentTimeMillis();
                    for (int i = 1; i <= nCntAdd; i++  ){
                        dbLinkedList.add(new Student("stud" + i,18, 1000 + i ));
                    }
                    aStatistics[1][0] = System.currentTimeMillis() - startTime;
                    startTime = System.currentTimeMillis();
                    for (int i = 1; i <= nCntAdd; i++  ){
                        getStudent = dbLinkedList.get(i - 1);
                    }
                    aStatistics[1][1] = System.currentTimeMillis() - startTime;
                    startTime = System.currentTimeMillis();
                    for (int i = 1; i <= nCntAdd; i++  ){
                        dbLinkedList.remove(0);
                    }
                    aStatistics[1][2] = System.currentTimeMillis() - startTime;
                    System.out.println("" + Arrays.toString(aStatistics[1]));
                    break;
                case 3: //System.out.println("3. HashSet                       ");
                    HashSet<Student>  dbHashSet = new HashSet<>();

                    startTime = System.currentTimeMillis();
                    for (int i = 1; i <= nCntAdd; i++  ){
                        dbHashSet.add(new Student("stud" + i,18, 1000 + i ));
                    }
                    aStatistics[2][0] = System.currentTimeMillis() - startTime;
                    startTime = System.currentTimeMillis();
                    for ( Student studXXX:dbHashSet  ) {
                        getStudent = studXXX;
                    }

                    aStatistics[2][1] = System.currentTimeMillis() - startTime;
                    startTime = System.currentTimeMillis();
                    for (int i = 1; i <= nCntAdd; i++  ){
                        dbHashSet.remove(0);
                    }
                    aStatistics[2][2] = System.currentTimeMillis() - startTime;
                    System.out.println("" + Arrays.toString(aStatistics[2]));
                    break;
                case 4: //System.out.println("4. HashMap                       ");
                    HashMap<String,Student>  dbHashMap = new HashMap<>();

                    startTime = System.currentTimeMillis();
                    for (int i = 1; i <= nCntAdd; i++  ){
                        dbHashMap.put( "stud" + i, new Student("stud" + i,18, 1000 + i ));
                    }
                    aStatistics[3][0] = System.currentTimeMillis() - startTime;
                    startTime = System.currentTimeMillis();
                    for(Map.Entry<String,Student> entry: dbHashMap.entrySet()) {
                        getStudent = entry.getValue();
                    }
                    aStatistics[3][1] = System.currentTimeMillis() - startTime;
                    startTime = System.currentTimeMillis();
                    for (int i = 1; i <= nCntAdd; i++  ){
                        dbHashMap.remove("stud" + i);
                    }
                    aStatistics[3][2] = System.currentTimeMillis() - startTime;
                    System.out.println("" + Arrays.toString(aStatistics[3]));
                    //System.out.println("size="+dbHashMap.size());
                    break;
                case 5: //System.out.println("5. TreeMap                       ");
                    TreeMap<String,Student>  dbTreeMap = new TreeMap<>();

                    startTime = System.currentTimeMillis();
                    for (int i = 1; i <= nCntAdd; i++  ){
                        dbTreeMap.put( "stud" + i, new Student("stud" + i,18, 1000 + i ));
                    }
                    aStatistics[4][0] = System.currentTimeMillis() - startTime;
                    startTime = System.currentTimeMillis();
                    for(Map.Entry<String,Student> entry: dbTreeMap.entrySet()) {
                        getStudent = entry.getValue();
                    }
                    aStatistics[4][1] = System.currentTimeMillis() - startTime;
                    startTime = System.currentTimeMillis();
                    for (int i = 1; i <= nCntAdd; i++  ){
                        dbTreeMap.remove("stud" + i);
                    }
                    aStatistics[4][2] = System.currentTimeMillis() - startTime;
                    System.out.println("" + Arrays.toString(aStatistics[4]));
                    //System.out.println("size="+dbHashMap.size());break;
                case 6: //System.out.println("6. Statistics                    ");
                    System.out.println("╔═══════════════════════════════════════════╗");
                    System.out.println("║    Тест на " + nCntAdd + "                         ║");
                    System.out.println("═════════════════════════════════════════════");
                    System.out.println("║             ║   ADD   ║   GET   ║ REMOVE  ║");
                    System.out.println("═════════════════════════════════════════════");
                    System.out.printf("║1. ArrayList ║  %5d  ║  %5d  ║ %5d   ║%n",aStatistics[0][0],aStatistics[0][1],aStatistics[0][2]);
                    System.out.println("═════════════════════════════════════════════");
                    System.out.printf("║2. LinkedList║  %5d  ║  %5d  ║ %5d   ║%n",aStatistics[1][0],aStatistics[1][1],aStatistics[1][2]);
                    System.out.println("═════════════════════════════════════════════");
                    System.out.printf("║3. HashSet   ║  %5d  ║  %5d  ║ %5d   ║%n",aStatistics[2][0],aStatistics[2][1],aStatistics[2][2]);
                    System.out.println("═════════════════════════════════════════════");
                    System.out.printf("║4. HashMap   ║  %5d  ║  %5d  ║ %5d   ║%n",aStatistics[3][0],aStatistics[3][1],aStatistics[3][2]);
                    System.out.println("═════════════════════════════════════════════");
                    System.out.printf("║5. TreeMap   ║  %5d  ║  %5d  ║ %5d   ║%n",aStatistics[4][0],aStatistics[4][1],aStatistics[4][2]);
                    System.out.println("═════════════════════════════════════════════");
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
