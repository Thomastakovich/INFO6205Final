package com.Rank;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {

    private static String result = null;
    private static String[] lineResult;

    public static String getResult() {
        return result;
    }

    public static void setResult(String result) {
        ReadFile.result = result;
    }

    public static String[] getLineResult() {
        return lineResult;
    }

    public static void setLineResult(String[] lineResult) {
        ReadFile.lineResult = lineResult;
    }

    public static void readBox(int row, int col, String fileName){
        result = null;
        String line = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            line = reader.readLine();
            for(int i = 0; i < row; i++){
                line = reader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            result = line.split(",")[col];
        } catch (Exception e) {
            return;
        }
    }

    public static void readLine(int row, String fileName){
        lineResult = null;
        String line = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            line = reader.readLine();
            for(int i = 0; i < row; i++){
                line = reader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
            lineResult = null;
        }
        try {
            lineResult = line.split(",");
        } catch (Exception e) {
            lineResult = null;
            return;
        }
    }

    //Test
    public static void main(String[] args) {
        ReadFile file = new ReadFile();
        file.readBox(1, 2, "../datasets/2000-2001.csv");
        System.out.println(file.result);
        file.readLine(381, "../datasets/2000-2001.csv");
        System.out.println(lineResult);
    }
}
