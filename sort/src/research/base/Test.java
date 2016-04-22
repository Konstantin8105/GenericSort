package research.base;

import java.util.ArrayList;
import java.util.Random;

public abstract class Test<T extends Comparable<T>> {

    protected final static Random random = new Random();

    protected static int amountArray = 20_000;

    public abstract String getName();

    protected ArrayList<T> array;

    public ArrayList<T> getArray() {
        return array;
    }
}
