package models;

public class BookCategory {
    int id;
    String bookCateName;

    public BookCategory(int id, String bookCateName) {
        this.id = id;
        bookCateName = bookCateName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookCateName() {
        return bookCateName;
    }

    public void setBookCateName(String bookCateName) {
        bookCateName = bookCateName;
    }
}
