package DesignPattern.src.AdapterPattern;

public class TestAdapter {
    public static void main(String[] args) {
    Customer customer = new Customer();
    customer.setName("Minh Lee");
    CustomerAdapter adapter = new CustomerAdapter(customer);
    System.out.println("Customer first name: " + adapter.getFirstName());
    System.out.println("Customer last name: " + adapter.getLastName());
    }
}