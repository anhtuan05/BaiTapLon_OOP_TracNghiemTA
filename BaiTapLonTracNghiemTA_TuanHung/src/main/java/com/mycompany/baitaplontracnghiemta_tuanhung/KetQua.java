/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitaplontracnghiemta_tuanhung;

/**
 *
 * @author nguye
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class KetQua {

    public static QLHocVien dsHV = new QLHocVien();

    private Calendar ngayLamBai;

    private double diem;

    private HocVien hocVien;

    private BaiTap baiTap;

    {
        this.setNgayLamBai(new GregorianCalendar());
    }

    public KetQua() {
    }

    public void luyenTap(int soCauHoi) { //MutipleChoice

        System.out.print("Nhap ID cua ban %s: ");
        this.hocVien = dsHV.timHVTheoID(CauHinh.s.nextLine());
        this.hocVien.getKetQua().add(this);

        BaiTap bT = new BaiTap();
        this.baiTap.setKetQua(this);
        bT.taoBT(soCauHoi);
        this.baiTap = bT;

        this.diem = bT.tinhDiem();
    }

    public void luyenTap(String capDo) {//Incomplete

        System.out.print("Nhap ID cua ban %s: ");
        this.hocVien = dsHV.timHVTheoID(CauHinh.s.nextLine());
        this.hocVien.getKetQua().add(this);

        BaiTap bT = new BaiTap();
        bT.taoBT(capDo);
        this.baiTap.setKetQua(this);
        this.baiTap = bT;

        this.diem = bT.tinhDiem();
    }

    public void luyenTap(String capDo, int n) {//Conversation

        System.out.print("Nhap ID cua ban %s: ");
        this.hocVien = dsHV.timHVTheoID(CauHinh.s.nextLine());
        this.hocVien.getKetQua().add(this);

        BaiTap bT = new BaiTap();
        bT.taoBT(capDo, n);
        this.baiTap.setKetQua(this);
        this.baiTap = bT;

        this.diem = bT.tinhDiem();
    }

    public void hienThiKQ() {
        System.out.printf("%s Diem: %.1f\n", this.baiTap.hienThiBT(), this.diem);
    }

    /**
     * @return the ngayLamBai
     */
    public Calendar getNgayLamBai() {
        return ngayLamBai;
    }

    /**
     * @param ngayLamBai the ngayLamBai to set
     */
    public void setNgayLamBai(Calendar ngayLamBai) {
        this.ngayLamBai = ngayLamBai;
    }

    /**
     * @return the diem
     */
    public double getDiem() {
        return diem;
    }

    /**
     * @param diem the diem to set
     */
    public void setDiem(double diem) {
        this.diem = diem;
    }

    /**
     * @return the hocVien
     */
    public HocVien getHocVien() {
        return hocVien;
    }

    /**
     * @param hocVien the hocVien to set
     */
    public void setHocVien(HocVien hocVien) {
        this.hocVien = hocVien;
    }

    /**
     * @return the baiTap
     */
    public BaiTap getBaiTap() {
        return baiTap;
    }

    /**
     * @param baiTap the baiTap to set
     */
    public void setBaiTap(BaiTap baiTap) {
        this.baiTap = baiTap;
    }

}

