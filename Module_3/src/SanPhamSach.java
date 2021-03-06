import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;


public class SanPhamSach extends SanPham{
    public String NhaXuatBan;
    public int NamXuatBan;
    public String TacGia;
    public Date NgaySanXuat;
    public int LanTaiBan;
    ArrayList<SanPhamSach> listSach = new ArrayList<>();

    public String getNhaXuatBan() {
        return NhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        NhaXuatBan = nhaXuatBan;
    }

    public int getNamXuatBan() {
        return NamXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        NamXuatBan = namXuatBan;
    }

    public String getTacGia() {
        return TacGia;
    }

    public void setTacGia(String tacGia) {
        TacGia = tacGia;
    }

    public Date getNgaySanXuat() {
        return NgaySanXuat;
    }

    public void setNgaySanXuat(Date ngaySanXuat) {
        NgaySanXuat = ngaySanXuat;
    }

    public int getLanTaiBan() {
        return LanTaiBan;
    }

    public void setLanTaiBan(int lanTaiBan) {
        LanTaiBan = lanTaiBan;
    }
    public SanPhamSach(){}

    @Override
    public String toString() {
        return "SanPhamSach{" +
                "Nh2amXuatBan=" + NamXuatBan +
                ", TacGia='" + TacGia + '\'' +
                ", NgaySanXuat=" + NgaySanXuat +
                ", LanTaiBan=" + LanTaiBan +
                ", MaSp='" + MaSp + '\'' +
                ", TenSp='" + TenSp + '\'' +
                ", SoLuong=" + SoLuong +
                ", DonGia=" + DonGia +
                ", ThuocDanhMuc='" + ThuocDanhMuc + '\'' +
                '}';
    }

    @Override
    public void HienThiThongTin() {
        System.out.println(listSach);
    }

    @Override
    public double PhanTramGiamGia(String LoaiKh) {
        switch (LoaiKh){
            case "Thường":
                return 0.02;
            case "Vip1":
                return 0.05;
            case "Vip2":
                return 0.1;
        }
        return 0;
    }

    @Override
    public void luuvaofile() {
        String tenFile = "Sach.csv";
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

    public SanPhamSach(String maSp, String tenSp, int soLuong, float donGia, String thuocDanhMuc, String nhaXuatBan, int
            namXuatBan, String tacGia, Date ngaySanXuat, int lanTaiBan) {
        super(maSp, tenSp, soLuong, donGia, thuocDanhMuc);
        NhaXuatBan = nhaXuatBan;
        NamXuatBan = namXuatBan;
        TacGia = tacGia;
        NgaySanXuat = ngaySanXuat;
        LanTaiBan = lanTaiBan;
    }
    public void them(){
        super.them();
        Scanner sc = new Scanner(System.in);
        System.out.println("=========NHAP SACH=======");
        System.out.println("Nhap Nha Xuat Ban");
        NhaXuatBan = sc.nextLine();
        System.out.println("Nhap Nam xuat ban");
        NamXuatBan = Integer.parseInt(sc.nextLine());
        while (NamXuatBan<1000 && NamXuatBan>2021){
            System.out.println("Nhap lai nam xuat ban: ");
            NamXuatBan = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Tác giả");
        TacGia = sc.nextLine();
        System.out.println("Ngày sản xuất");
        String ngayXuatBan = sc.nextLine();
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            NgaySanXuat = formatter.parse(ngayXuatBan);
        } catch (Exception e){

        }
        System.out.println("Lần tái bản");
        LanTaiBan =Integer.parseInt(sc.nextLine());
        while (LanTaiBan<0){
            System.out.println("Nhap lai lan tai ban: ");
            LanTaiBan = Integer.parseInt(sc.nextLine());
        }
        SanPhamSach spsach = new SanPhamSach(MaSp,TenSp,SoLuong,DonGia,ThuocDanhMuc,NhaXuatBan,NamXuatBan,TacGia,NgaySanXuat,LanTaiBan);
        listSach.add(spsach);
        for (SanPham sach :
                listSach) {
            sach.luuvaofile();
        }

    }


}
