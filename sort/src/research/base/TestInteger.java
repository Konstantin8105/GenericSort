package research.base;

import java.util.ArrayList;
import java.util.List;

abstract public class TestInteger<T extends Integer> extends Test<Integer> {

    protected ArrayList<Integer> getRandomList(boolean isManyUnique) {
        ArrayList<Integer> output = new ArrayList<>();
        int factorUnique = amountArray;
        if (isManyUnique) {
            factorUnique *= 10.d;
        } else {
            factorUnique *= 0.01d;
        }
        if (factorUnique < 1) {
            factorUnique = 1;
        }
        for (int i = 0; i < amountArray; i++) {
            output.add(random.nextInt(factorUnique));
        }
        return output;
    }
}
