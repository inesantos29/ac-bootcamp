package org.academiadecodigo.stringteasers.bank;

/**
 * Application Entry Point
 */
public class Main {

    public static void main(String[] args) {

        Wallet wallet1 = new Wallet();
        Wallet wallet2 = new Wallet();
        Bank bank = new Bank();

        Person person1 = new Person("Catarina", bank, wallet1, 500);
        System.out.println(person1);

        Person person2 = new Person("Joana", bank, wallet2, 0);
        System.out.println(person2);

        person1.saveMoney(200);
        System.out.println(person1);

        person2.saveMoney(200);
        System.out.println(person2);

        person1.spend(100);
        System.out.println(person1);

        person2.fillWallet(100);
        System.out.println(person2);
    }
}
