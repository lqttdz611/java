/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlgd;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class DanhSachGiaoDich {
    ArrayList<GiaoDich> arr = new ArrayList<>();
    public void themMoi(GiaoDich gd) {
        arr.add(gd);
    }
    public boolean xoaTheoMaGD(String maGD) {
        for (GiaoDich gd : arr) {
            if(gd.getMaGD().equalsIgnoreCase(maGD)) {
                arr.remove(gd);
                return true;
            }
            
        } return false;
    }

}
//V1,01/01/2022,10,10000,SJC,0,0
//V2,02/01/2022,20,20000,K18,0,0
//TT1,01/01/2022,30,0,23000,USD

