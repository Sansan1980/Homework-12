public class Main {
    public static void main(String[] args) {

        Book book = new Book("'Voina i mir'", "'Tolstoyi'", 2030);
        System.out.println(book.getYearPublication() + " ");
        book.setYearPublication(2010);
        System.out.print(book.getName() + " ");
        System.out.print(book.getAuthor() + " ");
        System.out.println(book.getYearPublication() + " ");

        book = new Book("Sto let odinochestva", "Garsia", 2022);
        System.out.print(book.getName() + " ");
        System.out.print(book.getAuthor() + " ");
        System.out.print(book.getYearPublication() + " ");
    }




}