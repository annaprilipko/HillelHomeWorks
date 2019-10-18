package Lesson11;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        Product productOne = new Product(new BigDecimal("10.23"), "FirstProduct");
        Product productTwo = new Product(new BigDecimal("11"), "SecondProduct");
        Product productThree = new Product(new BigDecimal("22.26"), "ThirdProduct");
        Product productFour = new Product(new BigDecimal("125.23"), "FourthProduct");

        List<Product> orderOne = new ArrayList<>();
        orderOne.add(productOne);
        orderOne.add(productFour);
        orderOne.add(productThree);

        List<Product> orderTwo = new ArrayList<>();
        orderTwo.add(productFour);
        orderTwo.add(productOne);

        List<Product> orderThree = new ArrayList<>();
        orderThree.add(productThree);
        orderThree.add(productFour);

        List<Product> orderFour = new ArrayList<>();
        orderFour.add(productTwo);

        List<Product> orderFive = new ArrayList<>();
        orderFive.add(productFour);

        List<Product> orderSix = new ArrayList<>();
        orderSix.add(productTwo);

        Customer customerOne = new Customer("One");
        Customer customerTwo = new Customer("Two");
        Customer customerThree = new Customer("Three");


        Order OrderOne = new Order(orderOne, customerOne, new Date(), OrderStatus.DELIVERED);
        Order OrderTwo = new Order(orderTwo, customerOne, new Date(), OrderStatus.EXPECTED_DELIVERY);
        Order OrderThree = new Order(orderThree, customerOne, new Date(), OrderStatus.EXPECTED_DELIVERY);
        Order OrderFour = new Order(orderFour, customerTwo, new Date(), OrderStatus.EXPECTED_DELIVERY);
        Order OrderFive = new Order(orderFive, customerTwo, new Date(), OrderStatus.IN_PROCESSING);
        Order OrderSix = new Order(orderSix, customerThree, new Date(), OrderStatus.IN_PROCESSING);

    }
}
