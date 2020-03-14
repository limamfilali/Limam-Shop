package com.limam.ECO.service;

import com.limam.ECO.Entity.Categorie;
import com.limam.ECO.repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieService {
    @Autowired
    private CategorieRepository categorie;

    public List<Categorie> getCategories() {
        return categorie.findAll();
    }
    public Categorie getCategorieById(int id){
        return categorie.findById(id).orElse(null);
    }
}
