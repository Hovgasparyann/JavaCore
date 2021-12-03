package education;

import education.model.Lesson;
import education.model.Student;
import education.storage.LessonStorage;
import education.storage.StudentStorage;

import java.util.Scanner;

public class LessonStorageTest {

    static Scanner scanner = new Scanner(System.in);
    static LessonStorage lessonStorage = new LessonStorage();
    static StudentStorage sr = new StudentStorage();



    private static final String EXIT = "0";
    private static final String ADD_LESSON = "1";
    private static final String ADD_STUDENT = "2";
    private static final String PRINT_STUDENTS = "3";
    private static final String PRINT_STUDENTS_BY_LESSON = "4";
    private static final String PRINT_LESSONS = "5";
    private static final String DELETE_LESSON_BY_NAME = "6";
    private static final String DELETE_STUDENT_BY_EMAIL = "7";

    private static void printCommands() {

        System.out.println("\033[4;36m" + "Input " + EXIT + " For exit !");
        System.out.println("Input " + ADD_LESSON + " For add Lesson");
        System.out.println("Input " + ADD_STUDENT + " For add Student");
        System.out.println("Input " + PRINT_STUDENTS + " For print Student's list");
        System.out.println("Input " + PRINT_STUDENTS_BY_LESSON + " For print Students by Lesson");
        System.out.println("Input " + PRINT_LESSONS + " For print Lesson's");
        System.out.println("Input " + DELETE_LESSON_BY_NAME + " For delete lesson by name");
        System.out.println("Input " + DELETE_STUDENT_BY_EMAIL + " For delete student by e-mail" + "\033[4;32m");
        System.out.println();

    }

    public static void main(String[] args) {

        StudentStorage.add(new Student("Loly","Lololy",45,"lol@mail.ru",77855457,"Test"));
        LessonStorage.add(new Lesson("Java","OOP",60,5000));

        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_STUDENTS:
                    printStudents();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    printStudentsByLesson();
                    break;
                case PRINT_LESSONS:
                    printLessons();
                    break;
                case DELETE_LESSON_BY_NAME:
                    deleteLessonByName();
                    break;
                case DELETE_STUDENT_BY_EMAIL:
                    deleteStudentByEmail();
                    break;
                default:
                    System.out.println("Invalid Command !");
            }


        }

    }

    private static void deleteStudentByEmail() {
        System.out.println("Input Student e-mail for delete");
        StudentStorage.print();
        String email = scanner.nextLine();
        Student student = StudentStorage.getByEmail(email);
        if (student != null) {
            StudentStorage.deleteStudentByEmail(student);
            System.out.println("Student Deleted");
        }else {
            System.err.println("Error");
        }

    }

    private static void deleteLessonByName() {
        System.out.println("Input Lesson name for delete");
        String lessonName = scanner.nextLine();
        Lesson lesson = lessonStorage.getByLessonName(lessonName);
        if (lesson != null){
        lessonStorage.deleteLessonByName(lesson);
            System.out.println("Lesson Deleted !");
        }else {
            System.err.println("Error");
        }

    }

    private static void printLessons() {
        System.out.println();
        LessonStorage.print();
        System.out.println();
    }

    private static void printStudentsByLesson() {
        System.out.println("Print lesson name for search Student");
        String lesson = scanner.nextLine();
        Student student = StudentStorage.getByLesson(lesson);
        System.out.println();

    }

    private static void printStudents() {
        System.out.println();
        StudentStorage.print();
        System.out.println();

    }

    private static void addStudent() {
        System.out.println("Input Student Name");
        String name = scanner.nextLine();
        System.out.println("Input Surname");
        String surname = scanner.nextLine();
        System.out.println("Input Age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Input e-mail");
        String email = scanner.nextLine();
        System.out.println("Input PhoneNumber");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Input Lesson");
        String lesson = scanner.nextLine();
        System.out.println();

        Student student = new Student(name, surname, age, email, phoneNumber, lesson);

        if (StudentStorage.getByEmail(student.getEmail()) != null) {
            System.err.println("This email already exists !");
        } else {
            StudentStorage.add(student);
            System.out.println("Student Added !");
            System.out.println();

        }

    }

    private static void addLesson() {
        System.out.println("Input Lesson name, Lecture Name, Duration, Price");
        String lessonDataStr = scanner.nextLine();
        String[] lessonData = lessonDataStr.split(",");
        if (lessonData.length == 4) {
            int Duration = Integer.parseInt(lessonData[2]);
            int Price = Integer.parseInt(lessonData[3]);
            Lesson lesson = new Lesson(lessonData[0], lessonData[1], Duration, Price);
            if (lessonStorage.getByLessonName(lesson.getLesson()) != null) {
                System.out.println("This Lesson name is already exists !");
            } else lessonStorage.add(lesson);
            System.out.println("Lesson added !");
            System.out.println();
        } else {
            System.err.println("Invalid Data !");
        }


    }

}
