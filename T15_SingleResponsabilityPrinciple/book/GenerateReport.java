package T15_SingleResponsabilityPrinciple.book;

public class GenerateReport {
    
    public void loanBook(Book book) {
        System.out.println("the book " + book.getName());
        System.out.println("is borrowed");
    }
}
