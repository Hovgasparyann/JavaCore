package homework.arrayutil;

// մասիվի բոլոր էլեմենտները

// public class  ArrayUtil {
//    public static void main(String[] args) {
//        int[] array = {5, 6, 13, 22, 49, 3, 54, 77, 16, 81};
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//
//    }
//
//
// }

// մասիվի ամենամեծ թիվը

// public class  ArrayUtil {
//     public static void main(String[] args) {
//        int[] array = {5, 6, 13, 22, 49, 3, 54, 77, 16, 81};
//        int max = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > max) {
//                max = array[i];
//            }
//
//        }
//        System.out.println(" " + max);
//    }
// }

// մասիվի ամենափոքրը թիվը

//public class ArrayUtil {
//    public static void main(String[] args) {
//        int[] array = {5, 6, 13, 22, 49, 3, 54, 77, 16, 81};
//        int min = array[0];
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] < min) {
//                min = array[i];
//            }
//        }
//        System.out.println(" " + min);
//    }
//}

// մասիվի բոլոր զույգ էլեմենտները

//public class ArrayUtil {
//    public static void main(String[] args) {
//        int[] array = {5, 6, 13, 22, 49, 3, 54, 77, 16, 81};
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                System.out.println(array[i] + "  ");
//
//            }
//        }
//    }
//}

// մասիվի բոլոր կենտ էլեմենտները

//public class ArrayUtil {
//    public static void main(String[] args) {
//        int[] array = {5, 6, 13, 22, 49, 3, 54, 77, 16, 81};
//        for (int i = 0; i < array.length; i++) {
//            if (array[i]%2!=0){
//                System.out.println(array[i] + " ");
//            }
//
//        }
//    }
//}

// մասիվի էլեմենտների գումարը։

//public class ArrayUtil {
//    public static void main(String[] args) {
//        int[] array = {5, 6, 13, 22, 49, 3, 54, 77, 16, 81};
//        int a = 0;
//        for (int i = 0; i < array.length; i++) {
//            a += array[i];
//
//        }
//        System.out.println("array = " + a);
//    }
//}

// մասիվի զույգերի քանակը

//public class ArrayUtil {
//    public static void main(String[] args) {
//        int[] array = {5, 6, 13, 22, 49, 3, 54, 77, 16, 81};
//        int a = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i]%2==0) {
//                a++;
//            }
//
//        }
//        System.out.println(a);
//
//    }
//}

// մասիվի կենտերի քանակը

//public class ArrayUtil {
//    public static void main(String[] args) {
//        int[] array = {5, 6, 13, 22, 49, 3, 54, 77, 16, 81};
//        int a = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 != 0) {
//                a++;
//            }
//        }
//        System.out.println(a);
//
//    }
//}

// մասիվի բոլոր թվերի միջին թվաբանականը

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {5, 6, 13, 22, 49, 3, 54, 77, 16, 81};
        float a = 0;
        float b = 0;
        for (int i = 0; i < array.length; i++) {
            a += array[i];
            b = a / array.length;
        }
        System.out.println(b);
    }
}








