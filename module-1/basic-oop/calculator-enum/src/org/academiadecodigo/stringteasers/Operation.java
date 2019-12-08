package org.academiadecodigo.stringteasers;

public enum Operation {
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY ("*"),
    DIVIDE("/");

    private String symbol;

    Operation(String symbol){
        this.symbol = symbol;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public static String showOperations() {
        String result = "Available Operations: ";

        // Operation.values() returns an array with all the enum values
        for(Operation operation : Operation.values()) {
            result += operation.symbol + " ";
        }

        return result;
    }
}


