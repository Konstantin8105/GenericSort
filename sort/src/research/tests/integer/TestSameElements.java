package research.tests.integer;

import research.base.TestInteger;

import java.util.ArrayList;

public class TestSameElements<T extends Integer> extends TestInteger<Integer> {

    private static final int SAME_ELEMENT = 8;

    public TestSameElements() {
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
