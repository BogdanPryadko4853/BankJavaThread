package org.example.entity;

import java.time.LocalDateTime;
import java.util.Objects;

//сущность клиента
public class Client {
    String name;
    String login;
    int password;
    String codeWord;
    int moneyInTheAccount;
    LocalDateTime timeOfRegistration;


    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public int getPassword() {
        return password;
    }

    public String getCodeWord() {
        return codeWord;
    }

    public int getMoneyInTheAccount() {
        return moneyInTheAccount;
    }

    public LocalDateTime getTimeOfRegistration() {
        return LocalDateTime.now();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setCodeWord(String codeWord) {
        this.codeWord = codeWord;
    }

    public void setMoneyInTheAccount(int moneyInTheAccount) {
        this.moneyInTheAccount = moneyInTheAccount;
    }

    public void setTimeOfRegistration(LocalDateTime timeOfRegistration) {
        this.timeOfRegistration = timeOfRegistration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return password == client.password &&
                moneyInTheAccount == client.moneyInTheAccount &&
                Objects.equals(name, client.name) &&
                Objects.equals(login, client.login) &&
                Objects.equals(codeWord, client.codeWord) &&
                Objects.equals(timeOfRegistration, client.timeOfRegistration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(password);
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", password=" + password +
                ", codeWord='" + codeWord + '\'' +
                ", moneyInTheAccount=" + moneyInTheAccount +
                ", timeOfRegistration=" + timeOfRegistration +
                '}';
    }
}


