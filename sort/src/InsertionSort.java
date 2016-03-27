import java.util.ArrayList;
import java.util.List;

public class InsertionSort<T extends Comparable<T>> implements Sort<T>  {
    @Override
    public List<T> sort(List<T> list) {
        if (list == null)
            throw new NullPointerException();
        if (list.size() == 0)
            throw new IndexOutOfBoundsException();
        if (list.size() == 1)
            return new ArrayList<>(list);
        List<T> output = new ArrayList<>(list);

        return output;
    }
}
