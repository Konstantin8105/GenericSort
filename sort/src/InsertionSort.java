import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class InsertionSort<T extends Comparable<T>> implements Sort<T> {
    @Override
    public List<T> sort(List<T> list) {
        if (list == null)
            throw new NullPointerException();
        if (list.size() == 0)
            throw new IndexOutOfBoundsException();
        if (list.size() == 1)
            return new ArrayList<>(list);

        List<T> output = new ArrayList<>(list);

        System.out.println("\n\nlist = " + list);

        int position = 1;
        for (int i = position; i < output.size(); i++) {

            System.out.println("output = " + output.subList(0, position) + ":");

            int presentPosition = position;
            while (output.get(presentPosition - 1).compareTo(output.get(presentPosition)) > 0) {
                System.out.println("swap :" + output.get(presentPosition) + ":" + output.get(presentPosition - 1));
                swap(output, presentPosition, presentPosition - 1);
            }
            position++;
        }

        return output;
    }

    private void swap(List<T> list, int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1, 2, 3, 4, 5, 0, 6, 7, 8);

        List<Integer> expected = new ArrayList<>(array);
        Collections.sort(expected);

        InsertionSort<Integer> sort = new InsertionSort<>();

        List<Integer> result = sort.sort(array);

        assertEquals(array.size(), result.size());
        assertEquals(expected, result);
    }
}
