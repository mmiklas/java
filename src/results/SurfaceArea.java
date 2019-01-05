package results;

public class SurfaceArea {
    public static void main(String[] args) {

        Figure[] figures = new Figure[4];
        figures[0] = new Triangle(1, 3);
        figures[1] = new Square(2);
        figures[2] = new Rectangle(2,5);
        figures[3] = new Square(5);

        for (Figure figure : figures) {
            System.out.println("Pole powierzchni = " + figure.getSurfeaceArea());
        }

    }
}

interface Figure {
    double getSurfeaceArea();
}

class Square implements Figure {
    int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public double getSurfeaceArea() {
        return a * a;
    }
}

class Rectangle implements Figure {
    int a;
    int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getSurfeaceArea() {
        return a * b;
    }
}

class Triangle implements Figure {
    int a;
    int h;

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double getSurfeaceArea() {
        return a * h / 2.;
    }
}
