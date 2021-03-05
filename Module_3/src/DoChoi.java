import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DoChoi extends SanPham {
    public String XuatXu;
    public String ThuongHieu;
    public String NhaCungCap;
    public String HuongDanSuDung;
    ArrayList<DoChoi> ListDoChoi = new ArrayList<>();
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
    public DoChoi(){

    }

    public DoChoi(String maSp, String tenSp, int soLuong, float donGia, String thuocDanhMuc, String xuatXu, String thuongHieu, String nhaCungCap, String huongDanSuDung) {
        super(maSp, tenSp, soLuong, donGia, thuocDanhMuc);
        XuatXu = xuatXu;
        ThuongHieu = thuongHieu;
        NhaCungCap = nhaCungCap;
        HuongDanSuDung = huongDanSuDung;
    }

    @Override
    public String toString() {
        return "DoChoi{" +
                "XuatXu='" + XuatXu + '\'' +
                ", ThuongHieu='" + ThuongHieu + '\'' +
                ", NhaCungCap='" + NhaCungCap + '\'' +
                ", HuongDanSuDung='" + HuongDanSuDung + '\'' +
                ", MaSp='" + MaSp + '\'' +
                ", TenSp='" + TenSp + '\'' +
                ", SoLuong=" + SoLuong +
                ", DonGia=" + DonGia +
                ", ThuocDanhMuc='" + ThuocDanhMuc + '\'' +
                '}';
    }

    @Override
    public void HienThiThongTin() {
        System.out.println(ListDoChoi);
    }

    @Override
    public double PhanTramGiamGia(String LoaiKh) {
        if(LoaiKh.equals("Thường")) return 0.02;
        else if(LoaiKh.equals("VIP1")) return 0.05;
        else if(LoaiKh.equals("VIP2")) return 0.7;
        else return 0;
    }

    @Override
    public void luuvaofile() {
        String tenFile = "Dochoitreem.csv";
        try {
            File file = new File(tenFile);
            if (file.createNewFile()){
                System.out.println("--------Create new file ------");
            }
            FileWriter fileWriter = new FileWriter(tenFile);

            fileWriter.write(this.toString());

            fileWriter.close();
            System.out.println("--------Đã ghi Sach vào file -------");

        } catch (Exception e){
            System.out.println("----------------------");
            System.out.println(e);
            System.out.println("-----------------------");
        }
    }

    public void them(){
        super.them();
        Scanner sc = new Scanner(System.in);
        System.out.println("=========NHAP DO CHOI=======");
        System.out.println("Nhap vao xuat xu");
        XuatXu = sc.nextLine();
        System.out.println("Nhap thuong hieu");
        ThuongHieu = sc.nextLine();
        System.out.println("Nhap nha cung cap");
        NhaCungCap = sc.nextLine();
        System.out.println("Nhap huong dan su dung");
        HuongDanSuDung = sc.nextLine();
        DoChoi dochoi = new DoChoi(MaSp,TenSp,SoLuong,DonGia,ThuocDanhMuc,XuatXu,ThuongHieu,NhaCungCap,HuongDanSuDung);
        ListDoChoi.add(dochoi);
        for (DoChoi dc :
                ListDoChoi) {
            dc.luuvaofile();
        }
    }

}
