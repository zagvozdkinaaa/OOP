package lab2.t1b;

public abstract class LibraryItem {
    private String title;
    private String author;
    private int publicationYear;

    LibraryItem(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "LibraryItem[title=" + title + ", author=" + author + ", publicationYear=" + publicationYear + "]";
    }

    public abstract double getOverdueFine();
}
