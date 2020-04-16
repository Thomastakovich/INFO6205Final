package com.Rank;

import com.League.MatchResult;

import java.util.*;

public class HashMapSort {
    public static HashMap<Integer, int[]> sortandPrintHashMap(HashMap<Integer,int[]> map){
        Set<Map.Entry<Integer,int[]>> entey = map.entrySet();
        List<Map.Entry<Integer,int[]>> list = new ArrayList<Map.Entry<Integer,int[]>>(entey);
        //List<int[]> l = new ArrayList<>();
        Collections.sort(list, new Comparator<Map.Entry<Integer,int[]>>() {
            @Override
            public int compare(Map.Entry<Integer, int[]> o1, Map.Entry<Integer, int[]> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        HashMap<Integer,int[]> linkedHashMap = new HashMap<Integer,int[]>();
        for(Map.Entry<Integer,int[]> entry:list){
            linkedHashMap.put(entry.getKey(),entry.getValue());
            System.out.println("Score Gap: " + entry.getKey() + " Result: " + entry.getValue()[0] + " " + entry.getValue()[1] + " " + entry.getValue()[2]);
            //int[] i = {entry.getKey(), entry.getValue()[0], entry.getValue()[1], entry.getValue()[2]};
            //l.add(i);
        }
        return linkedHashMap;
    }

    //Test for Class
    public static void main(String[] args) {
        HashMap<Integer, int[]> hm = new HashMap<>();
        hm.put(2, new int[3]);
        hm.put(3, new int[5]);
        hm.put(-1, new int[4]);
        hm.put(-3, new int[7]);
        sortandPrintHashMap(hm);
    }
}
