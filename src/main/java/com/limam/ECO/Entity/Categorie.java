package com.limam.ECO.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Categories")

public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int ref_categorie;
    private String designationCate;

    @JsonIgnore
    @OneToMany(mappedBy = "categorie")
    private Collection<Article> articles;


    public int getRef_categorie() {
        return ref_categorie;
    }

    public void setRef_categorie(int ref_categorie) {
        this.ref_categorie = ref_categorie;
    }

    public String getDesignationCate() {
        return designationCate;
    }

    public void setDesignationCate(String designationCate) {
        this.designationCate = designationCate;
    }
}
