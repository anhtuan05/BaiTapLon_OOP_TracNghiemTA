/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitaplontracnghiemta_tuanhung;

/**
 *
 * @author nguye
 */

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.OptionalDouble;

public class HocVien {
   
    private String maHV ;
    
    private String hoTen;
    
    private String gioiTinh;
    
    private String queQuan;
    
    private Calendar ngaySinh;
    
    private Calendar ngayGiaNhap;
    
    private List<KetQua> ketQua;

    //set ngayGiaNhap là ngày tạo đối tượng
    {
        this.ketQua = new ArrayList<>();
        this.setNgayGiaNhap(new GregorianCalendar());
    }
    
    public HocVien() {
        
    }
    
    public double tinhDiemTBThang(int thang, int nam) {
        OptionalDouble dtb = this.ketQua.stream().mapToDouble(d -> {
            
            if (d.getNgayLamBai().get(Calendar.MONTH) == thang
                    && d.getNgayLamBai().get(Calendar.YEAR) == nam) {
                return d.getDiem();
            } else {
                return 0;
            }
        }).average();
        
        return dtb.isPresent() ? dtb.getAsDouble() : -1.0;  // dtb rỗng(isPresent()) thì trả về -1
    }
    
    public HocVien(String maHV, String hoTen, String gioiTinh, String queQuan, Calendar ngaySinh) {
        this.maHV = maHV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
    }
    
    public HocVien(String maHV, String hoTen, String gioiTinh, String queQuan, String ngaySinh) throws ParseException {
        this.maHV = maHV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        Calendar c = Calendar.getInstance();
        c.setTime(CauHinh.f.parse(ngaySinh));
        this.ngaySinh = c;
    }
    
    public void nhapHV() throws ParseException {
        System.out.print("HoTen: ");
        this.hoTen = CauHinh.s.nextLine();
        
        System.out.print("GioiTinh: ");
        this.gioiTinh = CauHinh.s.nextLine();
        
        System.out.print("QueQuan: ");
        this.queQuan = CauHinh.s.nextLine();
        
        System.out.print("NgaySinh: ");
        Calendar c = Calendar.getInstance();
        c.setTime(CauHinh.f.parse(CauHinh.s.nextLine()));
        this.ngaySinh = c;
    }
    
    public void suaHV() throws ParseException {
        this.nhapHV();
    }
    
    public void xuatHV() {
        System.out.printf("ID: %s\n", this.getMaHV());
        System.out.printf("HoTen: %s\n", this.hoTen);
        System.out.printf("GioiTinh: %s\n", this.gioiTinh);
        System.out.printf("QueQuan: %s\n", this.queQuan);
        System.out.printf("NgaySinh: %s\n", CauHinh.f.format(this.ngaySinh.getTime()));
        System.out.printf("NgayGiaNhap: %s\n\n", CauHinh.f.format(this.ngayGiaNhap.getTime()));
        
        if (!this.ketQua.isEmpty()) {
            this.ketQua.forEach(i -> i.hienThiKQ());
        }
    }
    
    //ghi HV vao file HocVien.txt
    public void ghiHVText(){
        
    }
    
    public void xoaHVText(){
        
    }


    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the gioiTinh
     */
    public String getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the queQuan
     */
    public String getQueQuan() {
        return queQuan;
    }

    /**
     * @param queQuan the queQuan to set
     */
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    /**
     * @return the ngaySinh
     */
    public Calendar getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(Calendar ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the ngayGiaNhap
     */
    public Calendar getNgayGiaNhap() {
        return ngayGiaNhap;
    }

    /**
     * @param ngayGiaNhap the ngayGiaNhap to set
     */
    public void setNgayGiaNhap(Calendar ngayGiaNhap) {
        this.ngayGiaNhap = ngayGiaNhap;
    }

    /**
     * @return the ketQua
     */
    public List<KetQua> getKetQua() {
        return ketQua;
    }

    /**
     * @param ketQua the ketQua to set
     */
    public void setKetQua(List<KetQua> ketQua) {
        this.ketQua = ketQua;
    }

    /**
     * @return the maHV
     */
    public String getMaHV() {
        return maHV;
    }

    /**
     * @param maHV the maHV to set
     */
    public void setMaHV(String maHV) {
        this.maHV = maHV;
    }
    
}


