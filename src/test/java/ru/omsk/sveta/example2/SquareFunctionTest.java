package ru.omsk.sveta.example2;

import org.junit.Assert;
import org.junit.Test;
import ru.omsk.sveta.example2.SquareFunction;

public class SquareFunctionTest {

    /**
     * Тестирование для одного примера
     */
    @Test
    public void oneTest() {
        SquareFunction squareFunction = new SquareFunction(2, 7, -4);
        double[] values = squareFunction.calculation();
        Assert.assertEquals(values.length, 2);
        Assert.assertEquals(values[0], -4.0, SquareFunction.delta);
        Assert.assertEquals(values[1], 0.5, SquareFunction.delta);
    }

    /**
     * Тестирование несколько примеров
     */
    @Test
    public void manyTest() {
        // информация для тестирования
        double[][] infos = {
                // 3 первых элемента массива - коэффициенты квадратного трехчлена
                //      дальше идут от 0 до 2 корней квадратного трехчлена
                {2, 7, -4, -4, 0.5},
                {1, -4, 4, 2},
                {3, -1, 7},
                {1, 18, 32, -16, -2},
                {3, 2, 1},
                {196, -28, 1, 1.0 / 14.},
        };
        for (double[] info : infos) {
            SquareFunction squareFunction = new SquareFunction(info[0], info[1], info[2]);
            double[] values = squareFunction.calculation();
            Assert.assertEquals(values.length, info.length - 3);
            for (int i = 0; i < values.length; i++) {
                Assert.assertEquals(values[i], info[3 + i], SquareFunction.delta);
            }
        }
    }

}
