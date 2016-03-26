import search.BinarySearchInMiddleItem;

import java.util.ArrayList;
import java.util.List;

public class BinarySort<T extends Comparable<T>> implements Sort<T> {
    @Override
    public List<T> sort(List<T> list) {
        if (list == null)
            throw new NullPointerException();
        if (list.size() == 0)
            throw new IndexOutOfBoundsException();
        if (list.size() == 1)
            return new ArrayList<>(list);

        List<T> output = new ArrayList<>();
        output.add(list.get(0));

        // TODO: 3/26/16 try to use one array - without realoocate array
        BinarySearchInMiddleItem<T> binary = new BinarySearchInMiddleItem<>();
        for (int i = 1; i < list.size(); i++) {
            T element = list.get(i);
            int position = binary.search(list, element);
            if (position == -1) {
                output.add(0, element);
            } else if (position == list.size() || position > output.size() - 1) {
                output.add(element);
            } else {
                output.add(position, element);
            }
        }
        return output;
    }
}
