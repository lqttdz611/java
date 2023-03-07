
package filesonguyen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Filesonguyen {

    ArrayList<Integer> a = new ArrayList<>();
    void docFile(String path) {
        try {
            FileReader fr= new FileReader(path);
            BufferedReader br= new BufferedReader(fr);
            String line="";
            while(true) {
                line=br.readLine();
                if(line == null) {
                    break;
                }
                String s[]=line.split(" ");
                for (String o : s) {
                    a.add(Integer.parseInt(o));
                }
            }
                   System.out.println(a);   
            fr.close();
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(Filesonguyen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    ArrayList<Integer> tinhToan() {
        ArrayList<Integer> dsnew = new ArrayList<>();
        for (Integer z : a) {
            if(z > 0) {
                dsnew.add(z);
            }
            
        }
        return dsnew;
    }
    void ghiFile(String path) {
        try {
            FileWriter fw= new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Integer i : tinhToan()) {
                bw.write(i+ " ");
            }
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Filesonguyen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String[] args) {
        Filesonguyen f=new Filesonguyen();
        f.docFile("number.txt");
        f.ghiFile("output.txt");
        // TODO code application logic here
    }
    
}
