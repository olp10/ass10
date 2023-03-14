package is.hi.hbv202g.ass9.composite;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite implements MathExpression {

    List<Integer> numbers;
    public PlusComposite() {
        this.numbers = new ArrayList<>();
    }

    public void add(NumberLeaf numberLeaf) {
        numbers.add(numberLeaf.getResult());
    }

    public void add(PlusComposite plusComposite) {
        numbers.add(plusComposite.getResult());
    }
    @Override
    public int getResult() {
        for (int i = 0; i < numbers.size(); i++) {
            int result = numbers.get(i);
            for (int j = i + 1; j < numbers.size(); j++) {
                result += numbers.get(j);
            }
            return result;
        }
        return 0;
    }
}
