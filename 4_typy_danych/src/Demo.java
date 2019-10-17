public class Demo {

    public static void main(String[] args) {

        //typ obiektowy
        System.out.println("Ciągi znaków zapisujemy w cudzysłowie");
        System.out.println("\""); //escape'owanie

        String name = "Ala";
        System.out.println(name);
        System.out.println("Cześć, jestem " + name);  //konkatenacja
        System.out.println("tekst " + 1 + 1);

        String title = "Naucz się szydełkować\u2122";
        System.out.println(title);



    }
}
