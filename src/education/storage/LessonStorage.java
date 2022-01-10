package education.storage;

import education.model.Lesson;

import java.util.LinkedList;
import java.util.List;

public class LessonStorage {


    static List<Lesson> lessons = new LinkedList<>();


    public static void add(Lesson lesson) {
        lessons.add(lesson);
    }


    public static void print() {
        for (Lesson lesson : lessons) {
            System.out.println(lesson);
        }
    }

    public Lesson getByLessonName(String lessonName) {
        for (Lesson lesson : lessons) {
            if (lesson.getLectureName().equals(lessonName)) {
                return lesson;
            }

        }
        return null;
    }

    public void deleteLessonByName(Lesson lesson) {
        lessons.remove(lesson);
    }
}