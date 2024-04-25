package org.example;

import org.example.entity.Bank;
import org.example.entity.Client;
import org.example.service.SavingAccountOfClientImpl;
import org.example.service.TransactionImpl;

import java.util.Scanner;

import static org.example.operationPrint.loginAndPrint.loginToAccount;
import static org.example.operationPrint.loginAndPrint.openAccount;

public class Main {

    private static final String TEMPLATE_OF_OPERATION_1 = "1.Открыть счет в банке";
    private static final String TEMPLATE_OF_OPERATION_2 = "2.Зайти на свой счет";

    private boolean flag = true;

    void printAnswer() {
        System.out.println("Выберете операцию:\n" + TEMPLATE_OF_OPERATION_1 + "\n" + TEMPLATE_OF_OPERATION_2);
    }

    public static void main(String[] args) {
        Main main = new Main();
        Bank bank = new Bank();
        Client client = new Client();
        SavingAccountOfClientImpl savingAccountOfClient = new SavingAccountOfClientImpl();


        while (main.flag) {
            main.printAnswer();
            Scanner scanner = new Scanner(System.in);

            int answer = scanner.nextInt();
            scanner.nextLine(); // Считываем перевод строки после ввода числа

            switch (answer) {
                case 1:
                    openAccount(scanner, bank, client, savingAccountOfClient);
                    break;
                case 2:
                    loginToAccount(scanner, savingAccountOfClient.getClients());
                    break;
                default:
                    System.out.println("Некорректный выбор операции.");
            }
        }
    }
}