package pl.edu.wszib.podyplomowe;

public class PackagePresenter {
    public void showPackage() {
        System.out.println("To jest obiekt klasy " + this.getClass().getName() + ", w pakiecie " + this.getClass().getPackage());
    }
}
