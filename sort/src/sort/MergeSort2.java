package sort;

import java.util.*;

public class MergeSort2<T extends Comparable<T>> implements Sort<T> {

    @Override
    public List<T> sort(List<T> list) {
        if (list == null)
            throw new NullPointerException();
        if (list.size() == 0)
            throw new IndexOutOfBoundsException();
        if (list.size() == 1)
            return new ArrayList<>(list);

        List<List<T>> parts = new ArrayList<>();

        ArrayList<T> part = new ArrayList<>();
        boolean isNextBigger = false;
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                part.add(list.get(i));
                parts.add(part);
                break;
            }
            if (part.size() == 0) {
                part.add(list.get(i));
                isNextBigger = isNextBigger(list.get(i), list.get(i + 1));
            } else {
                part.add(list.get(i));
                if (isNextBigger != isNextBigger(list.get(i), list.get(i + 1))) {
                    if (!isNextBigger) Collections.reverse(part);
                    parts.add(part);
                    part = new ArrayList<>();
                }
            }
        }

        return mergeParts(parts);
    }

    private List<T> mergeParts(List<List<T>> parts) {

//        Set<List<T>> set = new HashSet<>(parts);
//
//        if(parts.size() > 1) {
//            while (set.size() !=1 ) {
//                Iterator<List<T>> iterator = set.iterator();
//                List<T> last = new ArrayList<>(iterator.next());
//                iterator.remove();
//                List<T> add = merge(last, iterator.next());
//                iterator.remove();
//                set.add(add);
//            }
//        }
//        Iterator<List<T>> iterator = set.iterator();
//        return iterator.next();


        while (parts.size() != 1) {
            parts.add(merge(parts.get(1), parts.get(0)));
            parts.remove(1);
            parts.remove(0);
        }
        return parts.get(0);
    }

    private List<T> merge(List<T> flow1, List<T> flow2) {
        List<T> output = new ArrayList<>(flow1.size()+flow2.size());

        int positionFlow1 = 0;
        int positionFlow2 = 0;

        while (true) {
            if (positionFlow1 == flow1.size() && positionFlow2 == flow2.size()) {
                break;
            } else if (positionFlow1 == flow1.size()) {
                output.addAll(flow2.subList(positionFlow2, flow2.size()));
                break;
            } else if (positionFlow2 == flow2.size()) {
                output.addAll(flow1.subList(positionFlow1, flow1.size()));
                break;
            } else if (flow1.get(positionFlow1).compareTo(flow2.get(positionFlow2)) > 0) {
                output.add(flow2.get(positionFlow2));
                positionFlow2++;
            } else {
                output.add(flow1.get(positionFlow1));
                positionFlow1++;
            }
        }

        return output;
    }

    boolean isNextBigger(T present, T next) {
        if (present.compareTo(next) <= 0)
            return true;
        return false;
    }
}
