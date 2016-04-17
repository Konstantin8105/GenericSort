package research;

import research.base.Test;
import research.tests.integer.*;
import research.tests.string.TestStringNotUnique;
import research.tests.string.TestStringUnique;

public class ListTests {
    public static Test<?> tests[] = {
            new TestSameElements<>(),
            new TestNotUnique<>(),
            new TestUnique<>(),
            new TestInvert<>(),
            new TestPreSort<>(),
            new TestPreSortWith2Unique<>(),
            new TestPreSortWith5Unique<>(),
            new TestStringUnique<>(),
            new TestStringNotUnique<>()
    };

    public static void main(String[] args) {
        for (Test<?> test : tests) {
            System.out.println(test.getName());
        }
    }
}
