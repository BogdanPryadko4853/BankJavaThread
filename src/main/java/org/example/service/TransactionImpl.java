package org.example.service;

import org.example.entity.Bank;
import org.example.entity.Client;
import org.example.service.interfaceOfService.Transaction;

public class TransactionImpl implements Transaction {

    private final Client client;
    private final Bank bank;
    private final Transaction transaction;

    public TransactionImpl(Client client, Bank bank,Transaction transaction) {
        this.client = client;
        this.bank = bank;
        this.transaction = transaction;
    }

    @Override
    public void deposit(Client client, Bank bank) {
        synchronized (this) {
            Thread thread = new Thread(() -> {

                //



            });
            thread.start();
        }
    }

}
//System.out.println("Ожидание депозита клиента: " + client.getName() +
//                        " at bank: " + bank.getName());