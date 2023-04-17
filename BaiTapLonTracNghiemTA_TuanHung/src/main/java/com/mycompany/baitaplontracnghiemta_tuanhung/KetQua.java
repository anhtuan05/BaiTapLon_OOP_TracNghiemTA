
import com.mycompany.baitaplontracnghiemta_tuanhung.CauHinh;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class KetQua {
        
	private Calendar ngayLamBai;

	private double diem;
        
        private HocVien hocVien;
        
        private BaiTap baiTap;
        
        {
            this.setNgayLamBai(new GregorianCalendar());
        }

    public KetQua() {
    }
    
    public void taoBT(){
        System.out.printf("Nhap ID cua ban %s:", CauHinh.s.nextLine());
        
    }
        
    public void hienThiKQ(){
        System.out.printf("%s Diem: %.1f\n",this.baiTap.hienThiBT(),this.diem);
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
