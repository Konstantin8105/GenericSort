package research.tests.integer;

import research.base.TestIntegerSortWithNewElements;

public class TestSortedList<T extends Integer> extends TestIntegerSortWithNewElements<Integer> {

    public TestSortedList() {
        array = getSortArray(0);
    }

    @Override
    public String getName() {
        return this.getClass().toString();
    }

}