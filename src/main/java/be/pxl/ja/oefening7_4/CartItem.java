package be.pxl.ja.oefening7_4;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Predicate;

public class CartItem {
    String naam;
    BigDecimal price;

    public CartItem(String naam, BigDecimal price){
        this.naam = naam;
        this.price = price;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
