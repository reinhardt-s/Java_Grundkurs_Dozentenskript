import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        HashMap<String, Rating> ratings = new HashMap<String, Rating>();

        ratings.put("Reblaus", new Rating(10, 5));
        ratings.put("Duck Dich", new Rating(5, 10));
        ratings.put("Raffaello", new Rating(10, 10));

        for (String restaurant : ratings.keySet()) {
            System.out.println(restaurant + " has a rating of:" + ratings.get(restaurant).getRating());
        }
    }
}
