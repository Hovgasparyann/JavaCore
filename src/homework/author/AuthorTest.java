package homework.author;

import java.util.Scanner;

public class AuthorTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Քանի հատ հեղինակ ունենք");
        int authorCount = scanner.nextInt();
        AuthorStorage authorStorage = new AuthorStorage();
        for (int i = 0; i < authorCount; i++) {
            System.out.println("name");
            String name = scanner.next();
            System.out.println("surname");
            String surname = scanner.next();
            System.out.println("email");
            String email = scanner.next();
            System.out.println("age");
            int age = scanner.nextInt();
            System.out.println("gender");
            String gender = scanner.next();
            authorStorage.add(new Author(name, surname, email, age, gender));
            System.out.println("Enter next author");
        }


        authorStorage.print();
    }



}
