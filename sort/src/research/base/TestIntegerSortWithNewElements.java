package research.base;

import research.base.TestInteger;

import java.util.ArrayList;
import java.util.Collections;

abstract public class TestIntegerSortWithNewElements<T extends Integer> extends TestInteger<Integer> {

    protected ArrayList<Integer> getSortArray(int amountNewElement) {
        ArrayList<Integer> output;
        output = getRandomList(true);
        Collections.sort(output);
        if(amountNewElement > output.size())
            amountNewElement = output.size();
        for (int i = 0; i < amountNewElement; i++) {
            int position = random.nextInt(output.size());
            output.set(position, random.nextInt(output.size()));
        }
        return output;
    }
}