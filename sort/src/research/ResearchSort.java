package research;

import sort.*;

import java.util.*;

public class ResearchSort {
    private final int SIZE_TEST_ELEMENTS = 10_000;

    private final static Random random = new Random();

    private static Sort[] getSortClasses() {
        return new Sort[]{
                new MergeSortIndex()
                ,
                new MergeSort()
                ,
                new CountingSort()
                ,
                new SquareSort<>()
                ,
                new SelectionSort()
                ,
                new BinarySort()
                ,
                new InsertionSort()
        };
    }

    private void header(String header) {
        System.out.println("---------------------------------------\n");
        System.out.println("## " + header + "\n");
    }

    private void info(String info) {
        System.out.println(info + "\n");
    }

    private void line(String className, double time) {
        System.out.println("> " + className + " --> " + String.format("%.1f", time) + " ms\n");
    }

    private List<Integer> getRandomList(int amountElements, boolean isManyUnique) {
        List<Integer> output = new ArrayList<>();
        int factorUnique = amountElements;
        if (isManyUnique) {
            factorUnique *= 10.d;
        } else {
            factorUnique *= 0.01d;
        }
        if (factorUnique < 1) {
            factorUnique = 1;
        }
        for (int i = 0; i < amountElements; i++) {
            output.add(random.nextInt(factorUnique));
        }
        return output;
    }

    @SuppressWarnings("unchecked")
    private <T> double getTimeOfSort(List<T> input, Sort sortClass) {
        List<Long> timePeriod = new ArrayList<>();
        int amountTest = 5;
        for (int i = 0; i < amountTest; i++) {
            List<T> list = new ArrayList<>(input);
            long start = (new Date()).getTime();
            sortClass.sort(list);
            long end = (new Date()).getTime();
            timePeriod.add(end - start);
        }
        /*
        long minTime = timePeriod.get(0);
        for (Long time : timePeriod) {
            minTime = Math.min(minTime, time);
        }
        return (double) minTime;
        */
        //System.out.println(timePeriod+"\n");
        double averageTime = 0;
        for (Long time : timePeriod) {
            averageTime += time;
        }
        return averageTime / ((double) timePeriod.size());
    }


    @org.junit.Test
    public void testTimeNotUniqueItems() throws Exception {
        header("Test with many same items:");
        info("Amount elements = " + SIZE_TEST_ELEMENTS + " items");
        List<Integer> array = getRandomList(SIZE_TEST_ELEMENTS, false);

        long start = (new Date()).getTime();
        Collections.sort(new ArrayList<>(array));
        long end = (new Date()).getTime();
        line("Collections.sort()", (double) (end - start));

        for (Sort sortClass : getSortClasses()) {
            double time = getTimeOfSort(array, sortClass);
            line(sortClass.getClass().toString(), time);
        }
    }

    @org.junit.Test
    public void testTimeUniqueItems() throws Exception {
        header("Test with many unique items:");
        info("Amount elements = " + SIZE_TEST_ELEMENTS + " items");
        List<Integer> array = getRandomList(SIZE_TEST_ELEMENTS, true);

        long start = (new Date()).getTime();
        Collections.sort(new ArrayList<>(array));
        long end = (new Date()).getTime();
        line("Collections.sort()", (double) (end - start));

        for (Sort sortClass : getSortClasses()) {
            double time = getTimeOfSort(array, sortClass);
            line(sortClass.getClass().toString(), time);
        }
    }


    @org.junit.Test
    public void testTimeUniqueStrings() throws Exception {
        header("Test with many unique strings:");
        info("Amount elements = " + SIZE_TEST_ELEMENTS + " items");
        List<String> array = new ArrayList<>();
        for (int i = 0; i < SIZE_TEST_ELEMENTS; i++) {
            array.add(String.format("number%7.10f", random.nextDouble())
                    +
                    String.format("and%7.10fabc", random.nextDouble())
                    +
                    String.format("%10d", random.nextLong())
            );
        }

        long start = (new Date()).getTime();
        Collections.sort(new ArrayList<>(array));
        long end = (new Date()).getTime();
        line("Collections.sort()", (double) (end - start));

        for (Sort sortClass : getSortClasses()) {
            double time = getTimeOfSort(array, sortClass);
            line(sortClass.getClass().toString(), time);
        }
    }

    @org.junit.Test
    public void testTimeUniqueItems_InvertDirection() throws Exception {
        header("Test with many unique items on invert direction:");
        info("Amount elements = " + SIZE_TEST_ELEMENTS + " items");
        List<Integer> array = getRandomList(SIZE_TEST_ELEMENTS, true);
        Collections.sort(array);
        {
            List<Integer> input = new ArrayList<>();
            for (int i = 0; i < array.size(); i++) {
                input.add(array.get(i));
            }
            array = input;
        }

        long start = (new Date()).getTime();
        Collections.sort(new ArrayList<>(array));
        long end = (new Date()).getTime();
        line("Collections.sort()", (double) (end - start));

        for (Sort sortClass : getSortClasses()) {
            double time = getTimeOfSort(array, sortClass);
            line(sortClass.getClass().toString(), time);
        }
    }

    @org.junit.Test
    public void testTimeUniqueItemsPresort() throws Exception {
        header("Test add new item to sorted many unique items :");
        info("Amount elements = " + SIZE_TEST_ELEMENTS + " items");
        List<Integer> array = getRandomList(SIZE_TEST_ELEMENTS, true);
        Collections.sort(array);
        array.add(random.nextInt(SIZE_TEST_ELEMENTS));

        long start = (new Date()).getTime();
        Collections.sort(new ArrayList<>(array));
        long end = (new Date()).getTime();
        line("Collections.sort()", (double) (end - start));

        for (Sort sortClass : getSortClasses()) {
            double time = getTimeOfSort(array, sortClass);
            line(sortClass.getClass().toString(), time);
        }
    }

