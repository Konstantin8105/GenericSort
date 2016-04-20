package research.tests.string;

import research.base.TestString;

public class TestStringUnique<T extends String> extends TestString<String> {

    public TestStringUnique() {
        array = getRandomList(true);
    }

    @Override
    public String getName() {
        return this.getClass().toString();
    }

}