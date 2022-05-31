import java.util.ArrayList;
import java.util.List;

public class ListElementRemover {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(null);
        list.add(33);
        list.add(null);
        list.add(5);

        System.out.println(list);

        //interfejs funkcyjny Predicate
        list.removeIf( e -> e == null);

        System.out.println(list);
    }
}
