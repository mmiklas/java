public class PackagePresenter {

    public PackagePresenter() {
        System.out.println("I żeby nie było...");
    }

    public static void main(String[] args) {
        PackagePresenter packagePresenter = new PackagePresenter();
        packagePresenter.showPackage();
    }

    public void showPackage() {
        System.out.println("To jest obiekt klasy " + this.getClass().getName() + ", w pakiecie " + this.getClass().getPackage());
    }
}