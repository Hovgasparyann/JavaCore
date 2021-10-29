package homework.figurePainter;

public class ExampleOop {

    void Christmastree (int n, int f){


        for (int j = f; j <=n; j++) {

            for (int i = 24; i >= j; i--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= j; k++) {
                System.out.print("* ");
            }

            System.out.println();

        }


    }

}
