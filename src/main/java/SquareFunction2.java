public class SquareFunction2 {
    private SquareFunction squareFunction;

    public SquareFunction2(SquareFunction squareFunction) {
        this.squareFunction = squareFunction;
    }

    public double maxValue () {
            double[] values = squareFunction.calculation();
            if (values.length == 0) {
                throw new RuntimeException("корней нет");
            }
            return values[0] > values[1] ? values[0] : values[1];
}
}
