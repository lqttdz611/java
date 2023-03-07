
package learnfile;
import java.io.File;  // Import the File class
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;


public class LearnFile {


    public static void main(String[] args) {
        try {
            File obj = new File("C:\\Users\\FORMAI\\Desktop\\learnjava\\filename.txt");
            if(obj.createNewFile()) {
                System.out.println("File created: "+ obj.getName());
            }
            else {
                System.out.println("File already exists.");
            }
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try {
            FileWriter myWri = new FileWriter("C:\\Users\\FORMAI\\Desktop\\learnjava\\filename.txt");
            myWri.write("Day la vi du ve ghi file");        
            myWri.close();
            System.out.println("Ghi vao file thanh cong!!");
                    } catch (IOException e) {
                        System.out.println("Da xay ra loi!!");
                        e.printStackTrace();
                    }
    
    }
    
}
