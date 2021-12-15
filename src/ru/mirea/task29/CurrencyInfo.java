package ru.mirea.task29;

import org.junit.Test;

import java.io.Serializable;

public class CurrencyInfo implements Serializable {
    private int costInRubles;
    private String symbol;
    private static final long serialVersionUID = 1L;
    public CurrencyInfo(int costInRubles, String symbol){
        this.costInRubles = costInRubles;
        this.symbol = symbol;
    }

    public int getCostInRubles() {
        return costInRubles;
    }
    public String getSymbol(){
        return symbol;
    }
    public void setCostInRubles(int costInRubles){
        this.costInRubles = costInRubles;
    }
    public void setSymbol(String symbol){
        this.symbol = symbol;
    }
    public String to_string(){
        return "Currency info{cost = " + getCostInRubles() + ",symbol = " + getSymbol() + "}";
    }
}
