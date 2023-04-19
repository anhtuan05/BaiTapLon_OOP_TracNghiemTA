/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.baitaplontracnghiemta_tuanhung;

import java.io.FileNotFoundException;
import java.text.ParseException;

/**
 *
 * @author nguye
 */
public class BaiTapLonTracNghiemTA_TuanHung {

    public static void main(String[] args) throws FileNotFoundException, ParseException {

//        HocVien h1 = new HocVien("HV16", "NA", "Nam", "QN", "05/03/2002");
//        HocVien h2 = new HocVien("HV17", "NAT", "Nam", "QN", "05/03/2002");
//        HocVien h3 = new HocVien("HV18", "NAT", "Nam", "QN", "05/03/2002");
//        HocVien h4 = new HocVien("HV19", "NAT", "Nam", "QN", "05/03/2002");
        QLHocVien ds = new QLHocVien();
        //ds.themHV(h1,h2,h3,h4);
        ds.themHV("src/main/resources/HocVien.txt");
        ds.xuatDSHV();
        System.out.println("------------------------------------\n");
        ds.timKiemHVTheoTen("Lai Bac Nam").forEach(i->i.xuatHV());
        
        System.out.println("------------------------------------\n");
        ds.timKiemHVTheoGT("Nam").forEach(i->i.xuatHV());
        
        System.out.println("------------------------------------\n");
        ds.timKiemTheoQQ("TpHCM").forEach(i->i.xuatHV());
        
        System.out.println("------------------------------------\n");
        ds.timHVTheoID("HV01").xuatHV();
    }
}


