package com.ferdi.demo.user.service;

import com.ferdi.demo.user.entity.Book;
import com.ferdi.demo.user.entity.Kullanici;
import com.ferdi.demo.user.repo.KullaniciRepo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class KullaniciServiceImpl implements KullaniciService {

    private final KullaniciRepo kullaniciRepo;

    @PersistenceContext()
    private EntityManager entityManager;
     @Override
    public List<Kullanici> getKullanicilar(){

        return kullaniciRepo.findAll();
    }

    @Override
    @Transactional
    public Kullanici kaydet(Kullanici kullanici) {

        entityManager.persist(kullanici);
         return kullanici;
    }

    @Override
    public Kullanici getKullanici(Long id) {
        return kullaniciRepo.findById(id).orElse(null);
    }
}
