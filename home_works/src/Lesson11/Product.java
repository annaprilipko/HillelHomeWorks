package Lesson11;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Product {
    private BigDecimal productValue;
    private String nameOfProduct;
    private final int productIdentifierCurrent = productIdentifier++;
    private static int productIdentifier = 0;

    public Product(BigDecimal productValue, String nameOfProduct) {
        this.productValue = productValue;
        this.nameOfProduct = nameOfProduct;
    }

    public void setProductValue(BigDecimal productValue) {
        this.productValue = productValue;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public BigDecimal getProductValue() {
        return productValue;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public int getProductIdentifierCurrent() {
        return productIdentifierCurrent;
    }
}
