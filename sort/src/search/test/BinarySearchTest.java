package search.test;

import search.BinarySearch;
import sort.MergeSort;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class BinarySearchTest {

    private final List<Integer> list = Arrays.asList(0, 2, 4, 6, 8, 10, 12);


    @org.junit.Before
    public void testInputData() throws Exception {
        MergeSort<Integer> mergeSort = new MergeSort<>();
        assertEquals(mergeSort.sort(list), list);
    }

    @org.junit.Test
    public void testGoodData() throws Exception {
        BinarySearch<Integer> binarySearch = new BinarySearch<>();
        assertEquals(1, binarySearch.search((Integer[]) list.toArray(), 2));
    }

    @org.junit.Test
    public void testBadData() throws Exception {
        BinarySearch<Integer> binarySearch = new BinarySearch<>();
        assertNotEquals(1, binarySearch.search((Integer[]) list.toArray(), 4));
    }

    @org.junit.Test(expected = IndexOutOfBoundsException.class)
    public void testException() throws Exception {
        BinarySearch<Integer> binarySearch = new BinarySearch<>();
        binarySearch.search((Integer[]) list.toArray(), 5);
    }

    @org.junit.Test(expected = IndexOutOfBoundsException.class)
    public void testExceptionMinimal() throws Exception {
        BinarySearch<Integer> binarySearch = new BinarySearch<>();
        binarySearch.search((Integer[]) list.toArray(), -1);
    }

    @org.junit.Test(expected = IndexOutOfBoundsException.class)
    public void testExceptionMaximal() throws Exception {
        BinarySearch<Integer> binarySearch = new BinarySearch<>();
        binarySearch.search((Integer[]) list.toArray(), 50);
    }
}
