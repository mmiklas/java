import java.util.HashMap;
import java.util.Map;

public class MapTester {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap();
        map.put("Tomek", 23);
        map.put("Agata", 44);
        map.put("WOjtek",17);
        map.put("ALicja", 66);

        for (Map.Entry personEntry : map.entrySet()) {
            System.out.println("imię: " + personEntry.getKey() + " wiek: " + personEntry.getValue());
        }
    }
}