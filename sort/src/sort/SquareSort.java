package sort;

import search.BinarySearchInMiddleItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquareSort<T extends Comparable<T>> implements Sort<T> {

    @Override
    public List<T> sort(List<T> list) {
        if (list == null)
            throw new NullPointerException();
        if (list.size() == 0)
            throw new IndexOutOfBoundsException();

        List<T> items = new ArrayList<>(list);

        int amountKeys = (int) Math.max(Math.sqrt(list.size()), 1);

        List<T> keys = new ArrayList<>();
        for (int i = amountKeys; i >= 0; i--) {
            int positionInArray = i * amountKeys;
            if (positionInArray < list.size()) {
                keys.add(list.get(positionInArray));
                items.remove(positionInArray);
            }
        }

        //sort

        MergeSort<T> mergeSort = new MergeSort<>();
        List<T> sortedKeys = mergeSort.sort(keys);

        //sort by array

        List<T>[] arrays = new ArrayList[sortedKeys.size() + 1];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = new ArrayList<>();
        }

        BinarySearchInMiddleItem<T> binary = new BinarySearchInMiddleItem<>();
        for (T item : items) {
            int position = binary.search(sortedKeys, item);
            if (position == sortedKeys.size())
                position--;
            int positionInArrays = position + 1;
            arrays[positionInArrays].add(item);
        }

        //sort each array

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i].size() > 0) {
                arrays[i] = mergeSort.sort(arrays[i]);
            }
        }

        List<T> out = new ArrayList<>();

        for (int i = 0; i < arrays.length; i++) {
            if (i != 0) {
                out.add(sortedKeys.get(i - 1));
            }
            out.addAll(arrays[i]);
        }

        return out;
    }

    public static void main(String[] args) {
        List<Integer> o = Arrays.asList(0, 3, 34, 3453, 45, 345, 6, 456, 8, 0, 4, 5, 67, 88, -2);
        SquareSort<Integer> squareSort = new SquareSort<>();
        System.out.println(o);
        System.out.println(o.size());
        System.out.println(squareSort.sort(o));
        System.out.println(squareSort.sort(o).size());
    }
}
