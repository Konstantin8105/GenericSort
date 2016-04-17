package research.tests;

import research.base.TestInteger;

public class TestNotUnique<T extends Integer> extends TestInteger<Integer> {

    public TestNotUnique() {
        array = getRandomList(true);
    }

    @Override
    public String getName() {
        return this.getClass().toString();
    }

}
