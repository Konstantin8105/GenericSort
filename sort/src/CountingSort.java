import java.util.*;

public class CountingSort<T extends Comparable<T>> implements Sort<T> {
    @Override
    public List<T> sort(List<T> list) {
        if (list == null)
            throw new NullPointerException();
        if (list.size() == 0)
            throw new IndexOutOfBoundsException();

        Map<T, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            Integer amountT = map.get(list.get(i));
            if (amountT == null) {
                map.put(list.get(i), 1);
            } else {
                map.replace(list.get(i), amountT, amountT + 1);
            }
        }

        List<T> sortListT = new ArrayList<>(map.keySet());
        MergeSort<T> mergeSort = new MergeSort<>();
        sortListT = mergeSort.sort(sortListT);
        if(sortListT.size() == list.size())
            return sortListT;

        List<T> result = new ArrayList<>();
        for (int i = 0; i < sortListT.size(); i++) {
            Integer size = map.get(sortListT.get(i));
            if(size == null){
                throw new NullPointerException();
            }
            for (int j = 0; j < size; j++) {
                result.add(sortListT.get(i));
            }
        }
        return result;
    }
}
