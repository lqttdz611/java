package dethi1_gui;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhMucSach {
    Scanner sc= new Scanner(System.in);
    ArrayList <DanhMuc> arr= new ArrayList<>();
    public void themVaoDS(DanhMuc dm) {
        arr.add(dm);
    }
    
    public int thongKeTT() {
        int tt1=0;
        for (DanhMuc dm : arr) {
            if(dm instanceof TieuThuyet) {
                tt1+=dm.getsL();
            } 
        }
        return tt1;
        }
    public int thongKeSGK() {
        int sgk2=0;
        for (DanhMuc danhMuc : arr) {
            if(danhMuc instanceof SachGiaoKhoa) {
                sgk2+=danhMuc.getsL();
            }
            
        }
        return sgk2;
    }
        public double maxGiaBanSGK() {
        double max=0;
        for (DanhMuc damu : arr) {
            
            if(damu instanceof SachGiaoKhoa) {
                if(damu.getGiaBan()>max) {
                    max=damu.getGiaBan();
                } 
            }
        } return max;
    }
    public double maxGiaBanTT() {
        double max=0;
        for (DanhMuc damu : arr) {
            if(damu instanceof TieuThuyet) {
                if(damu.getGiaBan()>max) {
                    max=damu.getGiaBan();
                } 
            } 
        }return max;
    }
}
