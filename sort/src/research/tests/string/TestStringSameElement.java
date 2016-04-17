package research.tests.string;

import research.base.TestString;

import java.util.ArrayList;

public class TestStringSameElement <T extends String> extends TestString<String> {

    private static final String SAME_ELEMENT = "Some random text";

    public TestStringSameElement() {
        array = new ArrayList<>();
        for (int i = 0; i < amountArray; i++) {
            array.add(SAME_ELEMENT);
        }
    }

    @Override
    public String getName() {
        return this.getClass().toString();
    }

}