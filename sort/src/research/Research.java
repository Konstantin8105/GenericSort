package research;

import research.base.Test;
import sort.Sort;

public class Research {

    static class OutputResult{
        public String sortName;
        public double time;
        boolean winner;

        public OutputResult() {
            winner = false;
        }
    }

    public static void main(String[] args) {
        for (Test<?> test : ListTests.tests) {
            System.out.println("\n"+test.getClass().toString() + ":");

            OutputResult result[] = new OutputResult[ListSort.sorts.length];
            for (int i = 0; i < ListSort.sorts.length; i++) {
                result[i] = new OutputResult();
                result[i].sortName = ListSort.sorts[i].getClass().toString();
                result[i].time = time(test, ListSort.sorts[i]) * 1e-6d;
            }

            double minTime = result[0].time;
            for (int i = 0; i < result.length; i++) {
                if(minTime > result[i].time)
                    minTime = result[i].time;
            }
            for (int i = 0; i < result.length; i++) {
                if(result[i].time == minTime)
                    result[i].winner = true;
            }

            for (int i = 0; i < result.length; i++) {
                char winnerChar = ' ';
                if(result[i].winner) winnerChar = '*';
                String out = String.format("%-30s\t%-8.1f ms\t%c", result[i].sortName, result[i].time, winnerChar);
                System.out.println(out);
            }
        }
    }

    private static long time(Test<?> test, Sort sort) {

        long start = System.nanoTime();
        sort.sort(test.getArray());
        long end = System.nanoTime();

        return end - start;
    }
}
