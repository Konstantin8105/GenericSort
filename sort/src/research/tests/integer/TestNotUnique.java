package research.tests.integer;

import research.base.TestInteger;

public class TestNotUnique<T extends Integer> extends TestInteger<Integer> {

    public TestNotUnique() {
        array = getRandomList(false);
    }

    @Override
    public String getName() {
        return this.getClass().toString();
    }

}
