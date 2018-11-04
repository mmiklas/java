package results;

public class ShowLong {
    public static void main(String[] args) {

        ShowLong showLong = new ShowLong();
        showLong.show(5_000_000_000_000_000L);

    }

    public void show(long l) {
        System.out.println(l);
    }
}

