package org.example.operationPrint;

import org.example.entity.Bank;
import org.example.entity.Client;
import org.example.entity.TypeOfCard;
import org.example.service.SavingAccountOfClientImpl;
import org.example.service.TransactionImpl;
import org.example.service.WithDrawAndDepositMoneyToTheAccountImpl;
import org.example.service.interfaceOfService.WithDrawAndDepositMoneyToTheAccount;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class loginAndPrint {
    public static void openAccount(Scanner scanner, Bank bank, Client client, SavingAccountOfClientImpl savingAccountOfClient) {
        System.out.println("Введите данные банка :\n" +
                "1. Тип карты\n");
        bank.setTypeOfCard(TypeOfCard.valueOf(scanner.nextLine()));
        System.out.println("2. Введите имя банка\n");
        bank.setName(scanner.nextLine());
        System.out.println("3. UIN\n");
        bank.setUIN(scanner.nextLine());
        bank.setMaxSumInAccount(new Random().nextInt(1000000, 100000000));

        System.out.println("Введите свои данные\n" +
                "1. имя\n");
        client.setName(scanner.nextLine());
        System.out.println("2. Login\n");
        client.setLogin(scanner.nextLine());
        System.out.println("3. password\n");
        client.setPassword(scanner.nextInt());
        scanner.nextLine(); // Считываем перевод строки после ввода числа
        System.out.println("4. кодовое слово\n");
        client.setCodeWord(scanner.nextLine());
        client.setTimeOfRegistration(LocalDateTime.now());
        client.setMoneyInTheAccount(0);
        savingAccountOfClient.saveAccount(client, bank);
        TransactionImpl transaction = new TransactionImpl(client, bank);
        transaction.deposit(client, bank);
    }

    public static void loginToAccount(Scanner scanner, ArrayList<Client> clients) {
        System.out.println("Введите свой логин и пароль\n");
        String login = scanner.nextLine();
        int password = scanner.nextInt();
        scanner.nextLine();

        boolean userFound = false;
        for (Client client : clients) {
            if (client.getLogin().equals(login) && client.getPassword() == password) {
                System.out.println("Успешный вход на аккаунт пользователя " + client.getName());
                userFound = true;
                System.out.println(STR."ДЕНЕГ НА СЧЕТУ\{client.getMoneyInTheAccount()}");
                System.out.println(STR."ДАТА РЕГИСТРАЦИИ\{client.getTimeOfRegistration()}");
                System.out.println("1.Вывести деньги\n");
                System.out.println("2. Пополнить баланс\n");
                int operation = scanner.nextInt();
                WithDrawAndDepositMoneyToTheAccountImpl withDrawAndDepositMoneyToTheAccount= new WithDrawAndDepositMoneyToTheAccountImpl(client);
                int sum = 0;
                switch (operation) {
                    case (1):
                        System.out.println("Введите сумму для вывода\n");
                        sum = Integer.parseInt(scanner.nextLine());
                        withDrawAndDepositMoneyToTheAccount.withDrawMoneyFromTheAccount(client, sum);

                    case (2):
                        System.out.println("Введите сумму для депозита\n");
                        sum = Integer.parseInt(scanner.nextLine());
                        withDrawAndDepositMoneyToTheAccount.depositMoneyToTheAccount(client, sum);
                }
                break;
            }
        }

        if (!userFound) {
            System.out.println("Неверный логин или пароль.");
        }
    }
}
