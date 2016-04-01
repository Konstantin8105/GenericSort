import sort.*;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class ResearchTest {

    private final static Random random = new Random();
    private final int SIZE_TEST_ELEMENTS = 100_000;

    private static Sort[] getSortClasses() {
        return new Sort[]{
                new MergeSort()
                ,
                new CountingSort()
                ,
                //new SelectionSort()
                //,
                new BinarySort()
                ,
                new InsertionSort()
        };
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
            long start = (new Date()).getTime();
            sortClass.sort(input);
            long end = (new Date()).getTime();
            timePeriod.add(end - start);
        }
        double averageTime = 0;
        for (Long time : timePeriod) {
            averageTime += time;
        }
        averageTime /= timePeriod.size();
        return averageTime;
    }

    @SuppressWarnings("unchecked")
    @org.junit.Test
    public void testCorrectResult() throws Exception {
        System.out.println("\n#Test. Checking of correct result:");
        System.out.println("Amount elements = " + SIZE_TEST_ELEMENTS + " items");
        List<Integer> array = getRandomList(SIZE_TEST_ELEMENTS, true);

        List<Integer> expected  = new ArrayList<>(array);
        Collections.sort(expected);

        for (Sort sortClass : getSortClasses()) {
            System.out.print(String.format("> %s", sortClass.getClass().toString()));
            List<Integer> result = sortClass.sort(array);
            assertEquals(array.size(), result.size());
            assertEquals(expected,result);
            System.out.print(" --> OK\n");
        }
    }

    @org.junit.Test
    public void testTimeNotUniqueItems() throws Exception {
        System.out.println("\n#Test with many same items:");
        System.out.println("Amount elements = " + SIZE_TEST_ELEMENTS + " items");
        List<Integer> array = getRandomList(SIZE_TEST_ELEMENTS, false);
        for (Sort sortClass : getSortClasses()) {
            System.out.print(String.format("> %s", sortClass.getClass().toString()));
            double time = getTimeOfSort(array, sortClass);
            System.out.print(String.format(" --> %4.1f ms\n", time));
        }
    }

    @org.junit.Test
    public void testTimeUniqueItems() throws Exception {
        System.out.println("\n#Test with many unique items:");
        System.out.println("Amount elements = " + SIZE_TEST_ELEMENTS + " items");
        List<Integer> array = getRandomList(SIZE_TEST_ELEMENTS, true);
        for (Sort sortClass : getSortClasses()) {
            System.out.print(String.format("> %s", sortClass.getClass().toString()));
            double time = getTimeOfSort(array, sortClass);
            System.out.print(String.format(" --> %4.1f ms\n", time));
        }
    }

    @org.junit.Test
    public void testTimeUniqueItems_InvertDirection() throws Exception {
        System.out.println("\n#Test with many unique items on invert direction:");
        System.out.println("Amount elements = " + SIZE_TEST_ELEMENTS + " items");
        List<Integer> array = getRandomList(SIZE_TEST_ELEMENTS, true);
        Collections.sort(array);
        List<Integer> input = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            input.add(array.get(i));
        }
        for (Sort sortClass : getSortClasses()) {
            System.out.print(String.format("> %s", sortClass.getClass().toString()));
            double time = getTimeOfSort(input, sortClass);
            System.out.print(String.format(" --> %4.1f ms\n", time));
        }
    }

    @org.junit.Test
    public void testTimeUniqueItemsPresort() throws Exception {
        System.out.println("\n#Test add new item to sorted many unique items :");
        System.out.println("Amount elements = " + SIZE_TEST_ELEMENTS + " items");
        List<Integer> array = getRandomList(SIZE_TEST_ELEMENTS, true);
        Collections.sort(array);
        array.add(random.nextInt(SIZE_TEST_ELEMENTS));
        for (Sort sortClass : getSortClasses()) {
            System.out.print(String.format("> %s", sortClass.getClass().toString()));
            double time = getTimeOfSort(array, sortClass);
            System.out.print(String.format(" --> %4.1f ms\n", time));
        }
    }

    @org.junit.Test
    public void testTimeNotUniqueItemsPresort() throws Exception {
        System.out.println("\n#Test add new item to sorted many same items :");
        System.out.println("Amount elements = " + SIZE_TEST_ELEMENTS + " items");
        List<Integer> array = getRandomList(SIZE_TEST_ELEMENTS, true);
        Collections.sort(array);
        array.add(random.nextInt(SIZE_TEST_ELEMENTS));
        for (Sort sortClass : getSortClasses()) {
            System.out.print(String.format("> %s", sortClass.getClass().toString()));
            double time = getTimeOfSort(array, sortClass);
            System.out.print(String.format(" --> %4.1f ms\n", time));
        }
    }


    @org.junit.Test
    public void testTimeUniqueItemsPresort2() throws Exception {
        System.out.println("\n#Test add new item to sorted many unique items. variant 2:");
        System.out.println("Amount elements = " + SIZE_TEST_ELEMENTS + " items");
        List<Integer> array = getRandomList(SIZE_TEST_ELEMENTS, true);
        Collections.sort(array);
        array.add(0,random.nextInt(SIZE_TEST_ELEMENTS));
        for (Sort sortClass : getSortClasses()) {
            System.out.print(String.format("> %s", sortClass.getClass().toString()));
            double time = getTimeOfSort(array, sortClass);
            System.out.print(String.format(" --> %4.1f ms\n", time));
        }
    }

    @org.junit.Test
    public void testTimeNotUniqueItemsPresort2() throws Exception {
        System.out.println("\n#Test add new item to sorted many same items. variant 2 :");
        System.out.println("Amount elements = " + SIZE_TEST_ELEMENTS + " items");
        List<Integer> array = getRandomList(SIZE_TEST_ELEMENTS, true);
        Collections.sort(array);
        array.add(0,random.nextInt(SIZE_TEST_ELEMENTS));
        for (Sort sortClass : getSortClasses()) {
            System.out.print(String.format("> %s", sortClass.getClass().toString()));
            double time = getTimeOfSort(array, sortClass);
            System.out.print(String.format(" --> %4.1f ms\n", time));
        }
    }

    @org.junit.Test
    public void testResearchUniqueWithDifferentSize() throws Exception {
        System.out.println("\n#Research of sorting:");
        int minExponent = 4;
        int maxExponent = 6;
        System.out.println("Amount elements = "
                + Math.pow(10, minExponent)
                + " ... "
                + Math.pow(10, maxExponent)
                + " items");
        List<List<Integer>> matrix = new ArrayList<>();
        for (int i = minExponent; i <= maxExponent; i++) {
            int amountItems = (int)Math.pow(10d,i);
            matrix.add(getRandomList(amountItems, true));
        }

        System.out.println("Result of research");
        for (Sort sortClass : getSortClasses()) {
            if(sortClass instanceof SelectionSort ||
                    sortClass instanceof BinarySort ||
                    sortClass instanceof InsertionSort
                    ){
                continue;
            }
            System.out.println(String.format("%s", sortClass.getClass().toString()));
            System.out.print(String.format("%10s","Amount:"));
            for (int i = minExponent; i <= maxExponent; i++) {
                System.out.print(String.format("   10^%d |", i));
            }
            System.out.println();
            System.out.print(String.format("%10s","Time(ms):"));
            for (int i = 0; i <= maxExponent - minExponent; i++) {
                double time = getTimeOfSort(matrix.get(i), sortClass);
                System.out.print(String.format("%7.1f |", time));
                System.out.flush();
            }
            System.out.println("\n");
        }
    }
}