package Lesson11;

import java.math.BigDecimal;

public class ShippingDetails {
    private BigDecimal shippingValue;
    private String address;

    public ShippingDetails(BigDecimal shippingValue, String address) {
        this.shippingValue = shippingValue;
        this.address = address;
    }

    public void setShippingValue(BigDecimal shippingValue) {
        this.shippingValue = shippingValue;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getShippingValue() {
        return shippingValue;
    }

    public String getAddress() {
        return address;
    }
}
