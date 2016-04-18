package research;

import sort.Sort;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class Sort5elements<T extends Comparable<T>> implements Sort<T> {

    @Override
    public List<T> sort(List<T> list) throws Exception {
        if(list.size() != 5)
            throw new Exception("Size != 5");
        return sort5elements(list);
    }

    private List<T> sort5elements(List<T> list) {
        if (index[0] > index[1]) {// step 1
            swap(index, 0, 1);
        }
        if (index[2] > index[3]) {// step 2
            swap(index, 2, 3);
        }
        // 0 < 1
        // 2 < 3
        // 4

        if (index[0] < index[2]) {// step 3
            // 0 < 2 < 3
            // 0 < 1
            // 4
        } else {
            // 2 < 0 < 1
            // 2 < 3
            // 4
            swap(index, 0, 2);
            swap(index, 1, 3);
        }

        // 0 < 2 < 3
        // 0 < 1
        // 4

        if (index[2] < index[4]) {// step 4
            // 0 < 1
            // 0 < 2 < 3
            // 2 < 4
            if (index[3] < index[4]) {// step 5
                // 0 < 1
                // 0 < 2 < 3 < 4
                if (index[1] < index[3]) { // step 6
                    // 0 < 1 < 3
                    // 0 < 2 < 3 < 4
                    if (index[1] < index[2]) { // step 7
                        // 0 < 1 < 2 < 3 < 4
                        return new int[]{index[0], index[1], index[2], index[3], index[4]};
                    } else {
                        // 0 < 2 < 1 < 3 < 4
                        return new int[]{index[0], index[2], index[1], index[3], index[4]};
                    }
                } else {
                    // 0 < 1
                    // 0 < 2 < 3 < 4
                    // 3 < 1
                    if (index[1] < index[4]) {// step 7
                        // 0 < 2 < 3 < 1 < 4
                        return new int[]{index[0], index[2], index[3], index[1], index[4]};
                    } else {
                        // 0 < 2 < 3 < 4 < 1
                        return new int[]{index[0], index[2], index[3], index[4], index[1]};
                    }
                }
            } else {
                // 0 < 1
                // 0 < 2 < 4 < 3
                if (index[1] < index[4]) { // step 6
                    // 0 < 1 < 4
                    // 0 < 2 < 4 < 3
                    if (index[1] < index[2]) { // step 7
                        // 0 < 1 < 2 < 4 < 3
                        return new int[]{index[0], index[1], index[2], index[4], index[3]};
                    } else {
                        // 0 < 2 < 1 < 4 < 3
                        return new int[]{index[0], index[2], index[1], index[4], index[3]};
                    }
                } else {
                    // 0 < 1
                    // 0 < 2 < 4 < 3
                    // 4 < 1
                    if (index[1] < index[3]) { // step 7
                        // 0 < 2 < 4 < 1 < 3
                        return new int[]{index[0], index[2], index[4], index[1], index[3]};
                    } else {
                        // 0 < 2 < 4 < 3 < 1
                        return new int[]{index[0], index[2], index[4], index[3], index[1]};
                    }
                }
            }
        } else {
            // 0 < 2 < 3
            // 0 < 1
            // 4 < 2
            if (index[1] < index[2]) {// step 5
                // 0 < 1 < 2 < 3
                // 4 < 2
                if (index[1] < index[4]) { // step 6
                    // 0 < 1 < 4 < 2 < 3
                    return new int[]{index[0], index[1], index[4], index[2], index[3]};
                } else {
                    // 0 < 1 < 2 < 3
                    // 4 < 1 < 2
                    if (index[0] < index[4]) {// step 7
                        // 0 < 4 < 1 < 2 < 3
                        return new int[]{index[0], index[4], index[1], index[2], index[3]};
                    } else {
                        // 4 < 0 < 1 < 2 < 3
                        return new int[]{index[4], index[0], index[1], index[2], index[3]};
                    }
                }
            } else {
                // 0 < 2 < 3
                // 0 < 1
                // 4 < 2 < 1
                if (index[1] < index[3]) {// step 6
                    // 0 < 2 < 1 < 3
                    // 0 < 1
                    // 4 < 2 < 1 < 3
                    if (index[0] < index[4]) { // step 7
                        // 0 < 4 < 2 < 1 < 3
                        return new int[]{index[0], index[4], index[2], index[1], index[3]};
                    } else {
                        // 4 < 0 < 2 < 1 < 3
                        return new int[]{index[4], index[0], index[2], index[1], index[3]};
                    }
                } else {
                    // 0 < 2 < 3 < 1
                    // 0 < 1
                    // 4 < 2 < 1
                    if (index[0] < index[4]) { // step 7
                        // 0 < 4 < 2 < 3 < 1
                        return new int[]{index[0], index[4], index[2], index[3], index[1]};
                    } else {
                        //  4 < 0 < 2 < 3 < 1
                        return new int[]{index[4], index[0], index[2], index[3], index[1]};
                    }
                }
            }
        }
    }


    @org.junit.Test
    public void test1() throws Exception {
        int[] result = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 3, 4};
        assertArrayEquals(sort(index), result);
    }

    @org.junit.Test
    public void test2() throws Exception {
        int[] result = {0, 1, 2, 3, 4};
        int[] index = {2, 1, 0, 3, 4};
        assertArrayEquals(sort(index), result);
    }

    @org.junit.Test
    public void test3() throws Exception {
        int[] result = {0, 1, 2, 3, 4};
        int[] index = {1, 4, 2, 3, 0};
        assertArrayEquals(sort(index), result);
    }

    @org.junit.Test
    public void test4() throws Exception {
        int[] result = {0, 1, 2, 3, 4};
        int[] index = {3, 1, 2, 0, 4};
        assertArrayEquals(sort(index), result);
    }

    @org.junit.Test
    public void test5() throws Exception {
        int[] result = {0, 1, 2, 3, 4};
        int[] index = {2, 4, 0, 3, 1};
        assertArrayEquals(sort(index), result);
    }

    @org.junit.Test
    public void test6() throws Exception {
        int[] result = {0, 1, 2, 3, 4};
        int[] index = {0, 4, 2, 3, 1};
        assertArrayEquals(sort(index), result);
    }

    @org.junit.Test
    public void test7() throws Exception {
        int[] result = {1, 2, 3, 4, 5};

        int amountAllowable = 120;
        int presentAllowable = 0;

        for (int i = 12345; i < 54322; i++) {
            int number = i;
            int a1 = number / 10000;
            number = number - a1 * 10000;
            int a2 = number / 1000;
            number = number - a2 * 1000;
            int a3 = number / 100;
            number = number - a3 * 100;
            int a4 = number / 10;
            number = number - a4 * 10;
            int a5 = number;
            int[] index = {a1, a2, a3, a4, a5};
            if (compare(result, sort(index))) {
                presentAllowable++;
                System.out.print("a[] = " + a1 + "," + a2 + "," + a3 + "," + a4 + "," + a5);
                System.out.print(" - good\t");
                for (int j = 0; j < 5; j++) {
                    System.out.print(result[j]);
                }
                System.out.println();
            } else {
                //System.out.println("bad");
            }
        }

        System.out.println("Result: " + presentAllowable + " items of " + amountAllowable + " items");
    }

    private boolean compare(int[] result, int[] sort) {
        if (sort == null || sort.length == 0)
            return false;
        for (int i = 0; i < 5; i++) {
            if (result[i] != sort[i])
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
        int in[] = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < in.length; i++) {
            System.out.print(in[i]);
        }
        System.out.println();
        swap(in, 0, 2);
        for (int i = 0; i < in.length; i++) {
            System.out.print(in[i]);
        }
    }

    private static void swap(int[] ints, int i, int i1) {
        int temp = ints[i];
        ints[i] = ints[i1];
        ints[i1] = temp;
    }

}
