import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // ArrayLists
        ArrayList<String> customers = new ArrayList<String>();
    
        customers.add("Hans");
        customers.add("Peter");
        customers.add("Klaus");
        System.out.println(customers);
        customers.remove(0);
        System.out.println(customers);
        customers.add(1, "Alex");
        System.out.println(customers);
        System.out.println(customers.get(2));
        customers.set(2, "Sydney");
        System.out.println(customers);


        // Linked Lists
        LinkedList<String> customersList = new LinkedList<String>();
        customersList.add("Hans");
        customersList.add("Peter");
        customersList.add("Klaus");
        System.out.println(customersList);
        customersList.remove(1);
        System.out.println(customersList);
        customersList.add(1, "Alex");
        System.out.println(customersList);
        System.out.println(customersList.get(2));
        customersList.set(2, "Sydney");
        System.out.println(customersList);

        // Dirty Dozen - ArrayList
        ArrayList<ArrayList<String>> dirtyDozen = new ArrayList<ArrayList<String>>();
        // dirtyDozen.add("Strawberries");
        // dirtyDozen.add("Spinach");
        // dirtyDozen.add("Kale");
        // dirtyDozen.add("Nectarines");
        // dirtyDozen.add("Apples");
        // dirtyDozen.add("Grapes");
        // dirtyDozen.add("Peaches");
        // ...
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Strawberries");
        fruits.add("Nectarines");
        fruits.add("Apples");
        fruits.add("Grapes");
        fruits.add("Peaches");
        
        ArrayList<String> vegetables = new ArrayList<String>();
        vegetables.add("Spinach");
        vegetables.add("Kale");
        vegetables.add("Tomatoes");
        vegetables.add("Celery");
        vegetables.add("Potatoes");


        dirtyDozen.add(fruits);
        dirtyDozen.add(vegetables);

        System.out.println(dirtyDozen);
        System.out.println(dirtyDozen.get(0));
        System.out.println(dirtyDozen.get(1).get(2));

    }
}
