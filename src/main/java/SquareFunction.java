/**
 * Класс для хранения квадратного трехчлена
 * Корни квадратного уравнения ax2 + bx + c = 0 можно найти
 * по формуле: x = (-b +- sqrt(D)) / 2a
 * где D = b*b - 4ac - дискриминант
 * если D < 0 - корней нет
 * если D == 0 - 1 корень
 * если D > 0 - 2 корня
 * решение можно глянуть тут - http://formula-xyz.ru/korni-kvadratnogo-uravneniya.html
 */
public class SquareFunction {
    /** дельта для сравнения вещественных чисел */
    public static double delta = 0.00001;

    private double a;
    private double b;
    private double c;

    /**
     * Конструктор, принимает коэффициенты квадратного трехчлена
     *
     * @param a - коэффициенты 1
     * @param b - коэффициенты 2
     * @param c - коэффициенты 3
     */
    public SquareFunction(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * получить массив корней
     *
     * @return длина массива от 0 до 2 в зависимости от количества корней
     */
    public double[] calculation() {
        double D = b * b - 4 * a * c;
        if (D < -delta) {
            // дискриминант < 0 - нет корней
            return new double[0];
        }
        if (D < delta) {
            // дискриминант == 0 - 1 корень
            double x1 = -b / (2.0 * a);
            return new double[]{x1};
        }
        // дискриминант > 0 - 2 корня
        double x1 = (-b - Math.sqrt(D)) / (2.0 * a);
        double x2 = (-b + Math.sqrt(D)) / (2.0 * a);
        return new double[]{x1, x2};
    }
}
