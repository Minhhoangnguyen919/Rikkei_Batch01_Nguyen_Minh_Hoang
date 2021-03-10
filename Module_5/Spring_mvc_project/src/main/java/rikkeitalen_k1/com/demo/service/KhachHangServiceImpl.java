package rikkeitalen_k1.com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rikkeitalen_k1.com.demo.model.KhachHangEntity;
import rikkeitalen_k1.com.demo.repository.KhachHangRepository;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Service
public class KhachHangServiceImpl implements KhachHangService{

    @Autowired
    private KhachHangRepository khachHangRepository;
    @Override
    public List<KhachHangEntity> findAll() {
        return khachHangRepository.findAll();
    }

    @Override
    public KhachHangEntity findById(String MaKhachHang) {
        return khachHangRepository.findById(MaKhachHang);
    }

    @Override
    public void save(KhachHangEntity khachhang) {
        khachHangRepository.save(khachhang);
    }
    @Override
    public void remove(String MaKhachHang) {
        khachHangRepository.remove(MaKhachHang);
    }
}
