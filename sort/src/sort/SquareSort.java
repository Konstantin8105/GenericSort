package sort;

import java.util.ArrayList;
import java.util.List;

public class SquareSort<T extends Comparable<T>> implements Sort<T> {
    @Override
    public List<T> sort(List<T> list) {
        if (list == null)
            throw new NullPointerException();
        if (list.size() == 0)
            throw new IndexOutOfBoundsException();

        int amountKeys = (int) Math.max(Math.sqrt(list.size()), 1);
        System.out.println("amountKeys = " + amountKeys);

        List<T> keys = new ArrayList<>();
        for (int i = 0; i < amountKeys; i++) {
            int positionInArray = i * amountKeys;
            if (positionInArray < list.size()) {
                keys.add(list.get(positionInArray));
            }
        }
        System.out.println("keys = " + keys);

        //sort

        MergeSort<T> mergeSort = new MergeSort<>();
        List<T> sortedKeys = mergeSort.sort(keys);
        System.out.println("sortedKeys = " + sortedKeys);


        return null;
    }
}
