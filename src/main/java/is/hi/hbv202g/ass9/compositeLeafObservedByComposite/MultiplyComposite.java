package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite implements Observer,  MathExpression {
    private List<NumberLeaf> numbers;
    private int lastObservedResult;

    public MultiplyComposite() {
        this.numbers = new ArrayList<>();
    }

    public void add(NumberLeaf numberLeaf) {
        numbers.add(numberLeaf);
    }

    public void add(MultiplyComposite multiplyComposite) {
        numbers.add(new NumberLeaf(multiplyComposite.getResult()));
    }
    
    public void add(PlusComposite plusComposite) {
        numbers.add(new NumberLeaf(plusComposite.getResult()));
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

    @Override
    public void update() {
        lastObservedResult = getResult();
    }

    public int getLastObservedResult() {
        return lastObservedResult;
    }
}
