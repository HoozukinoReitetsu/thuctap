package DesignPattern.src.AdapterPattern;

public class CustomerAdapter {
    Customer customer;
    private String firstName;
    private String lastName;

    public CustomerAdapter(Customer customer) {
        this.customer = customer;
        firstName=customer.getName().split(" ")[0];
        lastName=customer.getName().split(" ")[1];
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
