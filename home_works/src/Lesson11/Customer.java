package Lesson11;

public class Customer {
    private String customerName;
    private final int customerIdentifierCurrent = customerIdentifier++;
    private static int customerIdentifier = 0;


    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getCustomerIdentifierCurrent() {
        return customerIdentifierCurrent;
    }
}
