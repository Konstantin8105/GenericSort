package research.tests.integer;

import research.base.TestIntegerSortWithNewElements;

public class TestPreSortWith5Unique<T extends Integer> extends TestIntegerSortWithNewElements<Integer> {

    public TestPreSortWith5Unique() {
        array = getSortArray(5);
    }

    @Override
    public String getName() {
        return this.getClass().toString();
    }

}