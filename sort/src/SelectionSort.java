import java.util.ArrayList;
import java.util.List;

public class SelectionSort<T extends Comparable<T>> implements Sort<T> {
    @Override
    public List<T> sort(List<T> list) {
        if (list == null)
            throw new NullPointerException();
        if (list.size() == 0)
            throw new IndexOutOfBoundsException();

        List<T> input = new ArrayList<>(list);
        List<T> result = new ArrayList<>();

        for (int j = 0; j < input.size(); j++) {
            T min = input.get(0);
            int positionMin = 0;
            for (int i = 0; i < input.size(); i++) {
                if (min.compareTo(input.get(i)) > 0) {
                    min = input.get(i);
                    positionMin = i;
                }
            }
            result.add(min);
            input.remove(positionMin);
            j--;
        }

        return result;
    }
}
