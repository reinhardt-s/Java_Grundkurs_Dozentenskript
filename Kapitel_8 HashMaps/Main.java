import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1433, "Alex");
        map.put(1445, "Bob");
        map.put(1456, "Sydney");
        map.put(1467, "John");

        System.out.println(map.get(1433));

    }

}
