/* Rozwiązanie dla rozdział 3., ćwiczenie 2. */

package chapter3;

class Sampler {
    public static void main(String[] arguments) {
        Sample thing = new Sample();
        thing.height = 72;
        thing.weight = 1000;
        thing.depth = 420;
        System.out.println("Wysokość: " + thing.height);
        System.out.println("Szerokość: " + thing.weight);
        System.out.println("Głębokość: " + thing.depth);
    }
}
