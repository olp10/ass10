package is.hi.hbv202g.ass9.compositeTemplateMethod;

import static org.junit.Assert.*;

import is.hi.hbv202g.ass9.compositeLeafObservedByComposite.MultiplyComposite;
import is.hi.hbv202g.ass9.compositeLeafObservedByComposite.NumberLeaf;
import is.hi.hbv202g.ass9.compositeLeafObservedByComposite.PlusComposite;
import org.junit.Test;

public class MixedCompositeObserverTest {

	@Test
	public void testMixedPlusMultiplyCompositesObserver() {

		NumberLeaf number1 = new NumberLeaf(1);
		NumberLeaf number2 = new NumberLeaf(2);
		NumberLeaf number4 = new NumberLeaf(4);

		PlusComposite plusComposite = new PlusComposite();
		plusComposite.add(number1);
		plusComposite.add(number2);
		System.out.println("Plus last observed result: " + plusComposite.getLastObservedResult());
		System.out.println("Plus result: " + plusComposite.getResult());

		MultiplyComposite multiplyComposite = new MultiplyComposite();
		multiplyComposite.add(number4);
		multiplyComposite.add(plusComposite);

		System.out.println("Multiply Last observed result: " + multiplyComposite.getLastObservedResult());
		System.out.println("Multiply Result: " + multiplyComposite.getResult());

		number1.attach(multiplyComposite);
		number2.attach(multiplyComposite);
		number4.attach(multiplyComposite);

		System.out.println("Multiply Last observed result: " + multiplyComposite.getLastObservedResult());
		System.out.println("Multiply Result: " + multiplyComposite.getResult());

		number1.setValue(3); // This will cause stuff printed on the screen: this is not tested.

		System.out.println("Multiply Last observed result: " + multiplyComposite.getLastObservedResult());
		System.out.println("Multiply Result: " + multiplyComposite.getResult());
	
		assertEquals(12, multiplyComposite.getLastObservedResult());
	}
}
