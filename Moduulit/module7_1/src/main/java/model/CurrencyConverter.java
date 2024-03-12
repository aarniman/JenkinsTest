package model;


import java.util.HashMap;

public class CurrencyConverter {
    private HashMap<String, Currency> currencies = new HashMap<>();

    public CurrencyConverter() {
        this.currencies.put("USD", new Currency("USD", "United States Dollar", 1.0));
        this.currencies.put("EUR", new Currency("EUR", "Euro", 0.85));
        this.currencies.put("GBP", new Currency("GBP", "British Pound", 0.75));
        this.currencies.put("JPY", new Currency("JPY", "Japanese Yen", 110.0));
    }

    public double convert(Currency from, Currency to, double amount){
        return amount * (from.getRate() / to.getRate());
    }

    public HashMap<String, Currency> getCurrencies() {
        return currencies;
    }

}
