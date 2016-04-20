package research.tests.string;

import research.base.TestString;

public class TestStringNotUnique<T extends String> extends TestString<String> {

    public TestStringNotUnique() {
        array = getRandomList(false);
    }

    @Override
    public String getName() {
        return this.getClass().toString();
    }

}