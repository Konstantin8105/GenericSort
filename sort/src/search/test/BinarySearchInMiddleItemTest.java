import search.BinarySearch;
import search.BinarySearchInMiddleItem;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class BinarySearchInMiddleItemTest {

    private List<Integer> list = Arrays.asList(0,2,4,6,8,10,12);


    @org.junit.Before
    public void testInputData() throws Exception {
        MergeSort<Integer> mergeSort = new MergeSort<>();
        assertEquals(mergeSort.sort(list), list);
    }

    @org.junit.Test
    public void testGoodData() throws Exception {
        BinarySearchInMiddleItem<Integer> binarySearch = new BinarySearchInMiddleItem<>();
        assertEquals(1,binarySearch.search((Integer[]) list.toArray(),2));
    }

    @org.junit.Test
    public void testBadData() throws Exception {
        BinarySearchInMiddleItem<Integer> binarySearch = new BinarySearchInMiddleItem<>();
        assertNotEquals(1,binarySearch.search((Integer[]) list.toArray(),4));
    }

    @org.junit.Test
    public void testInside1() throws Exception {
        BinarySearchInMiddleItem<Integer> binarySearch = new BinarySearchInMiddleItem<>();
        assertEquals(2,binarySearch.search((Integer[]) list.toArray(),5));
    }

    @org.junit.Test
    public void testInside2() throws Exception {
        BinarySearchInMiddleItem<Integer> binarySearch = new BinarySearchInMiddleItem<>();
        assertEquals(5,binarySearch.search((Integer[]) list.toArray(),11));
    }

    @org.junit.Test
    public void testInside3() throws Exception {
        BinarySearchInMiddleItem<Integer> binarySearch = new BinarySearchInMiddleItem<>();
        assertEquals(0,binarySearch.search((Integer[]) list.toArray(),1));
    }

    @org.junit.Test(expected = IndexOutOfBoundsException.class)
    public void testExceptionMinimal() throws Exception {
        BinarySearchInMiddleItem<Integer> binarySearch = new BinarySearchInMiddleItem<>();
        binarySearch.search((Integer[]) list.toArray(), -1);
    }

    @org.junit.Test(expected = IndexOutOfBoundsException.class)
    public void testExceptionMaximal() throws Exception {
        BinarySearchInMiddleItem<Integer> binarySearch = new BinarySearchInMiddleItem<>();
        binarySearch.search((Integer[]) list.toArray(), 50);
    }
}
