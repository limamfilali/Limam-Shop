package com.limam.ECO.controller;

import com.limam.ECO.Entity.Commande;
import com.limam.ECO.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommandeController {
    @Autowired
    private CommandeService commandeS;
    @PostMapping("/addCommande")
    public Commande addCommande(@RequestBody Commande commande){
        return commandeS.saveCommande(commande);
    }
    @GetMapping("/commandeByClientId/{id}")
    public List<Commande> findAllClientCommande(@PathVariable int id){
        return commandeS.getCommandeByClientId(id);
    }
    @GetMapping("/commande/{id}")
    public Commande findCommandeById(@PathVariable int id){
        return commandeS.getCommandeById(id);
    }
    @DeleteMapping("/deleteCommande/{id}")
    public String deleteCommande(@PathVariable int id){
        return commandeS.deleteCommande(id);
    }

}
