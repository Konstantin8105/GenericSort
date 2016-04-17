package research.base;

import java.util.ArrayList;

abstract public class TestString<T extends String> extends Test<String> {

    protected ArrayList<String> getRandomList(boolean isManyUnique) {
        int factorUnique = amountArray;
        if (isManyUnique) {
            factorUnique *= 10.d;
        } else {
            factorUnique *= 0.01d;
        }
        if (factorUnique < 2) {
            factorUnique = 2;
        }

        ArrayList<String> preArray = new ArrayList<>();
        for (int i = 0; i < factorUnique; i++) {
            preArray.add(String.format("number%7.10f", random.nextDouble())
                    +
                    String.format("and%7.10f", random.nextDouble())
                    +
                    String.format("%10d", random.nextLong())
            );
        }

        ArrayList<String> output = new ArrayList<>();
        for (int i = 0; i < amountArray; i++) {
            output.add(preArray.get(random.nextInt(preArray.size())));
        }
        return output;
    }
}