    @org.junit.Test
    public void testTimeNotUniqueItemsPresort() throws Exception {
        header("Test add new item to sorted many same items :");
        info("Amount elements = " + SIZE_TEST_ELEMENTS + " items");
        List<Integer> array = getRandomList(SIZE_TEST_ELEMENTS, true);
        Collections.sort(array);

        long start = (new Date()).getTime();
        Collections.sort(new ArrayList<>(array));
        long end = (new Date()).getTime();
        line("Collections.sort()", (double) (end - start));

        array.add(random.nextInt(SIZE_TEST_ELEMENTS));
        for (Sort sortClass : getSortClasses()) {
            double time = getTimeOfSort(array, sortClass);
            line(sortClass.getClass().toString(), time);
        }
    }


    @org.junit.Test
    public void testTimeUniqueItemsPresort2() throws Exception {
        header("Test add new item to sorted many unique items. variant 2:");
        info("Amount elements = " + SIZE_TEST_ELEMENTS + " items");
        List<Integer> array = getRandomList(SIZE_TEST_ELEMENTS, true);
        Collections.sort(array);
        array.add(0, random.nextInt(SIZE_TEST_ELEMENTS));

        long start = (new Date()).getTime();
        Collections.sort(new ArrayList<>(array));
        long end = (new Date()).getTime();
        line("Collections.sort()", (double) (end - start));

        for (Sort sortClass : getSortClasses()) {
            double time = getTimeOfSort(array, sortClass);
            line(sortClass.getClass().toString(), time);
        }
    }

    @org.junit.Test
    public void testTimeNotUniqueItemsPresort2() throws Exception {
        header("Test add new item to sorted many same items. variant 2 :");
        info("Amount elements = " + SIZE_TEST_ELEMENTS + " items");
        List<Integer> array = getRandomList(SIZE_TEST_ELEMENTS, true);
        Collections.sort(array);
        array.add(0, random.nextInt(SIZE_TEST_ELEMENTS));

        long start = (new Date()).getTime();
        Collections.sort(new ArrayList<>(array));
        long end = (new Date()).getTime();
        line("Collections.sort()", (double) (end - start));

        for (Sort sortClass : getSortClasses()) {
            double time = getTimeOfSort(array, sortClass);
            line(sortClass.getClass().toString(), time);
        }
    }


    @org.junit.Test
    public void testTimeUniqueItemsPresort2NewItems() throws Exception {
        header("Test add 2 new item to sorted many unique items :");
        info("Amount elements = " + SIZE_TEST_ELEMENTS + " items");
        List<Integer> array = getRandomList(SIZE_TEST_ELEMENTS, true);
        Collections.sort(array);
        array.add(random.nextInt(SIZE_TEST_ELEMENTS));
        array.add(random.nextInt(SIZE_TEST_ELEMENTS));

        long start = (new Date()).getTime();
        Collections.sort(new ArrayList<>(array));
        long end = (new Date()).getTime();
        line("Collections.sort()", (double) (end - start));

        for (Sort sortClass : getSortClasses()) {
            double time = getTimeOfSort(array, sortClass);
            line(sortClass.getClass().toString(), time);
        }
    }

    @org.junit.Test
    public void testResearchUniqueWithDifferentSize() throws Exception {
        header("Research of sorting:\n");
        int minExponent = 0;
        int maxExponent = 6;
        info("Amount elements = "
                + Math.pow(10, minExponent)
                + " ... "
                + Math.pow(10, maxExponent)
                + " items\n");
        List<List<Integer>> matrix = new ArrayList<>();
        for (int i = minExponent; i <= maxExponent; i++) {
            int amountItems = (int) Math.pow(10d, i);
            matrix.add(getRandomList(amountItems, true));
        }

        info("Result of research\n");

        {
            System.out.println("Collections.sort()");
            System.out.print(String.format("%10s", "Amount:"));
            for (int i = minExponent; i <= maxExponent; i++) {
                System.out.print(String.format("   10^%d |", i));
            }

            System.out.println();
            System.out.print(String.format("%10s", "Time(ms):"));
            for (int i = 0; i <= maxExponent - minExponent; i++) {
                long start = (new Date()).getTime();
                Collections.sort(new ArrayList<>(matrix.get(i)));
                long end = (new Date()).getTime();
                System.out.print(String.format("%7.1f |", (double) (end - start)));
                System.out.flush();
            }
            System.out.println("\n");
        }

        for (Sort sortClass : getSortClasses()) {
            if (sortClass instanceof SelectionSort ||
                    sortClass instanceof BinarySort ||
                    sortClass instanceof InsertionSort
                    ) {
                continue;
            }
            System.out.println(String.format("%s", sortClass.getClass().toString()));
            System.out.print(String.format("%10s", "Amount:"));
            for (int i = minExponent; i <= maxExponent; i++) {
                System.out.print(String.format("   10^%d |", i));
            }
            System.out.println();
            System.out.print(String.format("%10s", "Time(ms):"));
            for (int i = 0; i <= maxExponent - minExponent; i++) {
                double time = getTimeOfSort(new ArrayList<>(matrix.get(i)), sortClass);
                System.out.print(String.format("%7.1f |", time));
                System.out.flush();
            }
            System.out.println("\n");
        }
    }

    public static void research(Sort sortClass) {

    }
}
