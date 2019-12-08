package org.academiadecodigo.stringteasers;

public class Calculator {

    private String brand;
    private String color;

    private Operation operation;

    public Calculator(String brand, String color){
        this.brand = brand;
        this.color = color;
        this.operation = operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

}
