package day2Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class BookDetails {    
    private static int bookCount;
    static ArrayList<Book> array = new ArrayList<Book>();

    static {
        bookCount=0;
    }

    public int getBookCount() {
        return bookCount;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Book bk = new Book();
        System.out.println("Enter the no.of books you need to enter ");
        int count = scanner.nextInt();

        for(int i =0; i<count;i++) {
            System.out.println("Enter the book Number");
            bk.setBookNo(scanner.nextInt());
            System.out.println("Enter the title");
            bk.setTitle(scanner.next());
            System.out.println("Enter the Author Name");
            bk.setAuthor(scanner.next());
            System.out.println("Enter the price ");
            bk.setPrice(scanner.nextFloat());

            array.add(bk);
            bookCount++;
        }  
        System.out.println("Enter the book you want to search");
        int bkno = scanner.nextInt();
        search(bkno);
    }
    public static void search(int bookNo) {
        
        for (Book b : array){        
            if (b.getBookNo()==bookNo) {
                System.out.println("Book details for Book Number ::" +bookNo);
                System.out.println(b.toString());
            }else
                System.out.println("Book number not found");
        }
    }
}