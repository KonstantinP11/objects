package javaCourse.lesson1;

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
        return firstName.equals(author.firstName) && lastName.equals(author.lastName);
    }
}
