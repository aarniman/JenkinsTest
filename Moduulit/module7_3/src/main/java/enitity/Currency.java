package enitity;

import jakarta.persistence.*;

@Entity
@Table(name = "currency")

public class Currency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String abbrievation;
    private String name;
    private double rate;

    public Currency(String abbrievation, String name, double rate) {
        super();
        this.abbrievation = abbrievation;
        this.name = name;
        this.rate = rate;
    }

    public Currency() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAbbrievation() {
        return abbrievation;
    }

    public void setAbbrievation(String abbrievation) {
        this.abbrievation = abbrievation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }



}
