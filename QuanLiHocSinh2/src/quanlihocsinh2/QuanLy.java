package quanlihocsinh2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QuanLy {

    DanhSachHocSinh dshs = new DanhSachHocSinh();
    Scanner sc = new Scanner(System.in);

    public void themMoi() {
        while (true) {
            System.out.println("Nhap ho ten, lop, toan, ly, hoa ");
            //khoi tao doi tuong va nhap du lieu cho dt thong qua ham ktao	
            HocSinh hs = new HocSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            dshs.themVaoDS(hs); //
            System.out.println("Tiep tuc hay kh Y/N? ");
            if (sc.nextLine().equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void inDSHS() {
        for (HocSinh hs : dshs.stu) {
            System.out.println(hs.toString());
        }
    }

    public void docFile(String path) {
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String s[] = line.split(",");
                String hoTen = s[0];
                String lop = s[1];
                double diemToan = Double.parseDouble(s[2]);
                double diemLi = Double.parseDouble(s[3]);
                double diemHoa = Double.parseDouble(s[4]);
                HocSinh hs = new HocSinh(hoTen, lop, diemToan, diemLi, diemHoa);
                dshs.themVaoDS(hs);
            }
            br.close();
            fr.close();
        } catch (IOException ex) {
            Logger.getLogger(QuanLy.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void ghiFile(String path) {
        try {
            FileWriter fw = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw);
            for (HocSinh hs : dshs.layDSDTBHon5() ) {
                fw.write(hs.toString()+"\n");
            }
        fw.close();
        bw.close();
        } catch (IOException ex) {
            Logger.getLogger(QuanLy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void inDTBMon5() {
        for (HocSinh hs : dshs.layDSDTBHon5()) {
            System.out.println(hs.toString());
        }
    }
}
