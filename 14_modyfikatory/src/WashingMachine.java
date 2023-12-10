public class WashingMachine {

    private int temp;
    private int spinSpeed;

    void modeForSensitiveClothes() {
        temp = 30;
        spinSpeed = 800;
    }

    void modeForTowelsAndBedLinen() {
        temp = 90;
        spinSpeed = 1200;
    }
}
