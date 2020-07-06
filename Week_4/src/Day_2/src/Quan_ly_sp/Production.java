package Quan_ly_sp;

import java.io.Serializable;

public class Production implements Serializable {
    private long serial;
    private String name;
    private String Hsx;
    private Double price;

    public Production(){};

    public Production(long serial, String name, String Hsx, Double price){
        this.serial = serial;
        this.name = name;
        this.Hsx = Hsx;
        this.price = price;
    }

    public long getSerial() {
        return serial;
    }

    public void setSerial(long serial) {
        this.serial = serial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHsx() {
        return Hsx;
    }

    public void setHsx(String hsx) {
        Hsx = hsx;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
