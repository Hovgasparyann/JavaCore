package education.storage;

import education.model.Lesson;

public class LessonStorage {

    private static int size;
    static Lesson[] lessons = new Lesson[15];
    

    public static void add(Lesson lesson) {
        if (lessons.length == size) {
            extend();
        }
        lessons[size++] = lesson;
    }

    private static void extend() {
        Lesson[] tmp = new Lesson[lessons.length + 10];
        System.arraycopy(lessons, 0, tmp, 0, lessons.length);
        lessons = tmp;
    }

    public static void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(lessons[i]);
        }
    }

    public Lesson getByLessonName (String lessonName){

        for (int i = 0; i < size; i++) {
            if (lessons[i].getLesson().equals(lessonName)){
                return lessons[i];
            }

        }
        return  null;

    }


    public void deleteLessonByName(Lesson lesson) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getLesson().equals(lesson)) {
                for (int j = i + 1; j < size; j++) {
                    lessons[j - 1] = lessons[j];
                }
            }
        }
        size--;
    }

}
