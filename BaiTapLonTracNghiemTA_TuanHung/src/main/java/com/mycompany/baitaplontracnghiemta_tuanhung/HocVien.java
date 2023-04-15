
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class HocVien {

    public static final SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
    public static final Scanner s = new Scanner(System.in);

    private static int dem = 0;

    private int maHV = ++dem;

    private String hoTen;

    private String gioiTinh;

    private String queQuan;

    private Calendar ngaySinh;

    private Calendar ngayGiaNhap;

    //set ngayGiaNhap là ngày tạo đối tượng
    {
        this.setNgayGiaNhap(new GregorianCalendar());
    }

    public HocVien() {

    }

    public HocVien(String hoTen, String gioiTinh, String queQuan, Calendar ngaySinh) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
    }

    public HocVien(String hoTen, String gioiTinh, String queQuan, String ngaySinh) throws ParseException {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        Calendar c = Calendar.getInstance();
        c.setTime(f.parse(ngaySinh));
        this.ngaySinh = c;
    }

    public void nhapHV() throws ParseException {
        System.out.print("HoTen: ");
        this.hoTen = s.nextLine();
        
        System.out.print("GioiTinh: ");
        this.gioiTinh = s.nextLine();
        
        System.out.print("QueQuan: ");
        this.queQuan = s.nextLine();
        
        System.out.print("NgaySinh: ");
         Calendar c = Calendar.getInstance();
        c.setTime(f.parse(s.nextLine()));
        this.ngaySinh = c;
    }

    public void xuatHV() {
        System.out.printf("ID: %d\n", this.maHV);
        System.out.printf("HoTen: %s\n", this.hoTen);
        System.out.printf("GioiTinh: %s\n", this.gioiTinh);
        System.out.printf("QueQuan: %s\n", this.queQuan);
        System.out.printf("NgaySinh: %s\n", f.format(this.ngaySinh.getTime()));
        System.out.printf("NgayGiaNhap: %s\n", f.format(this.ngayGiaNhap.getTime()));
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
