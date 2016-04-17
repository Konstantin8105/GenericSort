package research;

import static org.junit.Assert.assertArrayEquals;

public class Sort5elements {
    public static int[] sort(int a1, int a2, int a3, int a4, int a5) {


        return null;
    }

    @org.junit.Test
    public void test1() throws Exception {
        int[] result = {0, 1, 2, 3, 4};
        assertArrayEquals(new int[]{0, 1, 2, 3, 4}, result);
    }

    @org.junit.Test
    public void test2() throws Exception {
        int[] result = {0, 1, 2, 3, 4};
        assertArrayEquals(new int[]{2, 1, 0, 3, 4}, result);
    }

    @org.junit.Test
    public void test3() throws Exception {
        int[] result = {0, 1, 2, 3, 4};
        assertArrayEquals(new int[]{1, 4, 2, 3, 0}, result);
    }

    @org.junit.Test
    public void test4() throws Exception {
        int[] result = {0, 1, 2, 3, 4};
        assertArrayEquals(new int[]{3, 1, 2, 0, 4}, result);
    }

    @org.junit.Test
    public void test5() throws Exception {
        int[] result = {0, 1, 2, 3, 4};
        assertArrayEquals(new int[]{2, 4, 0, 3, 1}, result);
    }

}
