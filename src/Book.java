
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

        public String getAuthor( ) {
            return author;
        }

        public int getYearPublication() {
            return yearPublication;
        }

        public void setYearPublication(int yearPublication) {
            this.yearPublication = yearPublication;
        }
    }


