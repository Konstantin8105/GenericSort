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

        return squareSort(new ArrayList<>(list));
    }

    private List<T> squareSort(ArrayList<T> items) {
        if (items.size() == 1)
            return items;
        if (items.size() == 2) {
            if(items.get(0).compareTo(items.get(1)) > 0){
                swap(items,0,1);
            }
            return items;
        }
        //if(items.size() < 32){
        //    BinarySort<T> sort2 = new BinarySort<>();
        //    return sort2.sort(items);
        //}


        int amountKeys = (int) Math.max(Math.sqrt(items.size()), 1);

        List<T> keys = new ArrayList<>();
        for (int i = amountKeys; i >= 0; i--) {
            int positionInArray = i * amountKeys;
            if (positionInArray < items.size()) {
                keys.add(items.get(positionInArray));
                items.remove(positionInArray);
            }
        }

        //sort

        SquareSort<T> sort = new SquareSort<>();
        List<T> sortedKeys = sort.sort(keys);

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
                arrays[i] = sort.sort(arrays[i]);
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

    private void swap(List<T> list, int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
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
