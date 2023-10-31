import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MyMap<Integer, String> myMap = new MyMap<>();
        myMap.put(4, "A");
        myMap.put(5, "B");
        myMap.put(7, "C");
        System.out.println(myMap);
        System.out.println(myMap.get(7));
        System.out.println(myMap.entrySet());
    }
}