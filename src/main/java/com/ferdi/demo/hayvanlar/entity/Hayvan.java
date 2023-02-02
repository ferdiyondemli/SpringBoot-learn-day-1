package com.ferdi.demo.hayvanlar.entity;

import com.ferdi.demo.hayvanlar.entity.enums.BeslenmeTur;
import jakarta.persistence.*;

@Entity
@Table(name = "hayvan")
public class Hayvan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "adi")
    private String adi;
    @Column(name = "beslenme_tur")
    private BeslenmeTur beslenmeTur;
    @Column(name = "yas")
    private Integer yas;
    @Column(name = "sdfds")
    private Integer ayakSayisi;

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Hayvan() {
    }

    public Hayvan(String adi, BeslenmeTur beslenmeTur, Integer yas, Integer ayakSayisi) {
        this.adi = adi;
        this.beslenmeTur = beslenmeTur;
        this.yas = yas;
        this.ayakSayisi = ayakSayisi;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public BeslenmeTur getBeslenmeTur() {
        return beslenmeTur;
    }

    public void setBeslenmeTur(BeslenmeTur beslenmeTur) {
        this.beslenmeTur = beslenmeTur;
    }

    public Integer getYas() {
        return yas;
    }

    public void setYas(Integer yas) {
        this.yas = yas;
    }

    public Integer getAyakSayisi() {
        return ayakSayisi;
    }

    public void setAyakSayisi(Integer ayakSayisi) {
        this.ayakSayisi = ayakSayisi;
    }
}
