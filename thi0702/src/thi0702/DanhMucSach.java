/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thi0702;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author FORMAI
 */
public class DanhMucSach {
    ArrayList<DanhMuc> arr= new ArrayList<>();
    public void themVaoDS(DanhMuc dm) {
        arr.add(dm);
    }
    public boolean xoaTheoMa(String maS) {
        for (DanhMuc danhMuc : arr) {
            if(danhMuc.getMaS().equalsIgnoreCase(maS)) {
                arr.remove(danhMuc);
                return true;
                
            }
        }
        
        return false;
    }
    public double maxSGK() {
        double msgk=0;
        for (DanhMuc danhMuc : arr) {
            if(danhMuc instanceof SachGiaoKhoa) {
            if(danhMuc.getGiaBan()>msgk) {
                msgk=danhMuc.getGiaBan();
            }
        }
        }
        return msgk;
    }
    public double maxTT() {
        double mtt=0;
        for (DanhMuc danhMuc : arr) {
            if(danhMuc instanceof TieuThuyet) {
                if(danhMuc.getGiaBan()>mtt) {
                    mtt=danhMuc.getGiaBan();
                }
            }
        }
        return mtt;
    }
}
