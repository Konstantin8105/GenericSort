package research.tests.integer;

import research.base.TestIntegerSortWithNewElements;

public class TestPreSortWith2Unique<T extends Integer> extends TestIntegerSortWithNewElements<Integer> {

    public TestPreSortWith2Unique() {
        array = getSortArray(2);
    }

    @Override
    public String getName() {
        return this.getClass().toString();
    }

}