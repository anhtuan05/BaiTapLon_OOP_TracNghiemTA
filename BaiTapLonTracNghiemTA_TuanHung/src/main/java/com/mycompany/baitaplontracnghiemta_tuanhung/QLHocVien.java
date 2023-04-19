/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitaplontracnghiemta_tuanhung;

/**
 *
 * @author nguye
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QLHocVien {

    private List<HocVien> dsHocVien = new ArrayList<>();

    public void themHV(HocVien... h) {
        List<HocVien> ds = Arrays.asList(h);
        this.dsHocVien.addAll(ds);

        //ds.forEach(i -> i.ghiHVText()); //ghi học viên vào file text
    }

    public void themHV(String path) throws FileNotFoundException, ParseException {
        File f = new File(path);
        try (Scanner sc = new Scanner(f)) {
            while (sc.hasNext()) {
                HocVien h = new HocVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
                this.dsHocVien.add(h);
            }
        }
    }

    public void themHV(int n) throws ParseException {
        for (int i = 1; i <= n; i++) {
            System.out.printf("Nhap HV thu %d\n", i);
            HocVien h = new HocVien();
            h.nhapHV();
            //h.ghiHVText(); //ghi học viên vào file text
            this.dsHocVien.add(h);
        }
    }

    public void xoaHV(HocVien... h) {
        List<HocVien> ds = Arrays.asList(h);
        
        // xóa bài tập -> kết quả -> học viên
        
        this.dsHocVien.removeAll(Arrays.asList(ds));
        
        //ds.forEach(i->i.xoaHVText()); //xóa học viên khỏi file text
    }

    public List<HocVien> timKiemHVTheoTen(String t) {
        return this.dsHocVien.stream().filter(i -> i.getHoTen().equals(t))
                .collect(Collectors.toList());

    }

    public List<HocVien> timKiemHVTheoGT(String gt) {
        return this.dsHocVien.stream().filter(i -> i.getGioiTinh().equals(gt))
                .collect(Collectors.toList());
    }

    public List<HocVien> timKiemTheoQQ(String q) {
        return this.dsHocVien.stream().filter(i -> i.getQueQuan().equals(q))
                .collect(Collectors.toList());
    }

    public HocVien timHVTheoID(String id) {
        HocVien h = new HocVien();
        for (int i=0; i<this.dsHocVien.size();i++){
            if (this.dsHocVien.get(i).getMaHV().equals(id))
                h = this.dsHocVien.get(i);
        }
        return h;
    }

    public void xuatDSHV() {
        this.dsHocVien.forEach(i -> i.xuatHV());
    }

    /**
     * @return the dsHocVien
     */
    public List<HocVien> getDsHocVien() {
        return dsHocVien;
    }

    /**
     * @param dsHocVien the dsHocVien to set
     */
    public void setDsHocVien(List<HocVien> dsHocVien) {
        this.dsHocVien = dsHocVien;
    }

}
