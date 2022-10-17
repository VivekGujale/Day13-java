//Given 3 Integers find the maximum number.

public class MaxIntegerValueCheckUC1<T extends Comparable<T>> {
    public T x, y, z;

    public MaxIntegerValueCheckUC1(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T maximum() {
        return MaxIntegerValueCheckUC1.maximum(x, y, z);
    }

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        Integer xInt = 8, yInt = 6, zInt = 5;
        System.out.println("Maximum Integer Number is: " + new MaxIntegerValueCheckUC1(xInt, yInt, zInt).maximum());
    }
}
