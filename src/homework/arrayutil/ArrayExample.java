package homework.arrayutil;

public class ArrayExample {
    public static void main(String[] args) {
        int[] array = {3, 6, 7, 9, 2, 6, 13, 4, 5, 3};


//        for (int i = 0; i < array.length; i++) {
//            for (int j =i+1; j < array.length ; j++) {
//                if (array[i]== array[j])
//                    System.out.println("krknvox "  + array[j]);
//            }
//
//
//        }

        boolean a = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                a = false;
                break;


            }

        }
        System.out.println(a);
    }
}