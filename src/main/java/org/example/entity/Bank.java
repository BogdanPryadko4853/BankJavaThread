package org.example.entity;

import java.util.Objects;

public class Bank {
    String name;
    String UIN;
    TypeOfCard typeOfCard;
    int maxSumInAccount;

    public String getName() {
        return name;
    }

    public String getUIN() {
        return UIN;
    }

    public TypeOfCard getTypeOfCard() {
        return typeOfCard;
    }

    public int getMaxSumInAccount() {
        return maxSumInAccount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUIN(String UIN) {
        this.UIN = UIN;
    }

    public void setTypeOfCard(TypeOfCard typeOfCard) {
        this.typeOfCard = typeOfCard;
    }

    public void setMaxSumInAccount(int maxSumInAccount) {
        this.maxSumInAccount = maxSumInAccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return maxSumInAccount == bank.maxSumInAccount &&
                Objects.equals(name, bank.name) &&
                Objects.equals(UIN, bank.UIN)
                && typeOfCard == bank.typeOfCard;
    }

    @Override
    public int hashCode() {
        return Objects.hash(UIN);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", UIN='" + UIN + '\'' +
                ", typeOfCard=" + typeOfCard +
                ", maxSumInAccount=" + maxSumInAccount +
                '}';
    }
}
