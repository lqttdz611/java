package learnarraylist;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Learnarraylist {

    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> a = new ArrayList<>();

    void them(int x) {
        a.add(x);
    }

    void themMoi() {
        System.out.println("Nhap gia tri: ");
        int x = sc.nextInt();
        them(x);
    }

    void inDanhSach() {
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }
    }
    boolean xoaPhanTu(int x) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i)==x) {
                a.remove(a.get(i));
                return true;
            }
        }
        return false;
    }
//    void xoaPhantu(int x) {
//        for (int i = 0; i < a.size(); i++) {
//            if(a.get(i)==x){
//                a.remove(a.get(i));
//                break;
//            }
//        }
//    }
    void xoa() {
        int x=Integer.parseInt(sc.nextLine());
        if (xoaPhanTu(x)) {
            System.out.println("Xoa PT thanh cong!");
        } else {
            System.out.println("Xoa PT khong thanh cong! ");
        }
    }
    boolean timPT(int x) {
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i)==x) {
                return true;
            }
        }
        return false;
    }
    void timkiem() {
        System.out.println("Nhap gia tri can tim: ");
        int x=Integer.parseInt(sc.nextLine());
        if(timPT(x)) {
            System.out.println("Da tim thay ");
        } else {    System.out.println("K tim thay ");
    }
    }
    void sapXep() {
//        for (int i = 0; i < a.size()-1; i++) {
//            for (int j = i+1; j < a.size(); j++) {
//                if(a.get(i)>a.get(j)) {
//                    int temp=a.get(i);
//                    a.set(i,a.get(j));
//                    a.set(j,temp);
//                }
//            }
//        }
            Collections.sort(a);
    }

    void menu() {
        int i;
        do {
            System.out.println("1. Them moi");
            System.out.println("2. In danh sach ");
            System.out.println("3. Xoa Phan tu ");
            System.out.println("4. Tim kiem Phan tu ");
            System.out.println("5. Sap xep cac Phan tu ");
            System.out.println("Moi chon CNCT: ");
            i = sc.nextInt();
            switch(i) {
                case 1:
                    themMoi();
                    break;
                case 2:
                    inDanhSach();
                    break;
                case 3: 
                    xoa();
                    break;
                case 4:
                    timkiem();
                    break;
                case 5:
                {   sapXep();
                    inDanhSach();
                    break;        
                            }
                    
            }
        } while (i != 0);
    }

    public static void main(String[] args) {
        /*        int n=10;
          ArrayList<Integer> arr = new ArrayList<Integer>(n);
          for (int i = 0; i <= n; i++) 
          arr.add(i);
          System.out.println(arr);
         */
        Learnarraylist l = new Learnarraylist();
//        l.themMoi();
//        l.inDanhSach();
        l.menu();
    }

}
