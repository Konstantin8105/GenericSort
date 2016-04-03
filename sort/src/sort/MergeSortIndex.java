package sort;

import java.util.ArrayList;
import java.util.List;

public class MergeSortIndex<T extends Comparable<T>> implements Sort<T> {

    @Override
    public List<T> sort(List<T> list) {
        if (list == null)
            throw new NullPointerException();
        if (list.size() == 0)
            throw new IndexOutOfBoundsException();
        if (list.size() == 1)
            return new ArrayList<>(list);

        int[] index = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            index[i] = i;
        }
        index = mergeSort(list, index);

        List<T> output = new ArrayList<>();
        for (int i = 0; i < index.length; i++) {
            output.add(list.get(index[i]));
        }

        return output;
    }

    private int[] mergeSort(List<T> list, int[] index) {
        if (index.length == 1) {
            return index;
        }
        if (index.length == 2) {
            if (list.get(index[0]).compareTo(list.get(index[1])) > 0) {
                //swap(list, start, end);
                int tempIndex = index[0];
                index[0] = index[1];
                index[1] = tempIndex;
            }
            return index;
        }

        int middle = index.length >>> 1;

        int[] flow1 = new int[middle - 0];
        System.arraycopy(index,0,flow1,0,middle);
        flow1 = mergeSort(list, flow1);

        int[] flow2 = new int[index.length - middle];
        System.arraycopy(index,middle,flow2,0,flow2.length);
        flow2 = mergeSort(list, flow2);

        int positionFlow1 = 0;
        int positionFlow2 = 0;
        int position = 0;

        while (true) {
            if (positionFlow1 == flow1.length && positionFlow2 == flow2.length) {
                break;
            } else if (positionFlow1 == flow1.length) {
                index[position] = flow2[positionFlow2++];
            } else if (positionFlow2 == flow2.length) {
                index[position] = flow1[positionFlow1++];
            } else if (list.get(flow1[positionFlow1]).compareTo(list.get(flow2[positionFlow2])) > 0) {
                index[position] = flow2[positionFlow2++];
            } else {
                index[position] = flow1[positionFlow1++];
            }
            position++;
        }
        return index;
    }
}
