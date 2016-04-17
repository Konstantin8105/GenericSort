package research;

import research.base.Test;
import sort.*;

public class ListSort {
    public static Sort sorts[] = {
            new MergeSortIndex(),
            new MergeSort(),
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
