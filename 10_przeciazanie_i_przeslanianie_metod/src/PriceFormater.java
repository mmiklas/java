class PriceFormater {

    String currency = "zł";

    private String formatPrice(int value) {
        return String.format("%d,00 %s", value, currency);
    }

    private String formatPrice(double value) {
        return String.format("%.2f %s", value, currency);
    }

    private String formatPrice(String value) {
        return String.format("%.2f %s", Double.parseDouble(value), currency);
    }

    public static void main(String[] args) {
        PriceFormater pf = new PriceFormater();
        //pf.currency = "PLN";
        System.out.println(pf.formatPrice(500));
        System.out.println(pf.formatPrice(89.9934));
        System.out.println(pf.formatPrice("550"));
    }
}