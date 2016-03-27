import java.util.*;

public class CountingSort<T extends Comparable<T>> implements Sort<T> {
    @Override
    public List<T> sort(List<T> list) {
        if (list == null)
            throw new NullPointerException();
        if (list.size() == 0)
            throw new IndexOutOfBoundsException();

        Map<T, Integer> map = new HashMap<>();
        for (T item : list) {
            Integer amountT = map.get(item);
            if (amountT == null) {
                map.put(item, 1);
            } else {
                map.replace(item, amountT, amountT + 1);
            }
        }

        List<T> sortListT = new ArrayList<>(map.keySet());
        MergeSort<T> mergeSort = new MergeSort<>();
        sortListT = mergeSort.sort(sortListT);
        if(sortListT.size() == list.size())
            return sortListT;

        List<T> result = new ArrayList<>();
        for (T item : sortListT) {
            Integer size = map.get(item);
            if (size == null) {
                throw new NullPointerException();
            }
            for (int j = 0; j < size; j++) {
                result.add(item);
            }
        }
        return result;
    }
}
