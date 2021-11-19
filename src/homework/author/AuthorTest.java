package homework.author;

import java.util.Scanner;

public class AuthorTest {

    static Scanner scanner = new Scanner(System.in);
    static AuthorStorage authorStorage = new AuthorStorage();

    private static final String EXIT = "0";
    private static final String ADD_AUTHOR = "1";
    private static final String SEARCH_AUTHOR = "2";
    private static final String SEARCH_AUTHORS_BY_AGE = "3";
    private static final String PRINT_AUTHORS = "4";


    public static void main(String[] args) {

        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case SEARCH_AUTHOR:
                    searchByNameOrSurname();
                    break;
                case SEARCH_AUTHORS_BY_AGE:
                    searchByAge();
                    break;
                case PRINT_AUTHORS:
                    authorStorage.print();
                    break;
                default:
                    System.out.println("invalid command!");
            }

        }


        System.out.println("Քանի հատ հեղինակ ունենք");
        int authorCount = scanner.nextInt();


    }

    private static void searchByAge() {
        System.out.println("please input min age");
        int minAge = Integer.parseInt(scanner.nextLine());
        System.out.println("please input max age");
        int maxAge = Integer.parseInt(scanner.nextLine());
        authorStorage.searchByAge(minAge, maxAge);


    }

    private static void printCommands() {

        System.out.println("please input " + EXIT + " for exit");
        System.out.println("please input " + ADD_AUTHOR + " for add author");
        System.out.println("please input " + SEARCH_AUTHOR + " for search author by name or surname");
        System.out.println("please input " + SEARCH_AUTHORS_BY_AGE + " for search author by AGE");
        System.out.println("please input " + PRINT_AUTHORS + " for print author's");

    }

    private static void searchByNameOrSurname() {

        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        authorStorage.searchByNameOrSurname(keyword);

    }

    private static void addAuthor() {

        System.out.println("name");
        String name = scanner.nextLine();
        System.out.println("surname");
        String surname = scanner.nextLine();
        System.out.println("email");
        String email = scanner.nextLine();
        System.out.println("age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("gender");
        String gender = scanner.nextLine();
        authorStorage.add(new Author(name, surname, email, age, gender));
        System.out.println("Enter next author");

    }


}
