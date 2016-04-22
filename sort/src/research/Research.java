package research;

import research.base.Test;
import sort.Sort;

import java.util.Collections;

public class Research {

    private static final char SORT_WINNER = '*';
    private static final char SORT_LOST = ' ';

    static class OutputResult {
        public String sortName;
        public double time;
        boolean winner;

        public OutputResult() {
            winner = false;
        }
    }

    public static void main(String[] args) throws Exception {
        for (Test<?> test : ListTests.tests) {
            System.out.println("\n\n## " + test.getClass().toString() + ":\n");

            OutputResult result[] = new OutputResult[ListSort.sorts.length + 1];

            for (int i = 0; i < ListSort.sorts.length; i++) {
                result[i] = new OutputResult();
                result[i].sortName = ListSort.sorts[i].getClass().toString();
                result[i].time = time(test, ListSort.sorts[i]) * 1e-6d;
            }

            int positionCollection = ListSort.sorts.length;
            result[positionCollection] = new OutputResult();
            result[positionCollection].sortName = "Collections.sort";
            result[positionCollection].time = time(test) * 1e-6d;


            double minTime = result[0].time;
            for (int i = 0; i < result.length; i++) {
                if (minTime > result[i].time)
                    minTime = result[i].time;
            }
            for (int i = 0; i < result.length; i++) {
                if (result[i].time == minTime)
                    result[i].winner = true;
            }

            for (int i = 0; i < result.length; i++) {
                char winnerChar = SORT_LOST;
                if (result[i].winner) winnerChar = SORT_WINNER;
                String out = String.format("> %-30s\t%-8.2f ms\t%c\n", result[i].sortName, result[i].time, winnerChar);
                System.out.println(out);
            }
            System.out.flush();
        }
    }

    private static int amountTest = 3;

    private static double time(Test<?> test) {
        long start = System.nanoTime();
        for (int i = 0; i < amountTest; i++) {
            Collections.sort(test.getArray());
        }
        long end = System.nanoTime();
        return (end-start)/amountTest;
    }

    private static long time(Test<?> test, Sort sort) throws Exception {
        long start = System.nanoTime();
        for (int i = 0; i < amountTest; i++) {
            sort.sort(test.getArray());
        }
        long end = System.nanoTime();
        return (end-start)/amountTest;
    }
}
