package research;

import sort.*;

public class ListSort {
    public static Sort sorts[] = {
            new MergeSortIndex(),
            new MergeSortIndex2(),
            new MergeSort(),
            new MergeSort2(),
            new MergeSort5Segment(),
            new CountingSort(),
            new SquareSort<>(),
            new SelectionSort(),
            new BinarySort(),
            new InsertionSort()
    };

    public static void main(String[] args) {
        for (Sort sort : sorts) {
            System.out.println(sort.getClass().toString());
        }
    }
}
