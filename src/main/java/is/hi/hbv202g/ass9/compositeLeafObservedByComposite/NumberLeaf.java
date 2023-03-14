package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;
public class NumberLeaf extends Observable implements MathExpression {
    private int value;

    public NumberLeaf(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(Observable observable) {
        this.value = ((NumberLeaf) observable).getValue();
    }

    public int getResult() {
        return value;
    }
}
