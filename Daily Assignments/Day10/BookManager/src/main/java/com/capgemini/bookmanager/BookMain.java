package com.capgemini.bookmanager;

import java.util.ArrayList;
import java.util.Scanner;

import com.capgemini.bookmanager.exception.ArrayListIsNullException;
import com.capgemini.bookmanager.exception.BookAlreadyFoundException;
import com.capgemini.bookmanager.exception.BookIDCannotBeNegative;
import com.capgemini.bookmanager.exception.BookNameCannotBeNull;
import com.capgemini.bookmanager.exception.BookNotFoundException;
import com.capgemini.bookmanager.exception.PriceIsNotValidException;
import com.capgemini.bookmanager.model.Book;

public class BookMain {

	static ArrayList<Book> bookList = new ArrayList<Book>();
	static Scanner sm = new Scanner(System.in);
	static Book book;
	
	/**
	 * function to create an arraylist of bookList
	 */
	public static void createBookList() {
		if(bookList.size()<1) {
			int bid=0;
			String bname="";
			double price=0.0;
			do {
				try {
					System.out.print("\nEnter the Book ID : ");
					bid=sm.nextInt();
					if(bid<=0) {
						throw new BookIDCannotBeNegative("Book ID cannot be zero or negative");
					}
				}catch(BookIDCannotBeNegative e) {
					System.out.println(e.getMessage());
				}
			}while(bid<=0);
			do {
				try {
					System.out.print("\nEnter the Book Name : ");
					sm.nextLine();
					bname=sm.next();
					if(bname.equals(null)) {
						throw new BookNameCannotBeNull("\nBook Name cannot be null");
					}
				}catch(BookNameCannotBeNull e) {
					System.out.println(e.getMessage());
				}
			}while(bname.equals(null));
			do {
				try {
					System.out.print("\nEnter the Book Price : ");
					price=sm.nextDouble();
					if(price<=0) {
						throw new PriceIsNotValidException("Price is not valid");
					}
				}catch(PriceIsNotValidException e) {
					System.out.println(e.getMessage());
				}
			}while(price<=0);
			book = new Book(bid,bname,price);

			bookList.add(book);
			System.out.println("\nBook Created");
		}else {
			int temp=0;
			do {
				try {
					int bid=0;
					String bname="";
					double price=0.0;
					temp=0;
					do {
						try {
							do {
								try {
									System.out.print("\nEnter the Book ID : ");
									bid=sm.nextInt();
									if(bid<=0) {
										throw new BookIDCannotBeNegative("Book ID cannot be zero or negative");
									}
								}catch(BookIDCannotBeNegative e) {
									System.out.println(e.getMessage());
								}
							}while(bid<=0);
							if(bid<0) {
								throw new BookIDCannotBeNegative("Book ID cannot be zero or negative");
							}
						}catch(BookIDCannotBeNegative e) {
							System.out.println(e.getMessage());
						}
					}while(bid<0);
					int k=0;
					for(int i=0;i<bookList.size();i++) {
							if(bid==bookList.get(i).getBid()) {
								temp=1;
								k=i;
								break;
							}
			
					}
					if(temp==1) {
						throw new BookAlreadyFoundException("Book Already Found...It Cannot be added");
					}
					else {
					do {
						try {
							System.out.print("\nEnter the Book Name : ");
							sm.nextLine();
							bname=sm.next();
							if(bname.equals(null)) {
								throw new BookNameCannotBeNull("\nBook Name cannot be null");
							}
						}catch(BookNameCannotBeNull e) {
							System.out.println(e.getMessage());
						}
					}while(bname.equals(null));
					do {
						try {
							System.out.print("\nEnter the Book Price : ");
							price=sm.nextDouble();
							if(price<=0) {
								throw new PriceIsNotValidException("Price is not valid");
							}
						}catch(PriceIsNotValidException e) {
							System.out.println(e.getMessage());
						}
					}while(price<=0);
					book = new Book(bid,bname,price);
					bookList.add(book);
					System.out.println("\nBook Created");
					}
				}catch(BookAlreadyFoundException e) {
					System.out.println(e.getMessage());
				}
			}while(temp==1);
		}

	}

	/**
	 * function to read each book from arraylist
	 */
	public static void readbookList() {
		try {
			if(bookList.size()<1)
			{
				throw new ArrayListIsNullException("ArrayList is null.");
			}
			else {
				for(int i=0;i<bookList.size();i++) {
					System.out.println("\nBook No."+(i+1));
					System.out.println(bookList.get(i));
				}
			}
		}catch(ArrayListIsNullException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * function to delete a book from arraylist
	 */
	public static void updateBookList() {
		try {
			if(bookList.size()<1)
			{
				throw new ArrayListIsNullException("\nArrayList is null.");
			}
			else {
				int temp=0;
				int k=0;
				int id=0;
				String bname="";
				double price=0;
				try {
					System.out.print("\nEnter the book id you want to update : ");
					id=sm.nextInt();

					for(int i=0;i<bookList.size();i++) {
						if(bookList.get(i).getBid()==id) {
							temp=1;
							k=i;
						}
					}
					if(temp==0) {
						throw new BookNotFoundException("Book Not Found!!!");
					}
					else {
						do {
							try {
								System.out.print("\nEnter the new Book Name : ");
								sm.nextLine();
								bname=sm.next();
								if(bname.equals(null)) {
									throw new BookNameCannotBeNull("Book Name cannot be null");
								}
							}catch(BookNameCannotBeNull e) {
								System.out.println(e.getMessage());
							}
						}while(bname.equals(null));
						do {
							try {
								System.out.print("\nEnter the new Book Price : ");
								price=sm.nextDouble();
								if(price<=0) {
									throw new PriceIsNotValidException("Price is not valid");
								}
							}catch(PriceIsNotValidException e) {
								System.out.println(e.getMessage());
							}
						}while(price<=0);
					}
				}catch(BookNotFoundException e) {
					System.out.println(e.getMessage());
				}
				book=new Book(id,bname,price);
				bookList.set(k,book);
				System.out.println("\nBook Updated");
			}
		}catch(ArrayListIsNullException e) {
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * function to delete a book from arraylist
	 */
	public static void deleteBookList() {
		try {
			if(bookList.size()<1)
			{
				throw new ArrayListIsNullException("ArrayList is null.");
			}
			else {
				int temp=0;
				int k=0;
				int id=0;
				try {
					System.out.print("\nEnter the book id you want to delete : ");
					id=sm.nextInt();

					for(int i=0;i<bookList.size();i++) {
						if(bookList.get(i).getBid()==id) {
							temp=1;
							k=i;
						}
					}
					if(temp==0) {
						throw new BookNotFoundException("\nBook Not Found!!!");
					}
					else {
						bookList.remove(k);

						System.out.println("\nBook Deleted");
					}
				}catch(BookNotFoundException e) {
					System.out.println(e.getMessage());
				}
			}

		}catch(ArrayListIsNullException er) {
			System.out.println(er.getMessage());
		}
	}
	
	/**
	 * main method for execution of program
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c;
		int choice;
		do{
			System.out.print("Enter 1 to Create Book list\n2 to Read the bookList\n3 to Update Book List\n4 to Delete Book List");
			choice=sc.nextInt();
			switch(choice) {
			case 1: createBookList();
			break;
			case 2: readbookList();
			break;
			case 3: updateBookList();
			break;
			case 4: deleteBookList();
				break;
			default: System.out.println("Invalid choice");
			}
			System.out.print("\nDo you want to continue?(y/n)");
			c=sm.next().trim().charAt(0);
		}while(c=='y' || c=='Y');
	}

}
