package jSimpleCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class CSVReader {
    public String[][] toArray(String filename){
        String[][] data;
        ArrayList<String[]> lines = new ArrayList<String[]>();
        String thisLine;

        try{
            BufferedReader br = new BufferedReader(new FileReader(filename));
            while((thisLine = br.readLine()) != null)
                lines.add(thisLine.split(","));
            br.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        data = new String[lines.size()][0];
        lines.toArray(data);

        return data;
    }
}

