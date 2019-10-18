import java.util.Locale;

public class Demo6 {

    public static void main(String[] args) {

        String str1, str2;
        str1 = str2 = "jakiś tekst";

        String name = str1.getClass().getSimpleName();

        System.out.println(name);

        boolean check1 = "Teksas" instanceof String; //true
        Object obiwan = new Object();
        boolean check2 = "Teks" instanceof Object; //false

        System.out.println(check2);

    }
}
