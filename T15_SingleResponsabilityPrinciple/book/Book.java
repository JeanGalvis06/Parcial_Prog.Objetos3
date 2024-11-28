package T15_SingleResponsabilityPrinciple.book;

public class Book {
    
    private String name;
    private String author;
    private Boolean isAvailable;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        this.isAvailable = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }


    

    

}
