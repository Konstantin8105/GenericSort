import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;

public class ResearchTest {

    private static Random random = new Random();
    int sizeTest = 10_000;

    // TODO create good research
    // TODO add file in sorted array
    private static Sort[] getSortClasses() {
        return new Sort[]{
                new MergeSort(),
                new CountingSort(),
                new SelectionSort()
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
        if(factorUnique < 1){
            factorUnique = 1;
        }
        for (int i = 0; i < amountElements; i++) {
            output.add(random.nextInt(factorUnique));
        }
        return output;
    }

    private <T> long getTimeOfSort(List<T> input, Sort sortClass) {
        List<Long> timePeriod = new ArrayList<>();
        int amountTest = 5;
        for (int i = 0; i < amountTest; i++) {
            long start = (new Date()).getTime();
            sortClass.sort(input);
            long end = (new Date()).getTime();
            timePeriod.add(end - start);
        }
        long averageTime = 0;
        for (Long time : timePeriod) {
            averageTime += time;
        }
        averageTime /= timePeriod.size();
        return averageTime;
    }

    @org.junit.Test
    public void testCorrectResult() throws Exception {
        System.out.println("\n#Test. Checking of correct result:");
        System.out.println("Amount elements = "+sizeTest+" items");
        List<Integer> array = getRandomList(sizeTest, true);

        for (Sort sortClass : getSortClasses()) {
            System.out.print(String.format("%20s", sortClass.getClass().toString()));
            List<Integer> result = sortClass.sort(array);
            assertEquals(array.size(), result.size());
            System.out.print(" .... OK\n");
        }
    }

    @org.junit.Test
    public void testResearchNotUnique() throws Exception {
        System.out.println("\n#Test with many same items:");
        System.out.println("Amount elements = "+sizeTest+" items");
        List<Integer> array = getRandomList(sizeTest, false);
        for (Sort sortClass: getSortClasses()) {
            System.out.print(String.format("%20s", sortClass.getClass().toString()));
            long time = getTimeOfSort(array,sortClass);
            System.out.print(String.format(" .... %5d ms\n",time));
        }
    }

    @org.junit.Test
    public void testResearchUnique() throws Exception {
        System.out.println("\n#Test with many unique items:");
        System.out.println("Amount elements = "+sizeTest+" items");
        List<Integer> array = getRandomList(sizeTest, true);
        for (Sort sortClass: getSortClasses()) {
            System.out.print(String.format("%20s", sortClass.getClass().toString()));
            long time = getTimeOfSort(array,sortClass);
            System.out.print(String.format(" .... %5d ms\n",time));
        }
    }
}
