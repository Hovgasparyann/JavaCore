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
public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {5, 6, 13, 22, 49, 3, 54, 77, 16, 81};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(" " + min);
    }
}








