package is.hi.hbv202g.ass9.composite;

public class MultiplyComposite implements MathExpression {
    private int[] numbers;

    public MultiplyComposite(int[] numbers) {
        this.numbers = numbers;
    }
    @Override
    public int getResult() {
        for (int i = 0; i < numbers.length; i++) {
            int result = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                result *= numbers[j];
            }
            return result;
        }
        return 0;
    }
}
