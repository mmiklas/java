package results;

import chapter5.Stopwatch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTester {

    public static final int NUMBER_ELEMENTS = 100_000;
    public static final int ELEMENT = 999999;

    public static void main(String[] args) {
        ListTester listTester = new ListTester();

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println();
        listTester.test(arrayList);
        listTester.test(linkedList);

        System.out.println();
        listTester.test(arrayList, true);
        listTester.test(linkedList, true);
    }

    private void test(List list, boolean isAddToHead) {
        Stopwatch sw = new Stopwatch();
        sw.start();
        addElement(list, NUMBER_ELEMENTS, ELEMENT, isAddToHead);
        sw.stop();
        sw.showResult(buildMessage(list.getClass().getSimpleName(), isAddToHead));
    }

    private void test(List list) {
        test(list, false);
    }

    private void addElement(List list, int numberElements, Object elementToAdd, boolean isAddToHead) {
        for (int i = 0; i < numberElements; i++) {
            if (isAddToHead) {
                list.add(0, elementToAdd);
            } else {
                list.add(elementToAdd);
            }
        }
    }

    private String buildMessage(String listType, boolean isAddToHead) {
        StringBuilder message = new StringBuilder();
        message.append("Lista typu " + listType);
        message.append(", dodawanie ");
        if (isAddToHead) {
            message.append("na początek ");
        } else {
            message.append("na koniec ");
        }
        return message.toString();
    }
}
