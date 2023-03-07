/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dethithayhien_project;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class DanhMucSach {
    ArrayList<DanhMuc> a=new ArrayList<>();
    public  void themVaoDS(DanhMuc dm){
    a.add(dm);
    }
    public void thongKeSach(){
        int t1=0,t2=0;
        for (DanhMuc damu : a) {
            if (damu instanceof SachGiaoKhoa) {
                t1+=damu.getSL();
            } else {
                t2+=damu.getSL();
            }
        }
        System.out.println("Tong SL SGK: "+t1);
        System.out.println("Tong SL Tieu Thuyet: "+t2);
    }
//    public double maxGiaBan() {
//        int max=0;
//        for (DanhMuc damu : a) {
//            int max1=damu.getGiaBan();
//            if(damu instanceof SachGiaoKhoa) {
//                if(damu.getGiaBan()>max) {
//                    max=damu.getGiaBan();
//                } 
//            } else {
//                max=damu.getGiaBan();
//            }
//        } return max;
//    }
    public double maxGiaBanSGK() {
        int max=0;
        for (DanhMuc damu : a) {
            
            if(damu instanceof SachGiaoKhoa) {
                if(damu.getGiaBan()>max) {
                    max=damu.getGiaBan();
                } 
            }
        } return max;
    }
    public double maxGiaBanTT() {
        int max=0;
        for (DanhMuc damu : a) {
            if(damu instanceof TieuThuyet) {
                if(damu.getGiaBan()>max) {
                    max=damu.getGiaBan();
                } 
            } 
        }return max;
    }
    public ArrayList<DanhMuc> dsmoitheoGiaBan(){
        ArrayList<DanhMuc> dmgiaBan = new ArrayList<>();
        for (DanhMuc damu : a) {
            if(damu instanceof SachGiaoKhoa) {
                if(damu.getGiaBan()==maxGiaBanSGK()) {
                    dmgiaBan.add(damu);
                }
            } else {
                if(damu.getGiaBan()==maxGiaBanTT()) {
                    dmgiaBan.add(damu);
                }
            }
            
        } return dmgiaBan;
    }
    
    public double maxTT() {
        double max=0;
        for (DanhMuc damu : a) {
            if(damu.tinhThanhTien()>max) {
                max=damu.tinhThanhTien();
            }
        } return max;
    }
    public ArrayList<DanhMuc> inDSMaxTT() {
        ArrayList<DanhMuc> dsnew= new ArrayList<>();
        for (DanhMuc damu : a) {
            if(damu.tinhThanhTien()==maxTT())
                dsnew.add(damu);
            }
        return dsnew;
        }
    public void sapXepGD() {
            
        for (int i = 0; i < a.size()-1; i++) {
            for (int j = i+1; j < a.size(); j++) {
                if(a.get(i).getGiaBan()<a.get(j).getGiaBan()) {
                    DanhMuc temp=a.set(i, a.get(i));
                    a.set(i, a.get(j));
                    a.set(j, temp);
                }
            }
        }
    }
    
    
}
