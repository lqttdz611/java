package filelearn;

import java.io.FileWriter;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.BufferedWriter;
public class FileLearn {

    public static void main(String[] args) {
        String a[] = {"Anh", "Bao", "Diem", "Duy", "Hao" };
        try {
            FileWriter fw = new FileWriter("output.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for (String o : a) {
                bw.write(o);
            }
            bw.close();
            fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}
