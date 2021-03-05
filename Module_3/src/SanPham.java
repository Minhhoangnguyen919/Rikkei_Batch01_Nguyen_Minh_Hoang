import java.util.Scanner;

abstract class SanPham {
    protected String MaSp;
    protected String TenSp;
    protected int SoLuong;
    protected float DonGia;
    protected String ThuocDanhMuc;


    @Override
    public String toString() {
        return "SanPham{" +
                "MaSp='" + MaSp + '\'' +
                ", TenSp='" + TenSp + '\'' +
                ", SoLuong=" + SoLuong +
                ", DonGia=" + DonGia +
                ", ThuocDanhMuc='" + ThuocDanhMuc + '\'' +
                '}';
    }

    public SanPham() {

    }

    public SanPham(String maSp, String tenSp, int soLuong, float donGia, String thuocDanhMuc) {
        MaSp = maSp;
        TenSp = tenSp;
        SoLuong = soLuong;
        DonGia = donGia;
        ThuocDanhMuc = thuocDanhMuc;
    }

    public void setThuocDanhMuc(String thuocDanhMuc) {
        ThuocDanhMuc = thuocDanhMuc;
    }

    public String getThuocDanhMuc() {
        return ThuocDanhMuc;
    }

    public String getMaSp() {
        return MaSp;
    }

    public String getTenSp() {
        return TenSp;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public float getDonGia() {
        return DonGia;
    }

    public void setMaSp(String maSp) {
        MaSp = maSp;
    }

    public void setTenSp(String tenSp) {
        TenSp = tenSp;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public void setDonGia(float donGia) {
        DonGia = donGia;
    }

    public abstract void HienThiThongTin();

    public abstract double PhanTramGiamGia(String LoaiKh);

    public void them() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========NHAP SAN PHAM=======");
        System.out.println("Nhap vao ma san pham");
        MaSp = sc.nextLine();
        System.out.println("Nhap ten san pham");
        TenSp = sc.nextLine();
        System.out.println("Nhap so luong");
        SoLuong = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap Don gia");
        DonGia = Float.parseFloat(sc.nextLine());
        System.out.println("Nhap danh muc");
        ThuocDanhMuc = sc.nextLine();
    }
}
