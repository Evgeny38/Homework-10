
package Task;

import java.util.Objects;

public class Author {
    private final String name;
    private final String surname;



    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }



   @Override
    public String toString() {
        return "Автор : " + this.name +" " + this.surname;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return getName().equals(author.getName()) && getSurname().equals(author.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname());
    }
}
