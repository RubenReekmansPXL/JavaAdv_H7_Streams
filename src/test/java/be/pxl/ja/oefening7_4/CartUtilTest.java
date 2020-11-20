package be.pxl.ja.oefening7_4;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartUtilTest {
    @Test
    void checkoutShouldReturnTheSumOfPriceOfAllItems(){
        List<CartItem> cartItems = Arrays.asList(
                new CartItem("hat", new BigDecimal(5)),
                new CartItem("shoes", new BigDecimal(10))
        );

        assertEquals(BigDecimal.valueOf(15), CartUtil.checkout(cartItems));
    }

    @Test
    void checkoutShouldReturnTheSumOfPriceOfAllItemsWithDiscout(){
        List<CartItem> cartItems = Arrays.asList(
                new CartItem("shoes", new BigDecimal(10)),
                new CartItem("shoes", new BigDecimal(30)),
                new CartItem("shoes", new BigDecimal(60)),
                new CartItem("hat", new BigDecimal(45)),
                new CartItem("hat", new BigDecimal(55)),
                new CartItem("dress", new BigDecimal(30))
        );

        assertEquals(0, BigDecimal.valueOf(200).compareTo(CartUtil.checkoutWithDiscount(cartItems)));

    }
}
