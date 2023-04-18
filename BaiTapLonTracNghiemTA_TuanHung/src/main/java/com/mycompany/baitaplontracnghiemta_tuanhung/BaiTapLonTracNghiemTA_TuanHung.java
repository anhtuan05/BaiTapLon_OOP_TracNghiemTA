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
        
        HocVien h1 = new HocVien("HV11", "NAT", "Nam", "QN", "05/03/2002");
        HocVien h2 = new HocVien("HV11", "NAT", "Nam", "QN", "05/03/2002");
        HocVien h3 = new HocVien("HV11", "NAT", "Nam", "QN", "05/03/2002");
        HocVien h4 = new HocVien("HV11", "NAT", "Nam", "QN", "05/03/2002");
        QLHocVien ds = new QLHocVien();
        ds.themHV(h1,h2,h3,h4);
        ds.themHV("src/main/resources/HocVien.txt");
        ds.xuatDSHV();
    }
}




