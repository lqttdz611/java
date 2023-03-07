package learnfile2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LearnFile2 {

    ArrayList<String> arr = new ArrayList<>();

    void docFile(String path) {
        try {
            FileReader fr = new FileReader(path);
            BufferedReader bfreader = new BufferedReader(fr);
            String line = "";
            while (true) {
                line = bfreader.readLine();
                if (line == null) {
                    break;
                }
                arr.add(line);
            }
            System.out.println(arr);
            fr.close();
            bfreader.close();
        } catch (IOException ex) {
            Logger.getLogger(LearnFile2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

        void ghiFile(String path) {
        try {
            FileWriter fw= new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw);
            for (String o : arr) {
                bw.write(o);
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(LearnFile2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void sapXep() {
        for (int i = 0; i < arr.size()-1; i++) {
            for (int j = i+1; j < arr.size(); j++) {
                if(arr.get(i).compareToIgnoreCase(arr.get(i))>0) {
                    String temp=arr.get(i);
                    arr.set(i,arr.get(j));
                    arr.set(j,temp);
                }
            }
        }
    }
    

    public static void main(String[] args) {
        LearnFile2 lf = new LearnFile2();
       
        lf.docFile("input.txt");
        lf.ghiFile("output.txt");
         lf.sapXep();

    }
}
