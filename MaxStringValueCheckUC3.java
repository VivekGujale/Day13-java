//Given 3 Strings find the maximum String.


public class MaxStringValueCheckUC3<T extends Comparable<T>> {
    public T x, y, z;

    public MaxStringValueCheckUC3(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public <T extends Comparable<T>> T maximum() {

        if (x.compareTo(y) > 0 && x.compareTo(z) > 0) {
            return (T) x;
        } else if (y.compareTo(x) > 0 && y.compareTo(z) > 0) {
            return (T) y;
        } else {
            return (T) z;
        }
    }


    public static void main(String[] args) {
        String xStr = "kiwi", yStr = "apple", zStr = "watermelon";
        System.out.println("Maximum Srting is: " + new MaxStringValueCheckUC3(xStr, yStr, zStr).maximum());
    }
}
