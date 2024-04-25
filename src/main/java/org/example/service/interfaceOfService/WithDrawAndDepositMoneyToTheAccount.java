package org.example.service.interfaceOfService;

import org.example.entity.Client;

public interface WithDrawAndDepositMoneyToTheAccount {

    Client client = null;
    public void withDrawMoneyFromTheAccount(Client client,int sum);

    public void depositMoneyToTheAccount(Client client,int sum);
}
