package model;

public class Library {
   private long id;
   private String bookName;
   private String authorName;
   private String genre;
   private short countPage;
   private String Language;
   private int prise;
   private boolean stockStatus ;


    public Library(long id, String bookName, String authorName, String genre, short countPage, String language, int prise, boolean stockStatus) {
        this.id = id;
        this.bookName = bookName;
        this.authorName = authorName;
        this.genre = genre;
        this.countPage = countPage;
        Language = language;
        this.prise = prise;
        this.stockStatus = stockStatus;
    }

    public long getId() {
        return id;
    }


    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public short getCountPage() {
        return countPage;
    }

    public void setCountPage(short countPage) {
        this.countPage = countPage;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public Integer getPrise() {
        return prise;
    }

    public void setPrise(Integer prise) {
        this.prise = prise;
    }

    public boolean getStockStatus() {
        return stockStatus;
    }

    public void setStockStatus(boolean stockStatus) {
        this.stockStatus = stockStatus;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", genre='" + genre + '\'' +
                ", countPage=" + countPage +
                ", Language='" + Language + '\'' +
                ", prise=" + prise +
                ", stockStatus=" + stockStatus +
                '}';
    }
}
