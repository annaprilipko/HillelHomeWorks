package Lesson11;

import java.util.Date;
import java.util.List;

public class Order {
    private List<Product> productsList;
    private Customer customer;
    private ShippingDetails shippingDetails;
    private Date date;
    private OrderStatus orderStatus;
    private final int orderIdentifierCurrent = orderIdentifier++ ;
    private static int orderIdentifier = 0;

    public Order(List<Product> productsList, Customer customer, ShippingDetails shippingDetails, Date date, OrderStatus orderStatus) {
        this.productsList = productsList;
        this.customer = customer;
        this.shippingDetails = shippingDetails;
        this.date = date;
        this.orderStatus = orderStatus;
    }

    public Order(List<Product> productsList, Customer customer, Date date, OrderStatus orderStatus) {
        this.productsList = productsList;
        this.customer = customer;
        this.date = date;
        this.orderStatus = orderStatus;
    }

    public void setProductsList(List<Product> productsList) {
        this.productsList = productsList;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setShippingDetails(ShippingDetails shippingDetails) {
        this.shippingDetails = shippingDetails;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public List<Product> getProductsList() {
        return productsList;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ShippingDetails getShippingDetails() {
        return shippingDetails;
    }

    public Date getDate() {
        return date;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public int getOrderIdentifierCurrent() {
        return orderIdentifierCurrent;
    }
}
