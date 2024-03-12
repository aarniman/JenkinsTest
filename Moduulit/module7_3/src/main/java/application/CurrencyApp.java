package application;

import enitity.*;
import dao.CurrencyDao;
import enitity.Currency;

import java.util.*;

public class CurrencyApp {

    public static void main(String[] args) {

        CurrencyDao curDao = new CurrencyDao();

        curDao.persist(new Currency("USD", "US Dollar", 1.0));
        curDao.persist(new Currency("EUR", "Euro", 0.85));

        Currency cur = curDao.find(1);
        System.out.println(cur.getName());

        cur.setRate(0.75);
        curDao.update(cur);
    }

}
