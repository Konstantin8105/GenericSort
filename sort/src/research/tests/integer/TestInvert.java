package research.tests.integer;

import research.base.TestInteger;

import java.util.ArrayList;

public class TestInvert<T extends Integer> extends TestInteger<Integer> {

    public TestInvert() {
        array = new ArrayList<>();
        for (int i = 0; i < amountArray; i++) {
            array.add(amountArray-i);
        }
    }

    @Override
    public String getName() {
        return this.getClass().toString();
    }

}