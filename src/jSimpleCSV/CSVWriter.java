package jSimpleCSV;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CSVWriter {
    public void toCSV (String[][] arr, String filename){
        try{
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j<arr[i].length; j++)
                    pw.print(arr[i][j] + ((j != arr[i].length-1) ? "," : ""));

                pw.print((i != arr.length-1) ? "\n" : "");
            }
            pw.flush();
            pw.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}