package org.example.service;

import org.example.entity.Bank;
import org.example.entity.Client;
import org.example.service.interfaceOfService.SavingAccountOfClient;

import java.util.ArrayList;

public class SavingAccountOfClientImpl implements SavingAccountOfClient {
    private ArrayList<Client> clients = new ArrayList<>();

    private ArrayList<Bank> banks = new ArrayList<>();

    public ArrayList<Client> getClients() {
        return clients;
    }

    public ArrayList<Bank> getBanks() {
        return banks;
    }

    @Override
    public void saveAccount(Client client, Bank bank) {
        clients.add(client);
        banks.add(bank);
        System.out.println(STR."сохранен: \n\{client}\{bank}");
    }
}
