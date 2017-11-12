package chapter5;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDataStructure implements DataStructure {

    private int max;
    private int tmp;
    private List<Integer>  arrList;

    public ArrayListDataStructure(int max) {
        this.max = max;
    }

    @Override
    public void create() {
        arrList = new ArrayList();
    }

    @Override
    public void save() {
        for (int i = 0; i < max; i++) {
            arrList.add(INT_NUMBER);
        }
    }

    @Override
    public void read() {
        for (int i = 0; i < max; i++) {
            tmp = arrList.get(i);
        }
    }
}
