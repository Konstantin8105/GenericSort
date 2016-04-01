package sort;

import java.util.List;

public class SquareSort<T extends Comparable<T>> implements Sort<T> {
    @Override
    public List<T> sort(List<T> list) {
        if (list == null)
            throw new NullPointerException();
        if (list.size() == 0)
            throw new IndexOutOfBoundsException();

        int amountKeys = (int) Math.sqrt(list.size());

        System.out.println("amountKeys = " + amountKeys);


        return null;
    }
}
