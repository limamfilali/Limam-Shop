package com.limam.ECO.repository;


import com.limam.ECO.Entity.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommandeRepository extends JpaRepository<Commande,Integer> {
    public List<Commande>  findCommandeByClientId(int id);git sta


}
