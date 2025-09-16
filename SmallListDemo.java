import java.util.List;
import java.util.ArrayList;

public class SmallListDemo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        System.out.println("Fruits: " + fruits);
        System.out.println("First fruit: " + fruits.get(0));
    }
}
