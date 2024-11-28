package T1_JavaConstructors;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // banck account
            System.out.println("add account number: ");
            var accountNumber = sc.nextLine();
            System.out.println("add of balance: ");
            var balance = sc.nextDouble();
            System.out.println("add account type: ");
            var accountType = sc.nextLine();
            var bankAccount = new BankAccount(accountNumber, balance, accountType);


            // book
            System.out.println("add book title: ");
            var title = sc.nextLine();
            System.out.println("add author: ");
            var author = sc.nextLine();
            System.out.println("add number of page: ");
            var numberOfPage = sc.nextInt();
            var book = new Book(title, author, numberOfPage);


            // student
            System.out.println("add student name: ");
            var name = sc.nextLine();
            System.out.println("add age: ");
            var age = sc.nextInt();
            System.out.println("add course: ");
            var course = sc.nextLine();
            var student = new Student(name, age, course);


            System.out.println(bankAccount);
            System.out.println(book);
            System.out.println(student);
        }

        
    }
}
