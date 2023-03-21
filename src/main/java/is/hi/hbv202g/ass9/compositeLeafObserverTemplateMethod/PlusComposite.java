package is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite extends Composite implements MathExpression {

    public PlusComposite() {
        super.numberLeaves = new ArrayList<>();
    };


    @Override
    public int getResult() {
        for (int i = 0; i < numberLeaves.size(); i++) {
            int result = numberLeaves.get(i).getResult();
            for (int j = i + 1; j < numberLeaves.size(); j++) {
                result += numberLeaves.get(j).getResult();
            }
            return result;
        }
        return 0;
    }
}
