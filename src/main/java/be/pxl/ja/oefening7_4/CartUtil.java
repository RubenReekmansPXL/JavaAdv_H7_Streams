package be.pxl.ja.oefening7_4;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Predicate;

public class CartUtil {
    public static BigDecimal checkout(List<CartItem> items){
        return items.stream()
                .map(CartItem::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public static BigDecimal checkout(List<CartItem> items, Predicate<CartItem> predicate){
        return items.stream()
                .filter(predicate)
                .map(CartItem::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public static BigDecimal checkoutWithDiscount(List<CartItem> items){
        BigDecimal total = checkout(items);
        BigDecimal totalShoes = checkout(items, i -> i.getNaam().equals("Shoes"));

        int countHats = (int) items.stream().filter(i -> i.getNaam().equals("hat")).count();
        BigDecimal totalHats = checkout(items, i -> i.getNaam().equals("hat"));

        if(BigDecimal.valueOf(100).compareTo(totalShoes) <= 0){
            total = total.subtract(totalShoes.multiply(BigDecimal.valueOf(0.2)));
        }

        if(countHats >= 2 && BigDecimal.valueOf(50).compareTo(totalHats) <= 0){
            total = total.subtract(BigDecimal.TEN);
        }

        return total;
    }

}
