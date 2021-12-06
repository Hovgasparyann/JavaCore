package education.storage;

import education.model.Student;

public class StudentStorage {


    private static int size;
    private static Student[] students = new Student[15];



    public static void add(Student student) {
        if (size == students.length) {
            extend();
        }
        students[size++] = student;
    }

    private static void extend() {
        Student[] tmp = new Student[students.length + 10];
        System.arraycopy(students, 0, tmp, 0, size);
        students = tmp;

    }

    public static void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);
        }
    }

    public static Student getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (students[i].getEmail().equals(email)) {
                return students[i];
            }
        }
        return null;
    }

    public static Student getByLesson(String lesson) {
        for (int i = 0; i < size; i++) {
            if (students[i].getLesson().equals(lesson)) {
                System.out.println(students[i]);
            }
        }
        return null;
    }


    public static void deleteStudentByEmail(Student student) {
        for (int i = 0; i < size; i++) {
            if (students[i].getEmail().equals(student)) {
                for (int j = i + 1; j < size; j++) {
                    students[j - 1] = students[j];
                }
            }
        }
        size--;
    }
}