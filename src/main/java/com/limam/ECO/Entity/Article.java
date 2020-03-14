package com.limam.ECO.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Articles")

public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codeArticle;
    private String designation;
    private int prix;
    private int stock;
    private String photo;
    @JsonIgnore
    @OneToMany(mappedBy = "articles")
    private Collection<Commande> commandes;

   @ManyToOne
   @JoinColumn(name="ref_categorie")
   private Categorie categorie;

    public int getCodeArticle() {
        return codeArticle;
    }

    public void setCodeArticle(int codeArticle) {
        codeArticle = codeArticle;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }



    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
