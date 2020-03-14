package com.limam.ECO.service;

import com.limam.ECO.Entity.Article;
import com.limam.ECO.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArticleService {
    @Autowired
    private ArticleRepository repository;
    public Article saveProduct(Article article){
        return repository.save(article);
    }
    public List<Article> saveProducts(List<Article> products){
        return repository.saveAll(products);
    }
    public List<Article> getProducts(){
        return repository.findAll();
    }
    public Article getProductById(int id){
        return repository.findById(id).orElse(null);
    }

    public String deleteArticle(int id){
        repository.deleteById(id);
        return "Article modifié"+id;
    }
    public Article updateProduct(Article product){
        Article existingProduct=repository.findById(product.getCodeArticle()).orElse(null);
        existingProduct.setDesignation(product.getDesignation());
        existingProduct.setPrix(product.getPrix());
        existingProduct.setStock(product.getStock());
        existingProduct.setCodeArticle(product.getCodeArticle());
        return repository.save(existingProduct);
    }
}
