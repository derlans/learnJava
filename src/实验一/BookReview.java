package 实验一;

public class BookReview {
    public static void main(String[] args) {
        Book book = new Book("Java");
        book.addRating(5);
        book.addRating(4);
        book.addRating(3);
        book.addRating(2);
        book.addRating(1);
        System.out.println(book.getBookName()+ "， Average Rating:" +book.getAverageRating());
    }
}
