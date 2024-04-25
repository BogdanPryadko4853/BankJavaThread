package org.example.entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class TransactionEntity {
    String name;
    int sumOfTransaction;
    LocalDateTime localDateTime;
    String nameOfBank;
    String nameOfClient;

    int numberOfTransaction;

    public int getNumberOfTransaction() {
        return numberOfTransaction;
    }

    public void setNumberOfTransaction(int numberOfTransaction) {
        this.numberOfTransaction = numberOfTransaction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSumOfTransaction() {
        return sumOfTransaction;
    }

    public void setSumOfTransaction(int sumOfTransaction) {
        this.sumOfTransaction = sumOfTransaction;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public String getNameOfBank() {
        return nameOfBank;
    }

    public void setNameOfBank(String nameOfBank) {
        this.nameOfBank = nameOfBank;
    }

    public String getNameOfClient() {
        return nameOfClient;
    }

    public void setNameOfClient(String nameOfClient) {
        this.nameOfClient = nameOfClient;
    }

    @Override
    public String toString() {
        return "TransactionEntity{" +
                "name='" + name + '\'' +
                ", sumOfTransaction=" + sumOfTransaction +
                ", localDateTime=" + localDateTime +
                ", nameOfBank='" + nameOfBank + '\'' +
                ", nameOfClient='" + nameOfClient + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransactionEntity that = (TransactionEntity) o;
        return sumOfTransaction == that.sumOfTransaction &&
                Objects.equals(name, that.name) &&
                Objects.equals(localDateTime, that.localDateTime) &&
                Objects.equals(nameOfBank, that.nameOfBank) &&
                Objects.equals(nameOfClient, that.nameOfClient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sumOfTransaction, localDateTime, nameOfBank, nameOfClient);
    }
}
