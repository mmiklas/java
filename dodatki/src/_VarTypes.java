public class _VarTypes {
    public String instanceVariable = "Jestem zmienną egzemplarza";
    public static String classVariable = "Jestem zmienną klasy";

    public static void main(String[] args) {
        String localVariable = "Jestem zmienną lokalną";

        //wyświetla zawartość zmiennej lokalnej
        System.out.println(localVariable);

        //wyświetla zawartość zmiennej egzemplarza
        _VarTypes varTypes = new _VarTypes();
        System.out.println(varTypes.instanceVariable);

        //wyświetla zawartość zmiennej klasy
        System.out.println(_VarTypes.classVariable);
    }
}
