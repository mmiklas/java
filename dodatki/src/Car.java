import java.util.Objects;

public class Car {
    private String type;
    private String color;
    private int year;

    public Car(String type, String color, int year) {
        this.type = type;
        this.color = color;
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year &&
                Objects.equals(type, car.type) &&
                Objects.equals(color, car.color);
    }
}
