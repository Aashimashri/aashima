package javaprgs;
import java.util.Scanner;

public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c = new Computer();
		Scanner sc = new Scanner(System.in);
		System.out.println("the type of the computer book");
		 String type = sc.next();
		 c.setType(type);
		 
		 Book b1 = new Book();
		System.out.println("the book no");
		int bookno =sc.nextInt();
	     b1.setBookNo(bookno);
		System.out.println("the book title");
		String bookname = sc.next();
		b1.setTitle(bookname);
		System.out.println("the book publication");
		String publication = sc.next();
		b1.setPublication(publication);
		System.out.println("the book author");
		String author = sc.next();
		b1.setAuthor(author);
		System.out.println("the book price");
		float price = sc.nextFloat();
		b1.setPrice(price);
		System.out.println("the book no is"+c.getType());
		System.out.println("the book no is"+b1.getBookNo());
		System.out.println("the  book  name is"+b1.getTitle());
		System.out.println("the book publication"+b1.getPublication());
		System.out.println("the book author"+b1.getAuthor());
		System.out.println("the book price"+b1.getPrice());
		
		System.out.println("-------------------------------------------------");
		Mathematics m = new Mathematics();
		
		Scanner sca = new Scanner(System.in);
		System.out.println("the type of mathematics book is");
		String type1 = sca.next();
		m.setType(type1);
		System.out.println("the math book no");
		int bookno1 =sca.nextInt();
		b1.setBookNo(bookno1);
		System.out.println("the math title");
		String title = sca.next();
		b1.setTitle(title);
		System.out.println("the math publication");
		String publication1 = sc.next();
		System.out.println("math book author");
		String author1 = sca.next();
		b1.setAuthor(author1);
		System.out.println("the math book price");
		float price1 = sc.nextFloat();
		b1.setPrice(price1);
		System.out.println("the book no is"+ m.getType());
		
		System.out.println("the book no is"+ b1.getBookNo());
		System.out.println("the  book  name is"+ b1.getTitle());
		System.out.println("the book publication"+ b1.getPublication());
		System.out.println("the book author"+ b1.getAuthor());
		System.out.println("the book price"+b1.getPrice());
		}
	

	}


