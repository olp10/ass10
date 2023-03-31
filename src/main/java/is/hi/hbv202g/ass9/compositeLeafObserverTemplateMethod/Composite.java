/*******************************************************
 * Nafn: María Rós Kaldalóns
 * T-póstur: mrk9@hi.is
 *
 * Lýsing:
 *
 *
 *********************************************************/
package is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod;

import is.hi.hbv202g.ass9.composite.NumberLeaf;

import java.util.ArrayList;
import java.util.List;

public abstract class Composite implements Observer {
    protected List<NumberLeaf> numberLeaves;
    protected int lastObservedResult;

    public Composite() {
        this.numberLeaves = new ArrayList<>();
    }
    public void add(NumberLeaf numberLeaf) {
        numberLeaves.add(numberLeaf);
    }
    public void add(Composite composite) {
        numberLeaves.add(new NumberLeaf(composite.getResult()));
    }

    public List<NumberLeaf> getNumberLeaves() {
        return numberLeaves;
    }

    public void setNumberLeaves(List<NumberLeaf> numberLeaves) {
        this.numberLeaves = numberLeaves;
    }

    public int getLastObservedResult() {
        return lastObservedResult;
    }

    public void setLastObservedResult(int lastObservedResult) {
        this.lastObservedResult = lastObservedResult;
    }
    public int getResult() {
        return 0;
    }
    public void update() {
        lastObservedResult = getResult();
    }
}