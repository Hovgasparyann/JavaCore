package homework.author;

public class AuthorStorage {

    private Author[] authors = new Author[16];
    private int size;

    public void add(Author author) {
        if (authors.length == size) {
            extend();
        }
        authors[size++] = author;
    }

    private void extend() {
        Author[] tmp = new Author[authors.length + 10];
        System.arraycopy(authors, 0, tmp, 0, authors.length);
        authors = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(authors[i]);
        }
    }

    public void searchByName(String keyword) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getName().contains(keyword) ||
                    authors[i].getSurname().contains(keyword)) {
                System.out.println(authors[i]);
            }
        }
    }

    public void searchByAge(int minAge, int maxAge) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getAge() >= minAge &&
                    authors[i].getAge() <= maxAge) {
                System.out.println(authors[i]);
            }
        }
    }

    public Author getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getEmail().equals(email)) {
                return authors[i];
            }
        }
        return null;
    }

    public void changeAuthor(String email, String name, String surname, String gender, int age) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getEmail().equals(email)) {
                if (!name.equals("")) {
                    authors[i].setName(name);
                }
                if (!surname.equals("")) {
                    authors[i].setSurname(surname);
                }
                if (!gender.equals("")) {
                    authors[i].setGender(gender);
                }
                if (age != 0) {
                    authors[i].setAge(age);
                }
            }
        }
    }


    public void changeBookAuthor(String keyword) {

    }
}
