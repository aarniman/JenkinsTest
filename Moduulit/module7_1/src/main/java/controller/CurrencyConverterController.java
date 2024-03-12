package controller;

import model.CurrencyConverter;
import view.CurrencyConverterView;

import java.util.ArrayList;

public class CurrencyConverterController {
    private final ArrayList<CurrencyConverter> currencies = new ArrayList<>();
    private static CurrencyConverterController instance = null;

    private CurrencyConverterController(){
        this.currencies.add(new CurrencyConverter("USD", 1.0));
        this.currencies.add(new CurrencyConverter("EUR", 0.85));
        this.currencies.add(new CurrencyConverter("GBP", 0.75));
        this.currencies.add(new CurrencyConverter("JPY", 110.0));
    }

    public static CurrencyConverterController getInstance(){
        if(instance == null){
            instance = new CurrencyConverterController();
        }
        return instance;
    }

    public double convert(CurrencyConverter from, CurrencyConverter to, double amount){
        return amount * (from.getRate() / to.getRate());
    }


    public ArrayList<CurrencyConverter> getCurrencies() {
        return currencies;
    }



}
