//public class MaxValueCheckUC4<T extends Comparable<T>> {
//    public T x, y, z, l, m;
//
//    public MaxValueCheckUC4(T x, T y, T z, T l, T m) {
//        this.x = x;
//        this.y = y;
//        this.z = z;
//        this.l = l;
//        this.m = m;
//    }
//
//    private T maximum() {
//        return MaxValueCheckUC4.maximum(x, y, z, l, m);
//    }
//
//    public static <T extends Comparable<T>> T maximum(T x, T y, T z, T l, T m) {
//        T max = x;
//        if (y.compareTo(max) > 0 && y.compareTo(z) > 0 && y.compareTo(l) > 0 && y.compareTo(m) > 0) {
//            max = y;
//        } else if (z.compareTo(max) > 0 && z.compareTo(y) > 0 && z.compareTo(l) > 0 && z.compareTo(m) > 0) {
//            max = z;
//        } else if (l.compareTo(max) > 0 && l.compareTo(y) > 0 && l.compareTo(z) > 0 && l.compareTo(m) > 0) {
//            max = l;
//        } else if (m.compareTo(max) > 0 && m.compareTo(y) > 0 && m.compareTo(z) > 0 && m.compareTo(l) > 0) {
//            max = m;
//        } else {
//            return max;
//        }
//
//        public static String testMaximum (String x, String y, String z, String l, String m){
//            String max = x;
//            if (y.compareTo(max) > 0 && y.compareTo(z) > 0 && y.compareTo(l) > 0 && y.compareTo(m) > 0) {
//                max = y;
//            } else if (z.compareTo(max) > 0 && z.compareTo(y) > 0 && z.compareTo(l) > 0 && z.compareTo(m) > 0) {
//                max = z;
//            } else if (l.compareTo(max) > 0 && l.compareTo(y) > 0 && l.compareTo(z) > 0 && l.compareTo(m) > 0) {
//                max = l;
//            } else if (m.compareTo(max) > 0 && m.compareTo(y) > 0 && m.compareTo(z) > 0 && m.compareTo(l) > 0) {
//                max = m;
//            } else {
//                return max;
//            }
//        }
//    }
//
//
////    public static <T> void printMax(T x, T y, T z, T max) {
////        System.out.printf("Max of %s, %s and %s is %s\n", x, y, z, max);
////    }
//
//    public static void main(String[] args) {
//        Integer xInt = 8, yInt = 6, zInt = 5, lInt = 8, mInt = 6;
//        Float xFloat = 5.9f, yFloat = 9.8f, zFloat = 9.3f, lFloat = 5.9f, mFloat = 9.8f;
//        String xStr = "kiwi", yStr = "apple", zStr = "watermelon", lStr = "papaya", mStr = "orange";
//        System.out.println("Maximum Integer Number is: " + new MaxValueCheckUC4(xInt, yInt, zInt).maximum());
//        System.out.println("Maximum Float Number is: " + new MaxValueCheckUC4(xFloat, yFloat, zFloat).maximum());
//        System.out.println("Maximum Srting is: " + new MaxValueCheckUC4(xStr, yStr, zStr).maximum());
//    }
//}
