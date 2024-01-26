import java.util.Objects;

public class Book {

    private String name;
    private String author;
    private int yearPublication;


    public Book(String name, String author, int yearPublication) {
        this.name = name;
        this.author = author;
        this.yearPublication = yearPublication;

    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublication() {
        return yearPublication;
    }


        public void setYearPublication(int yearPublication) {
            this.yearPublication = yearPublication;

        }

    @Override
    public String toString() {
        return "BBook{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", yearPublication=" + yearPublication +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, yearPublication);

    }
}

    public String toString() {
        return getName() + " " + getAuthor() + " " + getYearPublication();

    }


}


