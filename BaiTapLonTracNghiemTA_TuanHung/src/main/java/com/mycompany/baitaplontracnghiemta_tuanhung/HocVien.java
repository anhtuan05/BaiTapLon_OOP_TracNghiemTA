
import java.util.Calendar;

public class HocVien {

	private static int dem=0;

	private int maHV=++dem;

	private String hoTen;

	private String gioiTinh;

	private String queQuan;

	private Calendar ngaySinh;

	private Calendar ngayGiaNhap;
        
	public HocVien() {

	}

	public HocVien(String ten, String gt, String que, Calendar ngaySinh, Calendar ngayGiaNhap) {

	}
        
        public HocVien(String ten, String gt, String que, Calendar ngaySinh, String ngayGiaNhap) {

	}

	public void nhapHV() {

	}

	public void xuatHV() {

	}

    /**
     * @return the maHV
     */
    public int getMaHV() {
        return maHV;
    }

    /**
     * @param maHV the maHV to set
     */
    public void setMaHV(int maHV) {
        this.maHV = maHV;
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

}
