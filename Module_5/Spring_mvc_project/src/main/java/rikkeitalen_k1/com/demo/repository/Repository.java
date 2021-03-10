package rikkeitalen_k1.com.demo.repository;


import java.util.List;

public interface Repository<Khachhang> {
    List<Khachhang> findAll();

    Khachhang findById(String maKhachHang);

    void save(Khachhang model);

    void remove(String maKhachHang);

}
