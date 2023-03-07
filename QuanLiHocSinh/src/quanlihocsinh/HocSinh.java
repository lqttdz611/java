
package quanlihocsinh;

import java.util.Scanner;

public class HocSinh {
    private String hoTen,lop;
    private double diemToan,diemLi,diemHoa;

//    HocSinh() {
//    hoTen="Trong Tinh";
//    diemToan= 7;
//}
    
    HocSinh() {
        
    }
    public HocSinh(String hoTen, String lop, double diemToan, double diemLi, double diemHoa) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.diemToan = diemToan;
        this.diemLi = diemLi;
        this.diemHoa = diemHoa;
    }
    void nhap() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap ten: ");
        hoTen=sc.nextLine();
        System.out.print("Nhap lop: ");
        lop=sc.nextLine();
        System.out.println("Nhap diem toan, ly , hoa: ");
        diemToan=sc.nextDouble();
        diemLi=sc.nextDouble();
        diemHoa=sc.nextDouble();
    }
    double tinhdiemTB() {
        return (diemToan+diemLi+diemHoa)/3;
    }
    String diemTB() {
        return hoTen + "\t" + lop +  "\t" + tinhdiemTB();
    }
    
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        if(diemToan<0) {
            System.out.println("Nhap sai");
        }
        this.diemToan = diemToan;
    }

    public double getDiemLi() {
        return diemLi;
    }

    public void setDiemLi(double diemLi) {
        this.diemLi = diemLi;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }

    
    @Override
    public String toString() {
    
        return hoTen + "\t" + lop + "\t" + diemToan +" "+ diemLi +" "+ diemHoa;
    }
    
}
