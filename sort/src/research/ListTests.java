package research;

import research.base.Test;
import research.tests.integer.*;
import research.tests.string.TestStringNotUnique;
import research.tests.string.TestStringSameElement;
import research.tests.string.TestStringUnique;

public class ListTests {
    public static Test<?> tests[] = {
            new TestNotUnique<>(),
            new TestUnique<>(),
            new TestInvert<>(),
            new TestSortedList<>(),
            new TestPreSort<>(),
            new TestSameElements<>(),
            new TestPreSortWith2Unique<>(),
            new TestPreSortWith5Unique<>(),
            new TestStringSameElement<>(),
            new TestStringUnique<>(),
            new TestStringNotUnique<>()
    };

    public static void main(String[] args) {
        for (Test<?> test : tests) {
            System.out.println(test.getName());
        }
    }
}
