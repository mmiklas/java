public class WashingMachine {

    private int temperature;
    private int spinSpeed;

    void modeForSensitiveClothes() {
        temperature = 30;
        spinSpeed = 800;
    }

    void modeForTowelsAndBedLinen() {
        temperature = 90;
        spinSpeed = 1200;
    }
}
