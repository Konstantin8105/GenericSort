package search;

public class BinarySearchInMiddleItem<T extends Comparable<T>> {

    public int search(T[] list, T find) {
        if (list == null)
            throw new NullPointerException();
        if (list.length == 0)
            throw new IndexOutOfBoundsException();
        if (list.length < 2)
            return 0;

        if (find.compareTo(list[0]) < 0){
            return -1;
        }
        if (find.compareTo(list[list.length-1]) > 0) {
            return list.length;
        }

        int low = 0;
        int middle;
        int high = list.length - 1;

        while (low < high) {
            middle = (high + low) >>> 1;

            if (list[low].compareTo(find) == 0)
                return low;
            if (list[middle].compareTo(find) == 0)
                return middle;
            if (list[high].compareTo(find) == 0)
                return high;

            if (find.compareTo(list[low]) < 0 || find.compareTo(list[high]) > 0) {
                throw new IndexOutOfBoundsException();
            }

            if (high - low == 1) {
                return low;
            }

            if (find.compareTo(list[middle]) > 0) {
                low = middle;
            } else {
                high = middle;
            }
        }
        throw new IndexOutOfBoundsException();
    }
}
