/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitaplontracnghiemta_tuanhung;

/**
 *
 * @author nguye
 */
import static com.mycompany.baitaplontracnghiemta_tuanhung.CauHinh.s;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class BaiTap {

    public static QLCauHoi dsCH = new QLCauHoi();

    private static int dem = 0;
    private String tenBaiTap;

    {
        this.tenBaiTap = String.format("BT%03d", ++dem);
    }
    private List<MultipleChoice> dSMultipleChoice;
    private Incomplete incomplete;
    private Conversation conversation;

    private KetQua ketQua;

    {
        this.dSMultipleChoice = new ArrayList<>();
    }

    public BaiTap() {
    }

    public void taoBT(int soCauHoi) { //Tao BT MultipleChoice
        List<MultipleChoice> dsTatCaMCChuaLam = dsCH.dsMutipleChoice();
        List<MultipleChoice> dsTatCaMCDalam = new ArrayList<>();

        dsTatCaMCDalam.addAll(this.ketQua.getHocVien().getKetQua()
                .forEach(i -> i.getBaiTap().getdSMutipleChoice()).collect(Collectors.toList()));

        dsTatCaMCChuaLam.removeAll(dsTatCaMCDalam);
        for (int i = 0; i < soCauHoi; i++) {
            this.dSMultipleChoice.add(dsTatCaMCChuaLam.get(i));
        }
    }

    public void taoBT(String capDo) { //Tao BT Incomplete
        List<Incomplete> dsTatCaI = dsCH.dsIncomplete();

        List<Incomplete> dsTamI = dsTatCaI.stream().filter(i -> i.getCapDo().equals(capDo))
                .collect(Collectors.toList());

        Random r = new Random();
        int u = r.nextInt(dsTamI.size());
        this.incomplete = dsTamI.get(u);
    }

    public void taoBT(String capDo, int n) { //Tao BT Conversation
        List<Conversation> dsTatCaC = dsCH.dsConversation();

        List<Conversation> dsTamC = dsTatCaC.stream().filter(i -> i.getCapDo().equals(capDo))
                .collect(Collectors.toList());

        Random r = new Random();
        int u = r.nextInt(dsTamC.size());
        this.conversation = dsTamC.get(u);
    }

    public double tinhDiem() {
        String pa;
        int dem = 0;
        int soCau = 1;
        if (!this.dSMultipleChoice.isEmpty()) {
            soCau = this.dSMultipleChoice.size();
            for (int i = 0; i < soCau; i++) {
                this.dSMultipleChoice.get(i).hienThi();
                System.out.println("Nhap dap an: ");
                pa = s.nextLine();
                if (pa.equals(this.dSMultipleChoice.get(i).getpADung())) {
                    dem++;
                }
            }
        }
        return (10 / soCau) * dem;
    }

    public String hienThiBT() {
        return String.format("BaiTap: %s    ", this.tenBaiTap);
    }

    /**
     * @return the dSMutipleChoice
     */
    public List<MultipleChoice> getdSMutipleChoice() {
        return dSMultipleChoice;
    }

    /**
     * @param dSMutipleChoice the dSMutipleChoice to set
     */
    public void setdSMutipleChoice(List<MultipleChoice> dSMutipleChoice) {
        this.dSMultipleChoice = dSMutipleChoice;
    }

    /**
     * @return the tenBaiTap
     */
    public String getTenBaiTap() {
        return tenBaiTap;
    }

    /**
     * @param tenBaiTap the tenBaiTap to set
     */
    public void setTenBaiTap(String tenBaiTap) {
        this.tenBaiTap = tenBaiTap;
    }

    /**
     * @return the ketQua
     */
    public KetQua getKetQua() {
        return ketQua;
    }

    /**
     * @param ketQua the ketQua to set
     */
    public void setKetQua(KetQua ketQua) {
        this.ketQua = ketQua;
    }

    /**
     * @return the incomplete
     */
    public Incomplete getIncomplete() {
        return incomplete;
    }

    /**
     * @param incomplete the incomplete to set
     */
    public void setIncomplete(Incomplete incomplete) {
        this.incomplete = incomplete;
    }

    /**
     * @return the conversation
     */
    public Conversation getConversation() {
        return conversation;
    }

    /**
     * @param conversation the conversation to set
     */
    public void setConversation(Conversation conversation) {
        this.conversation = conversation;
    }

}
