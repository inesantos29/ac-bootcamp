package org.academiadecodigo.stringteasers;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator("Casio", "grey");

        calculator.setOperation(Operation.MULTIPLY);

        Operation add = Operation.ADD;
        System.out.println(add.getSymbol());

        System.out.println(Operation.showOperations());

    }
}
