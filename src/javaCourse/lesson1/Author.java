package javaCourse.lesson1;

import java.util.Objects;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String toString() {
        return "Автор " + this.firstName + " " + this.lastName;
    }

    public boolean equals(Author author) {
        if (this == author) {
            return true;
        }
        if (author == null || getClass() != author.getClass()) {
            return false;
        }
//        Author author = (Author) author;
        return firstName.equals(author.firstName) && lastName.equals(author.lastName);
    }

    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
