package chapter5;

public class ArrayDataStructure implements DataStructure {

    private int max;
    private int tmp;
    private Integer[] arr;

    public ArrayDataStructure(int max) {
        this.max = max;
    }

    @Override
    public void create() {
        arr = new Integer[max];
    }

    @Override
    public void save() {
        for (int i = 0; i < max ; i++) {
            arr[i]=DataStructure.INT_NUMBER;
        }
    }

    @Override
    public void read() {
        for (int i = 0; i < max ; i++) {
            tmp = arr[i];
        }
    }
}
