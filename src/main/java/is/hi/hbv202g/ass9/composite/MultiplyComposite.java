package is.hi.hbv202g.ass9.composite;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite implements MathExpression {
    private List<NumberLeaf> numbers;

    public MultiplyComposite() {
        this.numbers = new ArrayList<>();
    }

    public void add(NumberLeaf numberLeaf) {
        numbers.add(numberLeaf);
    }

    public void add(PlusComposite plusComposite) {
        numbers.add(new NumberLeaf(plusComposite.getResult()));
    }

    public void add(MultiplyComposite multiplyComposite) {
        numbers.add(new NumberLeaf(multiplyComposite.getResult()));
    }
    @Override
    public int getResult() {
        for (int i = 0; i < numbers.size(); i++) {
            int result = numbers.get(i).getResult();
            for (int j = i + 1; j < numbers.size(); j++) {
                result *= numbers.get(j).getResult();
            }
            return result;
        }
        return 0;
    }
}
