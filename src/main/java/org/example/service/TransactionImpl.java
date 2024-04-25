package org.example.service;

import org.example.entity.Bank;
import org.example.entity.Client;
import org.example.entity.TransactionEntity;
import org.example.service.interfaceOfService.Transaction;

public class TransactionImpl implements Transaction {

    private final Client client;
    private final Bank bank;
    private TransactionEntity transaction = null;

    public TransactionImpl(Client client, Bank bank) {
        this.client = client;
        this.bank = bank;
        this.transaction = transaction;
    }
    @Override
    public void deposit(Client client, Bank bank) {
        synchronized (this) {
            Thread thread = new Thread(() -> {
                transaction.setSumOfTransaction(transaction.getSumOfTransaction()+1);
                transaction.setNameOfClient(client.getName());
                transaction.setNameOfBank(bank.getName());
                transaction.setNumberOfTransaction(transaction.getNumberOfTransaction()+1);
                transaction.setName(STR."Transaction № \{transaction.getNumberOfTransaction()}");
            });
            thread.start();
        }
    }
}
