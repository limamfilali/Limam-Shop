package com.limam.ECO.controller;

import com.limam.ECO.Entity.Categorie;
import com.limam.ECO.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategorieController {
    @Autowired
    private CategorieService categorS;

    @GetMapping("/categories")
    public List<Categorie>  findAllArticles(){
        return categorS.getCategories();
    }
    @GetMapping("/categorie/{id}")
    public Categorie findArticleById(@PathVariable int id){
        return categorS.getCategorieById(id);
    }
}
