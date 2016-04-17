package research.tests.integer;

import research.base.TestInteger;

public class TestUnique<T extends Integer> extends TestInteger<Integer> {

    public TestUnique() {
        array = getRandomList(false);
    }

    @Override
    public String getName() {
        return this.getClass().toString();
    }

}