package search;

import java.util.List;

public class BinarySearchInMiddleItem<T extends Comparable<T>> {

    public int search(List<T> list, T find) {
        if (list == null)
            throw new NullPointerException();
        if (list.size() == 0)
            throw new IndexOutOfBoundsException();

        if (find.compareTo(list.get(0)) < 0){
            return -1;
        }
        if (find.compareTo(list.get(list.size()-1)) > 0) {
            return list.size();
        }

        int low = 0;
        int middle;
        int high = list.size() - 1;

        while (low < high) {
            middle = (high + low) >>> 1;

            if (list.get(low).compareTo(find) == 0)
                return low;
            if (list.get(middle).compareTo(find) == 0)
                return middle;
            if (list.get(high).compareTo(find) == 0)
                return high;

            if (find.compareTo(list.get(low)) < 0 || find.compareTo(list.get(high)) > 0) {
                throw new IndexOutOfBoundsException();
            }

            if (high - low == 1) {
                return low;
            }

            if (find.compareTo(list.get(middle)) > 0) {
                low = middle;
            } else {
                high = middle;
            }
        }
        throw new IndexOutOfBoundsException();
    }
}
