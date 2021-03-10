package rikkeitalen_k1.com.demo.service;

import org.springframework.stereotype.Service;
import rikkeitalen_k1.com.demo.model.KhachHangEntity;

import javax.transaction.Transactional;
import java.util.List;

public interface KhachHangService {
    List<KhachHangEntity> findAll();

    KhachHangEntity findById(String MaKhachHang);

    void save(KhachHangEntity khachhang);

    void remove(String MaKhachHang);
}
