package javaCourse.lesson1;

public class Homework1 {
    public static void main(String[] args) {
        Author tolstoy = new Author("Lev", "Tolstoy");
        Book sunday = new Book("Sunday", tolstoy, 1866);
        System.out.println("Книга " + sunday.getName() + " автора "
                + sunday.getAuthor().getFirstName() + " " + sunday.getAuthor().getLastName()
                + " опубликована в " + sunday.getYear() + " году");
        sunday.setYear(1888);
        System.out.println("sunday.getYear() = " + sunday.getYear());

    }
}