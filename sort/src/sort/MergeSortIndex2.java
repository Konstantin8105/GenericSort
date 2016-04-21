package sort;

import java.util.ArrayList;
import java.util.List;

public class MergeSortIndex2<T extends Comparable<T>> implements Sort<T> {

    private final int INSERTION_SORT_BORDER = 8;

    @Override
    public List<T> sort(List<T> list) {
        if (list == null)
            throw new NullPointerException();
        if (list.size() == 0)
            throw new IndexOutOfBoundsException();
        if (list.size() == 1)
            return new ArrayList<>(list);

        List<T> output = new ArrayList<>(list);

        List<Integer> parts = partitions(output);

        mergeParts(output, parts);

        return output;
    }

    private List<Integer> partitions(List<T> list) {
        boolean isNextBigger = false;
        int startPoint = 0;
        int finishPoint = 0;
        List<Integer> partitionLength = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                finishPoint = i;
                if (!isNextBigger) reverse(list, startPoint, finishPoint);
                partitionLength.add(finishPoint - startPoint + 1);
                break;
            }
            if (startPoint == i) {
                isNextBigger = isNextBigger(list.get(i), list.get(i + 1));
            } else {
                if (isNextBigger != isNextBigger(list.get(i), list.get(i + 1))) {
                    finishPoint = i;
                    if (!isNextBigger) reverse(list, startPoint, finishPoint);
                    partitionLength.add(finishPoint - startPoint + 1);
                    startPoint = i + 1;
                }
            }
        }

        return partitionLength;
    }

    private void reverse(List<T> list, int from, int to) {
        int length = to - from + 1;
        int amount = length / 2;
        for (int i = 0; i < amount; i++) {
            swap(list, from + i, to - i);
        }
    }

    private void swap(List<T> list, int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    boolean isNextBigger(T present, T next) {
        if (present.compareTo(next) < 0)
            return true;
        return false;
    }


    private void mergeParts(List<T> list, List<Integer> parts) {
        while (!isSinglePart(parts)) {
            int positionLeft = 0;
            for (int i = 0; i < parts.size(); i++) {
                if (parts.get(i) > 0) {
                    for (int j = i + 1; j < parts.size(); j++) {
                        if (parts.get(j) > 0) {
                            int sizeLeft = parts.get(i);
                            int sizeRight = parts.get(j);
                            merge(list, positionLeft, sizeLeft, sizeRight);
                            parts.set(i, sizeLeft + sizeRight);
                            parts.set(j, 0);
                            j = parts.size();
                        }
                    }
                }
                positionLeft += parts.get(i);
            }
        }
    }


    private boolean isSinglePart(List<Integer> parts) {
        int amount = 0;
        for (Integer size : parts) {
            if (size > 0) {
                amount++;
            }
            if (amount > 1) {
                return false;
            }
        }
        return true;
    }


    private void merge(List<T> list, int initPositionInArray, int sizeLeft, int sizeRight) {

        int[] flow1 = new int[sizeLeft];
        for (int i = 0; i < flow1.length; i++) {
            flow1[i] = initPositionInArray + i;
        }
        int[] flow2 = new int[sizeRight];
        for (int i = 0; i < flow2.length; i++) {
            flow2[i] = initPositionInArray + sizeLeft + i;
        }
        int[] result = new int[sizeLeft + sizeRight];

        int positionFlow1 = 0;
        int positionFlow2 = 0;
        int position = 0;

        while (true) {
            if (positionFlow1 == flow1.length && positionFlow2 == flow2.length) {
                break;
            } else if (positionFlow1 == flow1.length) {
                System.arraycopy(flow2, positionFlow2, result, position, flow2.length - positionFlow2);
                break;
            } else if (positionFlow2 == flow2.length) {
                System.arraycopy(flow1, positionFlow1, result, position, flow1.length - positionFlow1);
                positionFlow1 = flow1.length;
            } else if (list.get(flow1[positionFlow1]).compareTo(list.get(flow2[positionFlow2])) > 0) {
                result[position] = flow2[positionFlow2++];
            } else {
                result[position] = flow1[positionFlow1++];
            }
            position++;
        }

        List<T> temp = new ArrayList<>(result.length);
        for (int i = 0; i < result.length; i++) {
            temp.add(list.get(initPositionInArray + i));
        }

        for (int i = 0; i < temp.size(); i++) {
            list.set(i + initPositionInArray, temp.get(result[i] - initPositionInArray));
        }
    }
}
