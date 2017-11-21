package chapter5;

import java.util.LinkedList;
import java.util.List;

public class Test2 implements DataStructure {
    private int max;
    private int tmp;
    List<Integer> linkedList;

    public Test2(int max) {
        this.max = max;
    }

    @Override
    public void create() {
        linkedList = new LinkedList();
    }

    @Override
    public void save() {
        for (int i = 0; i < max; i++) {
            linkedList.add(INT_NUMBER);
        }
    }

    @Override
    public void read() {
        for (int i = 0; i < max; i++) {
            tmp = linkedList.get(i);
        }
    }
}