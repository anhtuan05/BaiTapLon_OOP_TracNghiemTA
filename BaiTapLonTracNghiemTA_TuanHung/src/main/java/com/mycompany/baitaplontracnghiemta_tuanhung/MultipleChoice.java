/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitaplontracnghiemta_tuanhung;

/**
 *
 * @author nguye
 */
import java.util.ArrayList;
import java.util.List;

public class MultipleChoice {

	private static int dem=0;

	private int maCauHoi=++dem;

	private String noiDung;

	private CapDo capDo;

	private DanhMuc danhMuc;

	private List<PhuongAn> phuongAn=new ArrayList<>();

	private PhuongAn pADung;

    public MultipleChoice(String noiDung,CapDo capDo,DanhMuc danhMuc, PhuongAn pADung) {
        this.noiDung = noiDung;
        this.capDo = capDo;
        this.danhMuc = danhMuc;
        this.pADung = pADung;
    }
    public void themPhuongAn(PhuongAn pa){
        phuongAn.add(pa);
    }
    
    public void hienThi() {
            System.out.println("Cau hoi: "+noiDung);
            System.out.println();
            phuongAn.forEach(s->{System.out.print(s + "\t");});
            System.out.println();
	}
    /**
     * @return the maCauHoi
     */
    public int getMaCauHoi() {
        return maCauHoi;
    }

    /**
     * @param maCauHoi the maCauHoi to set
     */
    public void setMaCauHoi(int maCauHoi) {
        this.maCauHoi = maCauHoi;
    }

    /**
     * @return the noiDung
     */
    public String getNoiDung() {
        return noiDung;
    }

    /**
     * @param noiDung the noiDung to set
     */
    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    /**
     * @return the capDo
     */
    public CapDo getCapDo() {
        return capDo;
    }

    /**
     * @param capDo the capDo to set
     */
    public void setCapDo(CapDo capDo) {
        this.capDo = capDo;
    }

    /**
     * @return the danhMuc
     */
    public DanhMuc getDanhMuc() {
        return danhMuc;
    }

    /**
     * @param danhMuc the danhMuc to set
     */
    public void setDanhMuc(DanhMuc danhMuc) {
        this.danhMuc = danhMuc;
    }

    /**
     * @return the phuongAn
     */
    public List<PhuongAn> getPhuongAn() {
        return phuongAn;
    }

    /**
     * @param phuongAn the phuongAn to set
     */
    public void setPhuongAn(List<PhuongAn> phuongAn) {
        this.phuongAn = phuongAn;
    }

    /**
     * @return the pADung
     */
    public PhuongAn getpADung() {
        return pADung;
    }

    /**
     * @param pADung the pADung to set
     */
    public void setpADung(PhuongAn pADung) {
        this.pADung = pADung;
    }

}
