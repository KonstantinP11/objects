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
        System.out.println(tolstoy);
        System.out.println(sunday);
        Author tolstoy1 = new Author("Lev", "Tolstoy");
        System.out.println(tolstoy1.equals(tolstoy));
        Author t = tolstoy;
        System.out.println(tolstoy.equals(t));
        Book book = new Book("Sunday", tolstoy, 1888);
        System.out.println(book.equals(sunday));
        System.out.println(book.hashCode());
        System.out.println(sunday.hashCode());
        System.out.println(sunday.hashCode() == book.hashCode());
    }
}