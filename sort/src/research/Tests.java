package research;

import research.base.Test;
import research.tests.TestNotUnique;
import research.tests.TestUnique;

public class Tests {
    private static Test<?> integerTests[] = { new TestNotUnique<>(), new TestUnique<>()};

    public static void main(String[] args) {
        for (Test<?> test:integerTests) {
            System.out.println(test.getName());
        }
        System.out.println("Hello world");
    }
}
