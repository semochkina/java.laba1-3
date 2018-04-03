import org.junit.Assert;
import org.junit.Test;

public class SquareFunction2Test {
    @Test
    public void test() {
        SquareFunction squareFunction = new SquareFunction(2, 7, -4);
        double maxValue = new SquareFunction2(squareFunction).maxValue();
        Assert.assertEquals(maxValue, 0.5, SquareFunction.delta);

        SquareFunction squareFunction2 = new SquareFunction(3, -1, 7);
        try {
            double maxValue2 = new SquareFunction2(squareFunction2).maxValue();
            Assert.fail("Baga");
        } catch (RuntimeException ex) {
           // ex.printStackTrace();
        }
    }
}
