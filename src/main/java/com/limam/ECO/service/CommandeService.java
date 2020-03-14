package com.limam.ECO.service;

import com.limam.ECO.Entity.Commande;
import com.limam.ECO.repository.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.List;

@Service
public class CommandeService {
    @Autowired
    private CommandeRepository commandR;

    public Commande saveCommande(Commande commande ){
        return commandR.save(commande);
    }
    public List<Commande> getCommandeByClientId(int id){
        return commandR.findCommandeByClientId(id);

    }

    public Commande getCommandeById(int id) {
        return commandR.findById(id).orElse(null);
    }

    public String deleteCommande(int id) {
        commandR.deleteById(id);
        return "Commande de"+id+"est supprimée";
    }
}
