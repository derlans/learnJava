package 实验一;

public class Book {
    private String bookName;
    private int[] ratings;

    public Book(String bookName) {
        this.bookName = bookName;
        ratings = new int[5];
    }

    public void addRating(int rating) {
        if (rating < 0 || rating > 5) {
            throw new IllegalArgumentException("Invalid rating");
        }
        ratings[rating - 1]++;
    }

    public double getAverageRating() {
        int sum = 0;
        for (int i = 0; i < ratings.length; i++) {
            sum += (i+1) * ratings[i];
        }
        return sum / (double) ratings.length;
    }

    public String getBookName() {
        return bookName;
    }

}
