import java.util.ArrayList;
import java.util.Scanner;

public class DungCuHocTap extends SanPham {

    public String XuatXu;
    public String ThuongHieu;
    public String NhaCungCap;
    public String HuongDanSuDung;
    public String MauSac;
    public String ChatLieu;
    public float KichThuoc;
    ArrayList<DungCuHocTap> listDungCu = new ArrayList<>();
    public String getXuatXu() {
        return XuatXu;
    }

    public void setXuatXu(String xuatXu) {
        XuatXu = xuatXu;
    }

    public String getThuongHieu() {
        return ThuongHieu;
    }

    public void setThuongHieu(String thuongHieu) {
        ThuongHieu = thuongHieu;
    }

    public String getNhaCungCap() {
        return NhaCungCap;
    }

    public void setNhaCungCap(String nhaCungCap) {
        NhaCungCap = nhaCungCap;
    }

    public String getHuongDanSuDung() {
        return HuongDanSuDung;
    }

    public void setHuongDanSuDung(String huongDanSuDung) {
        HuongDanSuDung = huongDanSuDung;
    }

    public String getMauSac() {
        return MauSac;
    }

    public void setMauSac(String mauSac) {
        MauSac = mauSac;
    }

    public String getChatLieu() {
        return ChatLieu;
    }

    public void setChatLieu(String chatLieu) {
        ChatLieu = chatLieu;
    }

    public float getKichThuoc() {
        return KichThuoc;
    }

    public void setKichThuoc(float kichThuoc) {
        KichThuoc = kichThuoc;
    }

    public DungCuHocTap(String maSp, String tenSp, int soLuong, float donGia, String thuocDanhMuc, String xuatXu, String thuongHieu, String nhaCungCap, String huongDanSuDung, String mauSac, String chatLieu, float kichThuoc) {
        super(maSp, tenSp, soLuong, donGia, thuocDanhMuc);
        XuatXu = xuatXu;
        ThuongHieu = thuongHieu;
        NhaCungCap = nhaCungCap;
        HuongDanSuDung = huongDanSuDung;
        MauSac = mauSac;
        ChatLieu = chatLieu;
        KichThuoc = kichThuoc;
    }
    public DungCuHocTap(){

    }

    @Override
    public String toString() {
        return "DungCuHocTap{" +
                "XuatXu='" + XuatXu + '\'' +
                ", ThuongHieu='" + ThuongHieu + '\'' +
                ", NhaCungCap='" + NhaCungCap + '\'' +
                ", HuongDanSuDung='" + HuongDanSuDung + '\'' +
                ", MauSac='" + MauSac + '\'' +
                ", ChatLieu='" + ChatLieu + '\'' +
                ", KichThuoc=" + KichThuoc +
                ", MaSp='" + MaSp + '\'' +
                ", TenSp='" + TenSp + '\'' +
                ", SoLuong=" + SoLuong +
                ", DonGia=" + DonGia +
                ", ThuocDanhMuc='" + ThuocDanhMuc + '\'' +
                '}';
    }

    @Override
    public void HienThiThongTin() {
        System.out.println(listDungCu);
    }


    @Override
    public double PhanTramGiamGia(String LoaiKh) {
        if(LoaiKh.equals("Thường")) return 0.01;
        else if(LoaiKh.equals("VIP1")) return 0.03;
        else if(LoaiKh.equals("VIP2")) return 0.07;
        else return 0;
    }

    public void them(){
        super.them();
        Scanner sc = new Scanner(System.in);
        System.out.println("=========NHAP DUNG CU HOC TAP=======");
        System.out.println("Nhap vao xuat xu");
        XuatXu = sc.nextLine();
        System.out.println("Nhap thuong hieu");
        ThuongHieu = sc.nextLine();
        System.out.println("Nhap nha cung cap");
        NhaCungCap = sc.nextLine();
        System.out.println("Nhap huong dan su dung");
        HuongDanSuDung = sc.nextLine();
        System.out.println("Nhap mau sắc");
        MauSac = sc.nextLine();
        System.out.println("Nhap Chat lieu");
        ChatLieu = sc.nextLine();
        System.out.println("Nhap kich thuoc");
        KichThuoc = Float.parseFloat(sc.nextLine());
        DungCuHocTap dungcu= new DungCuHocTap(MaSp,TenSp,SoLuong,DonGia,ThuocDanhMuc,XuatXu,ThuongHieu,NhaCungCap,HuongDanSuDung,MauSac,ChatLieu,KichThuoc);
        listDungCu.add(dungcu);
    }
}
