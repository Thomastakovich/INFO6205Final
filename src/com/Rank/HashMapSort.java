package com.Rank;

import com.League.MatchResult;

import java.util.*;

public class HashMapSort {
    public static HashMap<Integer, int[]> sortandPrintHashMap(HashMap<Integer,int[]> map){
        Set<Map.Entry<Integer,int[]>> entey = map.entrySet();
        List<Map.Entry<Integer,int[]>> list = new ArrayList<Map.Entry<Integer,int[]>>(entey);
        Collections.sort(list, new Comparator<Map.Entry<Integer,int[]>>() {
            @Override
            public int compare(Map.Entry<Integer, int[]> o1, Map.Entry<Integer, int[]> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        LinkedHashMap<Integer,int[]> linkedHashMap = new LinkedHashMap<Integer,int[]>();
        for(Map.Entry<Integer,int[]> entry:list){
            linkedHashMap.put(entry.getKey(),entry.getValue());
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue()[0] + " " + entry.getValue()[1] + " " + entry.getValue()[2]);
        }
        return linkedHashMap;
    }

    public static void main(String[] args) {
        HashMap<Integer, int[]> hm = new HashMap<>();
        hm.put(2, new int[3]);
        hm.put(3, new int[5]);
        hm.put(-1, new int[4]);
        hm.put(-3, new int[7]);
        sortandPrintHashMap(hm);

//        for(Map.Entry<Integer, int[]> entry: hm.entrySet()) {
//            System.out.println("Key: "+ entry.getKey()+ " Value: "+entry.getValue()[0]);
//        }
//        Integer a = new Integer(2);
//        Integer b = new Integer(-3);
//        System.out.println(a.compareTo(b));
    }
}
