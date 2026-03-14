package lab2.t1b;

public class DVD extends LibraryItem {
    private int duration;
    private String rating;
    private String genre;

    DVD(String title, String author, int duration, String rating, String genre) {
        super(title, author, duration);
        this.duration = duration;
        this.rating = rating;
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public String getRating() {
        return rating;
    }
    public void setRating(String rating) {
        this.rating = rating;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public double getOverdueFine() {
        return 500;
    }

    @Override
    public String toString() {
        return "DVD[Title: " + super.getTitle() + ", Author: " + super.getAuthor() + ", Publication year: " + super.getPublicationYear() + ", Duration: " + duration + ", Rating: " + rating + ", Genre: " + genre + "]";
    }
}
