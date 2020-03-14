package com.limam.ECO.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Commandes")
public class Commande {
    @Id
    @GeneratedValue
    private int numCom;
    private Date dateCommande;
    private int quantité;
    @ManyToOne
    @JoinColumn(name = "id")
    private Client client;
    @ManyToOne
    @JoinColumn(name="code_article")
    private Article articles;





    public int getNumCom() {
        return numCom;
    }

    public void setNumCom(int numcom) {
        this.numCom = numcom;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }
}
