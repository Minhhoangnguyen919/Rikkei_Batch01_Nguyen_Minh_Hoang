package rikkeitalen_k1.com.demo.repository;

import org.springframework.stereotype.Service;
import rikkeitalen_k1.com.demo.model.KhachHangEntity;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

@Transactional
@Service
public class KhachHangImple implements KhachHangRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public List<KhachHangEntity> findAll() {
        TypedQuery<KhachHangEntity> query = em.createQuery("select c from KhachHangEntity c", KhachHangEntity.class);
        return query.getResultList();
    }

    @Override
    public KhachHangEntity findById(String maKhachHang) {
        TypedQuery<KhachHangEntity> query = em.createQuery("select c from KhachHangEntity c where  c.maKhachHang=:maKhachHang", KhachHangEntity.class);
        query.setParameter("maKhachHang", maKhachHang);
        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }


    @Override
    public void save(KhachHangEntity khachhangs) {
        if (khachhangs.getMaKhachHang() != null)
            em.merge(khachhangs);
        else {
            em.persist(khachhangs);
        }
    }

    @Override
    @Transactional
    public void remove(String maKhachHang) {
        KhachHangEntity khachhang = findById(maKhachHang);
        if (khachhang != null) {
            em.remove(khachhang);
        }

    }
}
