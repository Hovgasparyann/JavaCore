package education;

public class Lesson {

    private String lesson;
    private String lectureName;
    private int duration;
    private int price;


    public Lesson(String lesson, String lectureName, int duration, int price) {
        this.lesson = lesson;
        this.lectureName = lectureName;
        this.duration = duration;
        this.price = price;
    }


    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lesson='" + lesson + '\'' +
                ", lectureName='" + lectureName + '\'' +
                ", duration=" + duration +
                ", price=" + price +
                '}';
    }

}
