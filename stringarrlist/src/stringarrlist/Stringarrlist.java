package stringarrlist;

import java.util.ArrayList;
import java.util.Scanner;

public class Stringarrlist {

    Scanner sc = new Scanner(System.in);
    ArrayList<String> sv = new ArrayList<String>();

    void themMoi() {
        while (true) {
            System.out.println("Nhap ten: ");
            sv.add(sc.nextLine());
            System.out.println("Tiep tuc hay khong Y/N: ");
            if (sc.nextLine().equalsIgnoreCase("n".trim())) {
                break;
            }
        }
    }

    void inDanhSach() {
        //fore + tab
        for (String name : sv) {
            System.out.println(name);
        }
    }

    void nhap(String x) {
        sv.add(x);
    }

    void nhapTen() {
        System.out.println("Nhap ten Sinh Vien: ");
        String x = sc.nextLine();
        nhap(x);
    }

    void inDanhSach1() {
        for (int i = 0; i < sv.size(); i++) {
            System.out.println("Danh sach SinhVien: ");
            System.out.println(sv.get(i));
        }
    }

    /* 
        String timTheoTen(String ten) {
        String tenSv=null;
        for (String st : sv) {
        if(st.equalsIgnoreCase(ten.trim())){
            return st;
        }
        }
        return tenSv;
    }
     */
    boolean xoaTheoTen(String tenSV) {
        for (String o : sv) {
            if (o.equalsIgnoreCase(tenSV.trim())) {
                sv.remove(o);
                return true;
            }
        }
        return false;
    }

    void xoa() {
        System.out.println("Nhap ten can xoa: ");
        if (xoaTheoTen(sc.nextLine())) {
            System.out.println("Xoa thanh cong!!");
        } else {
            System.out.println("Xoa khong thanh cong!!");
        }
    }

    void capNhatTheoTen(String tenSV) {
        for (String o : sv) {
            if (o.equalsIgnoreCase(tenSV.trim())) {
                int i = sv.indexOf(o);
                System.out.println("Nhap ten moi: ");
                sv.set(i, sc.nextLine());
            }
        }
    }

    void capNhat() {
        System.out.println("Nhap ten can update: ");
        capNhatTheoTen(sc.nextLine());
    }

    ArrayList<String> dsTheoTenGanDung(String tenSV) {
        ArrayList<String> dsMoi = new ArrayList<>();
        for (String o : sv) {
            if (o.contains(tenSV.trim())) {
                dsMoi.add(o);
            }
        }
        return dsMoi;
    }

    void inDSTTGD() {
        System.out.println("Nhap ten: ");
        for (String o : dsTheoTenGanDung(sc.nextLine())) {
            System.out.println(o);
        }
    }
    void sapXep() {
        for (int i = 0; i < sv.size()-1; i++) {
            for (int j = i+1; j < sv.size(); j++) {
                if(sv.get(i).compareToIgnoreCase(sv.get(i))>0) {
                    String temp=sv.get(i);
                    sv.set(i,sv.get(j));
                    sv.set(j,temp);
                }
            }
        }
    }

    void menu() {
        int i;
        do {
            System.out.println("1. Them moi");
            System.out.println("2. In danh sach ");
            System.out.println("3. Tim kiem ");
            System.out.println("4. Xoa SV theo ten ");
            System.out.println("5. Cap nhat SV theo ten ");
            System.out.println("6. In danh sach theo ten gan dung ");
            System.out.println("7. Cap nhat danh sach ");
            System.out.println("Moi chon CNCT: ");
            i = Integer.parseInt(sc.nextLine());
            switch (i) {
                case 1:
                    themMoi();
                    break;
                case 2:
                    inDanhSach();
                    break;
                //case 3: {
                //   String n=sc.nextLine();
                //}
                case 4:
                    xoa();
                    break;
                case 5:
                    capNhat();
                    break;
                case 6:
                    inDSTTGD();
                    break;
                case 7: 
                    sapXep();
                    break;
            }

        } while (i!= 0);
    }

    public static void main(String[] args) {
        Stringarrlist s = new Stringarrlist();

//        s.themMoi();
//        s.inDanhSach();
        s.menu();

    }

}
