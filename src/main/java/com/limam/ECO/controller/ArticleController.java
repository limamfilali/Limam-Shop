package com.limam.ECO.controller;

import com.limam.ECO.Entity.Article;
import com.limam.ECO.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ArticleController {


        @Autowired
        private ArticleService service;

        @PostMapping("/addProduct")
        public Article addArticle(@RequestBody Article article){
            return service.saveProduct(article);


        }
        //@PostMapping("/addProducts")
      //  public List<Product> addProducts(@RequestBody List<Product> products){
          //  return service.saveProducts(products);


        //}
        @GetMapping("/articles")
        public List<Article> findAllArticles(){
            return service.getProducts();
        }


        @GetMapping("/articleById/{id}")
        public Article findProductById(@PathVariable int codeArticle){
            return service.getProductById(codeArticle);

        }
       // @GetMapping("/product/{name}")
       // public Article findProductByName(@PathVariable String name){
         //   return service.getProductByName(name);

       // }
        @PutMapping("/update")
        public Article updateProduct(@RequestBody Article product){
            return service.updateProduct(product);


        }
        @DeleteMapping("/delete/{id}")
        public  String deleteArticle(@PathVariable  int id){
            return service.deleteArticle(id);
        }


    }


