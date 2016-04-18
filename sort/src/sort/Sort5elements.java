package sort;

import java.util.ArrayList;
import java.util.List;

public class Sort5elements<T extends Comparable<T>> implements Sort<T> {

    @Override
    public List<T> sort(List<T> list) throws Exception {
        if (list.size() != 5)
            throw new Exception("Size != 5");
        return sort5elements(list);
    }

    private List<T> sort5elements(List<T> list) {

        List<T> temp = new ArrayList<>(list);

        if (list.get(0).compareTo(list.get(1)) > 0) {// step 1
            swap(temp, 0, 1);
        }
        if (list.get(2).compareTo(list.get(3)) > 0) {// step 2
            swap(temp, 2, 3);
        }
        // 0 < 1
        // 2 < 3
        // 4

        if (list.get(0).compareTo(list.get(2)) < 0) {// step 3
            // 0 < 2 < 3
            // 0 < 1
            // 4
        } else {
            // 2 < 0 < 1
            // 2 < 3
            // 4
            swap(temp, 0, 2);
            swap(temp, 1, 3);
        }

        // 0 < 2 < 3
        // 0 < 1
        // 4

        int[] result;
        if (list.get(2).compareTo(list.get(4)) < 0) {// step 4
            // 0 < 1
            // 0 < 2 < 3
            // 2 < 4
            if (list.get(3).compareTo(list.get(4)) < 0) {// step 5
                // 0 < 1
                // 0 < 2 < 3 < 4
                if (list.get(1).compareTo(list.get(3)) < 0) { // step 6
                    // 0 < 1 < 3
                    // 0 < 2 < 3 < 4
                    if (list.get(1).compareTo(list.get(2)) < 0) { // step 7
                        // 0 < 1 < 2 < 3 < 4
                        result = new int[]{0, 1, 2, 3, 4};
                    } else {
                        // 0 < 2 < 1 < 3 < 4
                        result = new int[]{0, 2, 1, 3, 4};
                    }
                } else {
                    // 0 < 1
                    // 0 < 2 < 3 < 4
                    // 3 < 1
                    if (list.get(1).compareTo(list.get(4)) < 0) {// step 7
                        // 0 < 2 < 3 < 1 < 4
                        result = new int[]{0, 2, 3, 1, 4};
                    } else {
                        // 0 < 2 < 3 < 4 < 1
                        result = new int[]{0, 2, 3, 4, 1};
                    }
                }
            } else {
                // 0 < 1
                // 0 < 2 < 4 < 3
                if (list.get(1).compareTo(list.get(4)) < 0) { // step 6
                    // 0 < 1 < 4
                    // 0 < 2 < 4 < 3
                    if (list.get(1).compareTo(list.get(2)) < 0) { // step 7
                        // 0 < 1 < 2 < 4 < 3
                        result = new int[]{0, 1, 2, 4, 3};
                    } else {
                        // 0 < 2 < 1 < 4 < 3
                        result = new int[]{0, 2, 1, 4, 3};
                    }
                } else {
                    // 0 < 1
                    // 0 < 2 < 4 < 3
                    // 4 < 1
                    if (list.get(1).compareTo(list.get(3)) < 0) { // step 7
                        // 0 < 2 < 4 < 1 < 3
                        result = new int[]{0, 2, 4, 1, 3};
                    } else {
                        // 0 < 2 < 4 < 3 < 1
                        result = new int[]{0, 2, 4, 3, 1};
                    }
                }
            }
        } else {
            // 0 < 2 < 3
            // 0 < 1
            // 4 < 2
            if (list.get(1).compareTo(list.get(2)) < 0) {// step 5
                // 0 < 1 < 2 < 3
                // 4 < 2
                if (list.get(1).compareTo(list.get(4)) < 0) { // step 6
                    // 0 < 1 < 4 < 2 < 3
                    result = new int[]{0, 1, 4, 2, 3};
                } else {
                    // 0 < 1 < 2 < 3
                    // 4 < 1 < 2
                    if (list.get(0).compareTo(list.get(4)) < 0) {// step 7
                        // 0 < 4 < 1 < 2 < 3
                        result = new int[]{0, 4, 1, 2, 3};
                    } else {
                        // 4 < 0 < 1 < 2 < 3
                        result = new int[]{4, 0, 1, 2, 3};
                    }
                }
            } else {
                // 0 < 2 < 3
                // 0 < 1
                // 4 < 2 < 1
                if (list.get(1).compareTo(list.get(3)) < 0) {// step 6
                    // 0 < 2 < 1 < 3
                    // 0 < 1
                    // 4 < 2 < 1 < 3
                    if (list.get(0).compareTo(list.get(4)) < 0) { // step 7
                        // 0 < 4 < 2 < 1 < 3
                        result = new int[]{0, 4, 2, 1, 3};
                    } else {
                        // 4 < 0 < 2 < 1 < 3
                        result = new int[]{4, 0, 2, 1, 3};
                    }
                } else {
                    // 0 < 2 < 3 < 1
                    // 0 < 1
                    // 4 < 2 < 1
                    if (list.get(0).compareTo(list.get(4)) < 0) { // step 7
                        // 0 < 4 < 2 < 3 < 1
                        result = new int[]{0, 4, 2, 3, 1};
                    } else {
                        //  4 < 0 < 2 < 3 < 1
                        result = new int[]{4, 0, 2, 3, 1};
                    }
                }
            }
        }
        List<T> output = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            output.add(temp.get(result[i]));
        }
        return output;
    }

    private void swap(List<T> list, int i, int i1) {
        T temp = list.get(i);
        list.set(i, list.get(i1));
        list.set(i1, temp);
    }
}
