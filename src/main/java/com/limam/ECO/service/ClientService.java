package com.limam.ECO.service;

import com.limam.ECO.Entity.Client;
import com.limam.ECO.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientR;

    public Client saveClient(Client client){
        return clientR.save(client);
    }
    public List<Client> getClients(){
        return  clientR.findAll();

    }
    public Client getClientById(int id){
        return clientR.findById(id).orElse(null);
    }
    public String deleteArticle(int id){
        clientR.deleteById(id);
        return "le client "+id+"est supprimée";
    }
}
