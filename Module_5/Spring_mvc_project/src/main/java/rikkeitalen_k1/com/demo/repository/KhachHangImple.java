package rikkeitalen_k1.com.demo.repository;

import org.springframework.stereotype.Service;
import rikkeitalen_k1.com.demo.model.KhachHangEntity;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

@Transactional
@Service
public class KhachHangImple implements KhachHangRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<KhachHangEntity> findAll() {
        TypedQuery<KhachHangEntity> query = em.createQuery("select c from KhachHangEntity c", KhachHangEntity.class);
        return query.getResultList();
    }

    @Override
    public KhachHangEntity findById(String maKhachHang) {
        return null;
    }


    @Override
    public void save(KhachHangEntity model) {

    }

    @Override
    public void remove(String maKhachHang) {

    }
}
