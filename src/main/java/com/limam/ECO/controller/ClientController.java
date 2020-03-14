package com.limam.ECO.controller;

import com.limam.ECO.Entity.Client;
import com.limam.ECO.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    private ClientService clientS;

    @PostMapping("/addClient")
    public Client addClient(@RequestBody Client client){
        return clientS.saveClient(client);

    }
    @GetMapping("/clients")
    public List<Client> findAllArticles(){
        return clientS.getClients();

    }
    @GetMapping("/client/{id}")
    public Client findClientById(@PathVariable int id){
        return clientS.getClientById(id);
    }
}
