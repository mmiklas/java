import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ChairStream {
    public static void main(String[] args) {

        List<Chair> chairs = Arrays.asList(
                new Chair("Adde", "IKEA", 2016),
                new Chair("Janinge", "IKEA", 2016),
                new Chair("Adde", "IKEA", 2015),
                new Chair("Adde", "IKEA", 2016),
                new Chair("Filo", "Black Red White", 2015)
        );

        //Pozyskujemy tylko krzesła Adde
        List addeChairs = chairs.stream().filter(c -> c.getModel().equals("Adde")).collect(Collectors.toList());
        System.out.println(addeChairs);

        //Grupujemy po roku produkcji
        Map<Integer, List<Chair>> chairByProductionYear =
                chairs.stream().collect(Collectors.groupingBy(c -> c.getProductionYear()));
        chairByProductionYear.forEach((year, chairList) -> System.out.println(year + " -> " + chairList));

        //Wypisujemy unikatowe modele producenta IKEA w jednej linii
        String ikeaModels = chairs.stream()
                .filter(c -> c.getManufacturer().equals("IKEA"))
                .map(c -> c.getModel())
                .distinct()
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println(ikeaModels);

    }
}
