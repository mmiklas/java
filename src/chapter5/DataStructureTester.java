package chapter5;

public class DataStructureTester {

    private final static Integer MAX_ELEMENTS = 100_000;

    public static void main(String[] args) {
        DataStructureTester dst = new DataStructureTester();

        DataStructure arrayDataStructure = new ArrayDataStructure(MAX_ELEMENTS);
        DataStructure arrayListDataStructure = new ArrayListDataStructure(MAX_ELEMENTS);
        DataStructure linkedListDataStructure = new LinkedListDataStructure(MAX_ELEMENTS);

        dst.createTest(arrayDataStructure, "create Array");
        dst.createTest(arrayListDataStructure, "create ArrayList");
        dst.createTest(linkedListDataStructure, "create LinkedList");

        System.out.println();

        dst.saveTest(arrayDataStructure, "save Array");
        dst.saveTest(arrayListDataStructure, "save ArrayList");
        dst.saveTest(linkedListDataStructure, "save LinkedList");

        System.out.println();

        dst.readTest(arrayDataStructure, "read Array");
        dst.readTest(arrayListDataStructure, "read ArrayList");
        dst.readTest(linkedListDataStructure, "read LinkedList");
    }

    private void  createTest(DataStructure dataStructure, String label) {
        StopwatchUtil stopwatch = new StopwatchUtil();
        stopwatch.start();
        dataStructure.create();
        stopwatch.stop();
        stopwatch.showResult(label);
    }

    private void saveTest(DataStructure dataStructure, String label) {
        StopwatchUtil stopwatch = new StopwatchUtil();
        stopwatch.start();
        dataStructure.save();
        stopwatch.stop();
        stopwatch.showResult(label);
    }

    private void readTest(DataStructure dataStructure, String label) {
        StopwatchUtil stopwatch = new StopwatchUtil();
        stopwatch.start();
        dataStructure.read();
        stopwatch.stop();
        stopwatch.showResult(label);
    }

}









