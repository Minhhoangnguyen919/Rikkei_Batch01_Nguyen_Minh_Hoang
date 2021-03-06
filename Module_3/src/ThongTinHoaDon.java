import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ThongTinHoaDon {
    protected  String MaHd;
    protected  String Makh;
    protected  String MaSp;
    protected  float soLuong;
    protected  Date NgayMua;
    protected  float DonGia;
    protected  float TongTien=0;

    ArrayList<ThongTinHoaDon> listHoaDon = new ArrayList<>();


    public String getMaHd() {
        return MaHd;
    }

    public void setMaHd(String maHd) {
        MaHd = maHd;
    }

    public String getMakh() {
        return Makh;
    }

    public void setMakh(String makh) {
        Makh = makh;
    }

    public String getMaSp() {
        return MaSp;
    }

    public void setMaSp(String maSp) {
        MaSp = maSp;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public Date getNgayMua() {
        return NgayMua;
    }

    public void setNgayMua(Date ngayMua) {
        NgayMua = ngayMua;
    }

    public float getDonGia() {
        return DonGia;
    }

    public void setDonGia(float donGia) {
        DonGia = donGia;
    }

    public float getTongTien() {
        return TongTien;
    }

    public void setTongTien(float tongTien) {
        TongTien = tongTien;
    }

    public ThongTinHoaDon(String maHd, String makh, String maSp, float soLuong, Date ngayMua, float donGia, float tongTien) {
        MaHd = maHd;
        Makh = makh;
        MaSp = maSp;
        this.soLuong = soLuong;
        NgayMua = ngayMua;
        DonGia = donGia;
        TongTien = tongTien;
    }

    public ThongTinHoaDon() {
    }

    @Override
    public String toString() {
        return "ThongTinHoaDon{" +
                "MaHd='" + MaHd + '\'' +
                ", Makh='" + Makh + '\'' +
                ", MaSp='" + MaSp + '\'' +
                ", soLuong=" + soLuong +
                ", NgayMua=" + NgayMua +
                ", DonGia=" + DonGia +
                ", TongTien=" + TongTien +
                '}';
    }
    public void hienThiThongTin(){
        System.out.println("---------Hien thi thong tin hoa don--------");
        System.out.println(listHoaDon);
    }
    public void Luufile() {
        String tenFile = "Donhang.csv";
        try {
            File file = new File(tenFile);
            if (file.createNewFile()){
                System.out.println("--------Create new file ------");
            }
            FileWriter fileWriter = new FileWriter(tenFile);

            fileWriter.write(this.toString());

            fileWriter.close();
            System.out.println("--------???? ghi ????n h??ng v??o file -------");

        } catch (Exception e){
            System.out.println("----------------------");
            System.out.println(e);
            System.out.println("-----------------------");
        }
    }
    public void them(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap M?? H??a ????n");
        MaHd = sc.nextLine();
        System.out.println("Nhap Ma Kh??ch hang");
        Makh = sc.nextLine();
        System.out.println("Nh???p v??o Ma Sp");
        MaSp= sc.nextLine();
        System.out.println("Nh???p v??o S??? l?????ng");
        soLuong= Integer.parseInt(sc.nextLine());
        while (soLuong<=0){
            System.out.println("Nhap lai so luong: ");
            soLuong=Integer.parseInt(sc.nextLine());
        }
        System.out.println("Nhap ng??y Mua");
        String ngaymuahang = sc.nextLine();
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            NgayMua = formatter.parse(ngaymuahang);
        } catch (Exception e){

        }
        System.out.println("Nh???p ????n gi??");
        DonGia = Float.parseFloat(sc.nextLine());
        ThongTinHoaDon hoaDon = new ThongTinHoaDon( MaHd,Makh,MaSp,soLuong,NgayMua,DonGia,TongTien );
        listHoaDon.add(hoaDon);
        for (ThongTinHoaDon dc :
                listHoaDon) {
            dc.Luufile();
        }
    }





}
