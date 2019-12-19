package org.academiadecodigo.stringteasers.bank;

/**
 * Bank class
 */
public class Bank {

    private int money;

    public int getMoney() {
        return money;
    }

    // returns the amount of money withdraw
    public int withdraw(int money) {

        // exception case handling
        if (money > this.money) {
            int removedMoney = this.money;
            this.money = 0;
            return removedMoney;
        }

        // normal case
        this.money -= money;
        return money;
    }

    public void deposit(int money) {
        this.money += money;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "money=" + money +
                '}';
    }
}

