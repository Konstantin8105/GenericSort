package sort;

import java.util.ArrayList;
import java.util.List;

public class MergeSortIndexBinary<T extends Comparable<T>> implements Sort<T> {

    List<T> list;
    private final int INSERTION_SORT_BORDER = 8;

    @Override
    public List<T> sort(List<T> list) {
        if (list == null)
            throw new NullPointerException();
        if (list.size() == 0)
            throw new IndexOutOfBoundsException();
        if (list.size() == 1)
            return new ArrayList<>(list);

        this.list = list;

        int[] index = new int[this.list.size()];
        for (int i = 0; i < this.list.size(); i++) {
            index[i] = i;
        }
        index = mergeSort(index);

        List<T> output = new ArrayList<>();
        for (int i = 0; i < index.length; i++) {
            output.add(this.list.get(index[i]));
        }

        return output;
    }

    private int[] mergeSort(int[] index) {
        if (index.length < INSERTION_SORT_BORDER) {
            // insertion sort
            for (int i = 0; i < index.length; i++)
                for (int j = i; j > 0; j--)
                    if (list.get(index[j - 1]).compareTo(list.get(index[j])) > 0) {
                        int tempIndex = index[j];
                        index[j] = index[j - 1];
                        index[j - 1] = tempIndex;
                    }
            return index;
        }

        int middle = index.length >>> 1;

        int[] flow1 = new int[middle];
        System.arraycopy(index, 0, flow1, 0, middle);

        int[] flow2 = new int[index.length - middle];
        System.arraycopy(index, middle, flow2, 0, flow2.length);

        return mergeArrays(index, mergeSort(flow1), mergeSort(flow2));
    }

    private int[] mergeArrays(int[] result, int[] flow1, int[] flow2) {

        bibarySortInsertion();
        moveToLeft(int[]);
        moveToRight(int[]);
        return result;
    }
}
