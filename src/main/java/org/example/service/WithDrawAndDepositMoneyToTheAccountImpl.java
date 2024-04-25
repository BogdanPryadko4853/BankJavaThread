package org.example.service;

import org.example.entity.Client;
import org.example.service.interfaceOfService.WithDrawAndDepositMoneyToTheAccount;

public class WithDrawAndDepositMoneyToTheAccountImpl implements WithDrawAndDepositMoneyToTheAccount {

    Client client;
    public WithDrawAndDepositMoneyToTheAccountImpl(Client client) {
        this.client = client;
    }

    @Override
    public void withDrawMoneyFromTheAccount(Client client,int sum) {
        client.setMoneyInTheAccount(client.getMoneyInTheAccount()-sum);
        System.out.println(STR."Денег на счету - \{client.getMoneyInTheAccount()}");
    }
    @Override
    public void depositMoneyToTheAccount(Client client,int sum) {
        client.setMoneyInTheAccount(client.getMoneyInTheAccount()+sum);
        System.out.println(STR."Денег на счету - \{client.getMoneyInTheAccount()}");
    }
}
