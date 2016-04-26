import research.ListSort;
import sort.*;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class TestCorrection {

    private final int SIZE_TEST_ELEMENTS = 110;

    Random rnd = new Random();

    @SuppressWarnings("unchecked")
    @org.junit.Test
    public void testCorrectResult() throws Exception {
        System.out.println("\n##Test. Checking of correct result:\n");
        System.out.println("Amount elements = " + SIZE_TEST_ELEMENTS + " items\n");
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < SIZE_TEST_ELEMENTS; i++) {
            array.add(rnd.nextInt(SIZE_TEST_ELEMENTS));
        }

        List<Integer> expected  = new ArrayList<>(array);
        Collections.sort(expected);

        for (Sort sortClass : ListSort.sorts) {
            System.out.print(String.format("> %s -- ", sortClass.getClass().toString()));
            List<Integer> result = sortClass.sort(array);
            assertEquals(array.size(), result.size());
            System.out.print("*");
            assertEquals(expected,result);
            System.out.print("*");
            System.out.println(" --> OK\n");
        }
    }
}
