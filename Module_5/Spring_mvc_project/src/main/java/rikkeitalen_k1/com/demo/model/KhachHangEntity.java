package rikkeitalen_k1.com.demo.model;


import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.Date;

@Entity
@Table(name="KhachHang")
public class KhachHangEntity {
    @Id
    @Column(name = "MaKhachHang")
    private String maKhachHang;
    @Column(name = "TenKhachHang")
    private String tenKhachHang;
    @Column(name = "NgaySinh")
    private Date ngaySinh;
    @Column(name = "SoDienThoai")
    private String soDienThoai;
    @Column(name= "Email")
    private String email;
    @Column(name= "MaLoai")
    private String maLoai;

    public KhachHangEntity(String maKhachHang, String tenKhachHang, Date ngaySinh, String soDienThoai, String email, String maLoai) {
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        ngaySinh = ngaySinh;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.maLoai = maLoai;
    }

    public KhachHangEntity(){

    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }


    public void setNgaySinh(Date ngaySinh) {
        ngaySinh = ngaySinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "maKhachHang='" + maKhachHang + '\'' +
                ", tenKhachHang='" + tenKhachHang + '\'' +
                ", NgaySinh=" + ngaySinh +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", email='" + email + '\'' +
                ", maLoai='" + maLoai + '\'' +
                '}';
    }
}
