package T15_SingleResponsabilityPrinciple.book;

public class ShowInformationBook {
    
    public void showInformationBook(Book book) {
        System.out.println("Name: " + book.getName() + ", " + "Is Available: " + book.getIsAvailable());
    }
}
