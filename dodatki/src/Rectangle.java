public class Rectangle {
    private int lenght;
    private int breadth;

    public Rectangle() {
    }

    public Rectangle(int lenght, int breadth) {
        this.lenght = lenght;
        this.breadth = breadth;
    }

    public Rectangle(int lenghtAndBreadth) {
        this.lenght = lenghtAndBreadth;
        this.breadth = lenghtAndBreadth;
    }

    public int caluclateArea() {
        return lenght * breadth;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5,6);
        Rectangle r3 = new Rectangle(4);

        System.out.println("Pole powierzchni prostokąta r1 wynosi " + r1.caluclateArea());
        System.out.println("Pole powierzchni prostokąta r2 wynosi " + r2.caluclateArea());
        System.out.println("Pole powierzchni prostokąta r3 wynosi " + r3.caluclateArea());
    }
}
