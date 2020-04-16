package com.Rank;

import java.io.*;
import java.util.*;

public class WriteFile {

    public static void WriteHead() {
        try {
            File file = new File("relationship.csv");
            BufferedWriter out = new BufferedWriter( new FileWriter(file));
            out.write("PointGap, HomeWin, Draw, AwayWin");
            out.write('\n');
//            out.flush();
//            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void WriteRelationship(HashMap<Integer, int[]> map) {
        try {
            BufferedWriter out = new BufferedWriter( new FileWriter("relationship.csv"));
            out.write("PointGap,HomeWin,Draw,AwayWin,HomeWinRate,DrawRate,AwayWinRate");
            out.write('\n');
            Set<Map.Entry<Integer,int[]>> entey = map.entrySet();
            List<Map.Entry<Integer,int[]>> list = new ArrayList<Map.Entry<Integer,int[]>>(entey);
            Collections.sort(list, new Comparator<Map.Entry<Integer,int[]>>() {
                @Override
                public int compare(Map.Entry<Integer, int[]> o1, Map.Entry<Integer, int[]> o2) {
                    return o1.getKey().compareTo(o2.getKey());
                }
            });
            for(Map.Entry<Integer,int[]> entry : list) {
                out.write(entry.getKey() + "," + entry.getValue()[0] + "," + entry.getValue()[1] + "," + entry.getValue()[2]
                        + "," + (double)entry.getValue()[0] / (double)(entry.getValue()[0] + entry.getValue()[1] + entry.getValue()[2])
                        + "," + (double)entry.getValue()[1] / (double)(entry.getValue()[0] + entry.getValue()[1] + entry.getValue()[2])
                        + "," + (double)entry.getValue()[2] / (double)(entry.getValue()[0] + entry.getValue()[1] + entry.getValue()[2]));
                out.write('\n');
            }
            out.flush();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Test
    public static void main(String[] args) {
    }

}
