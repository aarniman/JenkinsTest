package enitity;

import jakarta.persistence.*;

@Entity
public class Transaction {

    @Id
    private int id;
    private int amount;
    @ManyToOne
    private Currency currency;

    public Transaction(int id, int amount, Currency currency) {
        this.id = id;
        this.amount = amount;
        this.currency = currency;
    }

    public Transaction() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
