public class _Rectangle {
    private int lenght;
    private int breadth;

    public _Rectangle() {
    }

    public _Rectangle(int lenght, int breadth) {
        this.lenght = lenght;
        this.breadth = breadth;
    }

    public _Rectangle(int lenghtAndBreadth) {
        this.lenght = lenghtAndBreadth;
        this.breadth = lenghtAndBreadth;
    }

    public int caluclateArea() {
        return lenght * breadth;
    }

    public static void main(String[] args) {
        _Rectangle r1 = new _Rectangle();
        _Rectangle r2 = new _Rectangle(5,6);
        _Rectangle r3 = new _Rectangle(4);

        System.out.println("Pole powierzchni prostokąta r1 wynosi " + r1.caluclateArea());
        System.out.println("Pole powierzchni prostokąta r2 wynosi " + r2.caluclateArea());
        System.out.println("Pole powierzchni prostokąta r3 wynosi " + r3.caluclateArea());
    }
}
