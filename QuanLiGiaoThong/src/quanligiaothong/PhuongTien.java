package quanligiaothong;

import java.util.Scanner;

public class PhuongTien {
    private String hoTen, loaixe;
    private int dungTich;
    private double triGia;

    public PhuongTien() {
    }

    public PhuongTien(String hoTen, String loaixe, int dungTich, double triGia) {
        this.hoTen = hoTen;
        this.loaixe = loaixe;
        this.dungTich = dungTich;
        this.triGia = triGia;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLoaixe() {
        return loaixe;
    }

    public void setLoaixe(String loaixe) {
        this.loaixe = loaixe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }
//    void nhap() {
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Nhap ten chu xe: ");
//        hoTen=sc.nextLine();
//        System.out.print("Nhap loai xe: ");
//        loaixe=sc.nextLine();
//        System.out.print("Nhap dung tich: ");
//        dungTich=parse
//    }
    double thuePhaiNop() {
        if(triGia<=1000) 
            return (triGia*1/100);
        if(triGia>=1000 && triGia<=2000) 
            return (triGia*3/100);
        else return (triGia*5/100);
    }
    

    @Override
    public String toString() {
        return hoTen + "\t" + loaixe + "\t" + dungTich + "\t" +(int)triGia+ "\t" + (int)thuePhaiNop();
    }

}