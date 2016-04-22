package research.tests.integer;

import research.base.TestInteger;

import java.util.ArrayList;

public class TestPreSort<T extends Integer> extends TestInteger<Integer> {

    private static final int stepPreSort = 4;

    public TestPreSort() {
        array = new ArrayList<>();
        int additionValue = 0;
        for (int i = 0; i < amountArray; i++) {
            if (i % stepPreSort == 0) {
                additionValue = random.nextInt(3000) - 1500;
            }
            array.add(i + additionValue);
        }
    }

    @Override
    public String getName() {
        return this.getClass().toString();
    }

}