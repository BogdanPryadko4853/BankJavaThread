package org.example.service.interfaceOfService;

import org.example.entity.Bank;
import org.example.entity.Client;

public interface Transaction {
    void deposit(Client client, Bank bank);
}
