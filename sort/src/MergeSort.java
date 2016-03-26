import java.util.ArrayList;
import java.util.List;

public class MergeSort<T extends Comparable<T>> implements Sort<T> {

    @Override
    public List<T> sort(List<T> list) {
        if (list == null)
            throw new NullPointerException();
        if (list.size() == 0)
            throw new IndexOutOfBoundsException();
        if (list.size() == 1)
            return new ArrayList<>(list);

        mergeSort(list, 0, list.size() - 1);
        return list;
    }

    private void mergeSort(List<T> list, int start, int end) {
        if (end - start < 0)
            throw new NullPointerException();
        if (end - start == 0) {
            return;
        }
        if (end - start == 1) {;
            if (list.get(start).compareTo(list.get(end)) > 0) {
                swap(list, start, end);
            }
            return;
        }

        int middle = (end + start) >>> 1;

        if (end - start > 1) {
            mergeSort(list, start, middle);
            mergeSort(list, middle + 1, end);
        }

        List<T> flow1 = new ArrayList<>(list.subList(start, middle + 1));
        List<T> flow2 = new ArrayList<>(list.subList(middle + 1, end + 1));

        if (flow1.size() + flow2.size() != end - start + 1)
            throw new NullPointerException();

        int positionFlow1 = 0;
        int positionFlow2 = 0;

        int position = start;

        while (true) {
            if (positionFlow1 == flow1.size() && positionFlow2 == flow2.size()) {
                break;
            } else if (positionFlow1 == flow1.size()) {
                list.set(position, flow2.get(positionFlow2++));
            } else if (positionFlow2 == flow2.size()) {
                list.set(position, flow1.get(positionFlow1++));
            } else if (flow1.get(positionFlow1).compareTo(flow2.get(positionFlow2)) > 0) {
                list.set(position, flow2.get(positionFlow2++));
            } else {
                list.set(position, flow1.get(positionFlow1++));
            }
            position++;
        }
    }

    private void swap(List<T> list, int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
