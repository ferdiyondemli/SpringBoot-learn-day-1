package com.ferdi.demo.user.controller;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ferdi.demo.user.controller.dto.KullaniciResponseDto;
import com.ferdi.demo.user.controller.mapper.KullaniciTekMapper;
import com.ferdi.demo.user.entity.Book;
import com.ferdi.demo.user.entity.Kullanici;
import com.ferdi.demo.user.service.BookService;
import com.ferdi.demo.user.service.KullaniciService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class KullaniciController {


private final KullaniciService kullaniciService;
private final BookService bookService;
@GetMapping
@JsonIgnore
public List<Kullanici> getKullanicilar(){

    return kullaniciService.getKullanicilar();
}

@PostMapping()
public  Kullanici kaydetKullanici(@RequestBody Kullanici kullanici){


    return  kullaniciService.kaydet(kullanici);
}


    @GetMapping("/{id}")
    @JsonIgnore
    public Kullanici getKullanici(@PathVariable Long id){

        return kullaniciService.getKullanici(id);
    }
    @GetMapping("3/{id}")
    @JsonIgnore
    public KullaniciResponseDto getKullanici3(@PathVariable Long id){

        return KullaniciTekMapper.map(kullaniciService.getKullanici(id));
    }

}
