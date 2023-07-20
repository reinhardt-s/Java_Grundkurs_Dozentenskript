package de.pccollege;
import de.pccollege.data.Customer;

public class App 
{
    public static void main( String[] args )
    {
        Customer customer = new Customer();

        customer.setName("John Doe");
        customer.setAddress("123 Main Street");
        customer.setCity("Anytown");
        customer.setState("FL");
        customer.setZip("12345");
        customer.setPhone("555-555-5555");
        
    }
}
