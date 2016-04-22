package sort;

import java.util.ArrayList;
import java.util.List;

public class MergeSortIndex2<T extends Comparable<T>> implements Sort<T> {

    private List<T> list;

    @Override
    public List<T> sort(List<T> list) {
        if (list == null)
            throw new NullPointerException();
        if (list.size() == 0)
            throw new IndexOutOfBoundsException();
        if (list.size() == 1)
            return new ArrayList<>(list);

        List<Integer> indexes = new ArrayList<>(list.size());
        for (int i = 0; i < list.size(); i++) {
            indexes.add(i);
        }

        this.list = list;

        List<Integer> parts = partitions(indexes);

        mergeParts(indexes, parts);

        List<T> result = new ArrayList<>(list);
        for (int i = 0; i < indexes.size(); i++) {
            result.set(i, list.get(indexes.get(i)));
        }

        return result;
    }

    private List<Integer> partitions(List<Integer> indexes) {
        boolean isNextBigger = false;
        int startPoint = 0;
        int finishPoint;
        List<Integer> partitionLength = new ArrayList<>();
        int i = 0;
        for (; i < indexes.size() - 1; i++) {
            if (startPoint == i) {
                isNextBigger = isNextBigger(indexes, i, i + 1);
            } else {
                if (isNextBigger != isNextBigger(indexes, i, i + 1)) {
                    finishPoint = i;
                    if (!isNextBigger) reverse(indexes, startPoint, finishPoint);
                    partitionLength.add(finishPoint - startPoint + 1);
                    startPoint = i + 1;
                }
            }
        }
        finishPoint = i;
        if (!isNextBigger) reverse(indexes, startPoint, finishPoint);
        partitionLength.add(finishPoint - startPoint + 1);

        return partitionLength;
    }

    private void reverse(List<Integer> indexes, int from, int to) {
        int length = to - from + 1;
        int amount = length / 2;
        for (int i = 0; i < amount; i++) {
            swap(indexes, from + i, to - i);
        }
    }

    private void swap(List<Integer> indexes, int i, int j) {
        indexes.set(i, indexes.set(j, indexes.get(i)));
    }

    boolean isNextBigger(List<Integer> indexes, int present, int next) {
        return isNextBigger(indexes.get(present), indexes.get(next));
    }

    boolean isNextBigger(int present, int next) {
        if (list.get(present).compareTo(list.get(next)) <= 0) {
            return true;
        }
        return false;
    }

    private void mergeParts(List<Integer> indexes, List<Integer> parts) {
        while (!isSinglePart(parts)) {
            int positionLeft = 0;
            for (int i = 0; i < parts.size(); i++) {
                if (parts.get(i) > 0) {
                    for (int j = i + 1; j < parts.size(); j++) {
                        if (parts.get(j) > 0) {
                            int sizeLeft = parts.get(i);
                            int sizeRight = parts.get(j);
                            merge(indexes, positionLeft, sizeLeft, sizeRight);
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

    private void merge(List<Integer> indexes, int initPositionInArray, int sizeLeft, int sizeRight) {

        int[] flow1 = new int[sizeLeft];
        for (int i = 0; i < flow1.length; i++) {
            flow1[i] = indexes.get(initPositionInArray + i);
        }
        int[] flow2 = new int[sizeRight];
        for (int i = 0; i < flow2.length; i++) {
            flow2[i] = indexes.get(initPositionInArray + sizeLeft + i);
        }
        int[] result = new int[sizeLeft + sizeRight];

        int positionFlow1 = 0;
        int positionFlow2 = 0;
        int position = 0;

        if (isNextBigger(indexes, initPositionInArray + sizeLeft - 1, initPositionInArray + sizeLeft)) {
            return;
        } else if (isNextBigger(indexes, initPositionInArray + sizeLeft, initPositionInArray)) {
            for (int i = 0; i < flow2.length; i++) {
                result[i] = flow2[i];
            }
            for (int i = 0; i < flow1.length; i++) {
                result[i + flow2.length] = flow1[i];
            }
            for (int i = 0; i < result.length; i++) {
                indexes.set(initPositionInArray + i, result[i]);
            }
            return;
        }

        while (true) {
            if (positionFlow1 == flow1.length && positionFlow2 == flow2.length) {
                break;
            } else if (positionFlow1 == flow1.length) {
                System.arraycopy(flow2, positionFlow2, result, position, flow2.length - positionFlow2);
                break;
            } else if (positionFlow2 == flow2.length) {
                System.arraycopy(flow1, positionFlow1, result, position, flow1.length - positionFlow1);
                break;
            } else if (isNextBigger(flow1[positionFlow1], flow2[positionFlow2])) {
                result[position] = flow1[positionFlow1++];
            } else {
                result[position] = flow2[positionFlow2++];
            }
            position++;
        }

        for (int i = 0; i < result.length; i++) {
            indexes.set(initPositionInArray + i, result[i]);
        }
    }
}
