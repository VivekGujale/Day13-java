//Given 3 Floats find the maximum number.


public class MaxFloatValueCheckUC2<T extends Comparable<T>> {
    T x, y, z;

    public MaxFloatValueCheckUC2(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T maximum() {
        return MaxFloatValueCheckUC2.maximum(x, y, z);
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

//        public static <E> void printMax(E x, E y, E z, E max) {
//        System.out.printf("Max value between %s, %s and %s is %s\n", x, y, z, max);
//    }

    public static void main(String[] args) {
        Float xFloat = 5.9f, yFloat = 9.8f, zFloat = 9.3f;
        System.out.println("Maximum Float Number is: " + new MaxFloatValueCheckUC2(xFloat, yFloat, zFloat).maximum());
    }
}
