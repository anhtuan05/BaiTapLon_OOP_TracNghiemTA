
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
        this.dsHocVien.addAll(Arrays.asList(h));
    }

    public void themHV(String path) throws FileNotFoundException, ParseException {
        File f = new File(path);
        try (Scanner sc = new Scanner(f)) {
            while (sc.hasNext()) {
                HocVien h = new HocVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
                this.dsHocVien.add(h);
            }
        }
    }
    
    public void themHV(int n) throws ParseException {
        for (int i = 1; i <= n; i++) {
            System.out.printf("Nhap HV thu %d\n", i);
            HocVien h = new HocVien();
            h.nhapHV();
            this.dsHocVien.add(h);
        }
    }
    
    public void tinhtbDSHV(int thang, int nam){
        this.dsHocVien.forEach(i->System.out.println(i.tinhDiemTBThang(thang, nam)));
    }    
    public void xoaHV(HocVien...h){
        this.dsHocVien.removeAll(Arrays.asList(h));
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
    
    public HocVien timHVTheoID(int id){
        return (HocVien) this.dsHocVien.stream().filter(i->i.getMaHV()==id);
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
