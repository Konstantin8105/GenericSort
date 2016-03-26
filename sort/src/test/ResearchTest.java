import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ResearchTest {

    private static Random random = new Random();
    int sizeTest = 100_000;

    @org.junit.Test
    public void testResearchNotUnique() throws Exception {
        System.out.println("\nTest with many same items:");
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < sizeTest; i++) {
            array.add(random.nextInt((int) ((float) sizeTest * 0.01f)));
        }

        List<Integer> expert = new ArrayList<>(array);
        long startCollectionsSort = (new Date()).getTime();
        Collections.sort(expert);
        long endCollectionsSort = (new Date()).getTime();
        long timeCollectionsSort = endCollectionsSort - startCollectionsSort;
        System.out.println("CollectionsSort sort --> " + timeCollectionsSort + " ms\n");

        Sort[] sorts = new Sort[]
                {
                        new MergeSort(),
                        new CountingSort(),
                        new SelectionSort()
                };

        for (int i = 0; i < sorts.length; i++) {
            assertNotEquals(expert, array);
            long start = (new Date()).getTime();
            List<Integer> result = sorts[i].sort(new ArrayList<>(array));
            long end = (new Date()).getTime();
            long timeCounting = end - start;
            System.out.println
                    (String.format("%60s --> ", sorts[i].getClass().toString())
                            + timeCounting + " ms");
            assertEquals(expert.size(), result.size());
            assertEquals(expert, result);
        }
    }


    @org.junit.Test
    public void testResearchUnique() throws Exception {
        System.out.println("\nTest with many unique items:");
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < sizeTest; i++) {
            array.add(random.nextInt((int) ((float) sizeTest * 5f)));
        }

        List<Integer> expert = new ArrayList<>(array);
        long startCollectionsSort = (new Date()).getTime();
        Collections.sort(expert);
        long endCollectionsSort = (new Date()).getTime();
        long timeCollectionsSort = endCollectionsSort - startCollectionsSort;
        System.out.println("CollectionsSort sort --> " + timeCollectionsSort + " ms\n");

        Sort[] sorts = new Sort[]
                {
                        new MergeSort(),
                        new CountingSort(),
                        new SelectionSort()
                };

        for (int i = 0; i < sorts.length; i++) {
            assertNotEquals(expert, array);
            long start = (new Date()).getTime();
            List<Integer> result = sorts[i].sort(new ArrayList<>(array));
            long end = (new Date()).getTime();
            long timeCounting = end - start;
            System.out.println
                    (String.format("%60s --> ", sorts[i].getClass().toString())
                            + timeCounting + " ms");
            assertEquals(expert.size(), result.size());
            assertEquals(expert, result);
        }
    }
}
