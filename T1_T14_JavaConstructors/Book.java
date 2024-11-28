package T1_T14_JavaConstructors;


public class Book {

    private String title;
    private String author;
    private int numberOfPage;
   
    public Book() {
        this.title = "default book";
    }

    public Book(String title, String author, int numberOfPage) {
        this.title = title;
        this.author = author;
        this.numberOfPage = numberOfPage;
    }

    @Override
    public String toString() {
        String book;
        book = "Book : " + " Title: " + this.title + ", " +
                " Author: " + this.author + ", " + " Number of page " + this.numberOfPage;

        return book;
    }

    public String getTitle() {
        return title;
    }


    public String getAuthor() {
        return author;
    }

   
    public int getNumberOfPage() {
        return numberOfPage;
    }

  

}