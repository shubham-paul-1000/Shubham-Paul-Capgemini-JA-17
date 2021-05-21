import java.util.Scanner;

public class MainLibrary {
	public static void bookSection() {
		Scanner sc=new Scanner(System.in);
		int identificationNumber;
		String title;
		int numberOfCopies;
		String author;
		int choice;
		char c=' ';
		System.out.print("Enter the id number of the Book:");
		identificationNumber=sc.nextInt();
		System.out.print("Enter the title of the Book:");
		sc.nextLine();
		title=sc.nextLine();
		System.out.print("Enter the number of copies of the Book:");
		numberOfCopies=sc.nextInt();
		System.out.print("Enter the author of the Book:");
		sc.nextLine();
		author=sc.nextLine();
		Book b = new Book(identificationNumber,title,numberOfCopies,author);
		do{
			System.out.println("Enter\n1 for Check In\n2 for Check Out\n3 for Add Item");
			choice=sc.nextInt();
			switch(choice) {
				case 1: b.checkIn();
						b.print();
						break;
				case 2: b.checkOut();
						b.print();
						break;
				case 3: b.addItem();
						b.print();
						break;
				default: System.out.println("Invalid Choice");
			}
			System.out.print("Do you want to continue?(y/n)");
			sc.nextLine();
			c=sc.next().charAt(0);
		}while(c=='y'||c=='Y');
		sc.close();
	}
	public static void journalPaperSection() {
		Scanner sc=new Scanner(System.in);
		int identificationNumber;
		String title;
		int numberOfCopies;
		String author;
		int year;
		int choice;
		char c=' ';
		System.out.print("Enter the id number of the Journal Paper:");
		identificationNumber=sc.nextInt();
		System.out.print("Enter the title of the Journal Paper:");
		sc.nextLine();
		title=sc.nextLine();
		System.out.print("Enter the number of copies of the Journal Paper:");
		numberOfCopies=sc.nextInt();
		System.out.print("Enter the author of the Journal Paper:");
		sc.nextLine();
		author=sc.nextLine();
		System.out.print("Enter the year of publish of the Journal Paper:");
		year=sc.nextInt();
		
		JournalPaper jp = new JournalPaper(identificationNumber,title,numberOfCopies,author,year);
		
		do{
			
			System.out.println("Enter\n1 for Check In\n2 for Check Out\n3 for Add Item");
			choice=sc.nextInt();
			switch(choice) {
				case 1: jp.checkIn();
						jp.print();
						break;
				case 2: jp.checkOut();
						jp.print();
						break;
				case 3: jp.addItem();
						jp.print();
						break;
				default: System.out.println("Invalid Choice");
			}
			System.out.print("Do you want to continue?(y/n)");
			sc.nextLine();
			c=sc.next().charAt(0);
		}while(c=='y'||c=='Y');
		sc.close();
	}
	public static void writtenItemSection() {
		Scanner sc=new Scanner(System.in);
		int choice;
			System.out.println("Enter\n1 for Book\n2 for Journal Paper");
			choice=sc.nextInt();
			switch(choice) {
				case 1:
					bookSection();
					break;
				case 2:
					journalPaperSection();
					break;
				default:System.out.println("Invalid Choice");
			}
		sc.close();
	}
	public static void videoSection() {
		Scanner sc=new Scanner(System.in);
		int identificationNumber;
		String title;
		int numberOfCopies;
		int runtime;
		String director;
		String genre;
		int year;
		int choice;
		char c=' ';
		System.out.print("Enter the id number of the Video:");
		identificationNumber=sc.nextInt();
		System.out.print("Enter the title of the Video:");
		sc.nextLine();
		title=sc.nextLine();
		System.out.print("Enter the number of copies of the Video:");
		numberOfCopies=sc.nextInt();
		System.out.print("Enter the runtime of the Video:");
		runtime=sc.nextInt();
		System.out.print("Enter the director of the Video:");
		sc.nextLine();
		director=sc.nextLine();
		System.out.print("Enter the genre of the Video:");
		//sc.nextLine();
		genre=sc.nextLine();
		System.out.print("Enter the year of publish of the Video:");
		year=sc.nextInt();
		Video video = new Video(identificationNumber,title,numberOfCopies,runtime,director,genre,year);
		do{
			System.out.println("Enter\n1 for Check In\n2 for Check Out\n3 for Add Item");
			choice=sc.nextInt();
			switch(choice) {
				case 1: video.checkIn();
						video.print();
						break;
				case 2: video.checkOut();
						video.print();
						break;
				case 3: video.addItem();
						video.print();
						break;
				default: System.out.println("Invalid Choice");
			}
			System.out.print("Do you want to continue?(y/n)");
			sc.nextLine();
			c=sc.next().charAt(0);
		}while(c=='y'||c=='Y');
		sc.close();
	}
	public static void cdSection() {
		Scanner sc=new Scanner(System.in);
		int identificationNumber;
		String title;
		int numberOfCopies;
		int runtime;
		String artist;
		String genre;
		int choice;
		char c=' ';
		System.out.print("Enter the id number of the CD:");
		identificationNumber=sc.nextInt();
		System.out.print("Enter the title of the CD:");
		sc.nextLine();
		title=sc.nextLine();
		System.out.print("Enter the number of copies of the CD:");
		numberOfCopies=sc.nextInt();
		System.out.print("Enter the runtime of the CD:");
		runtime=sc.nextInt();
		System.out.print("Enter the artist of the CD:");
		sc.nextLine();
		artist=sc.nextLine();
		System.out.print("Enter the genre of the Video:");
		//sc.nextLine();
		genre=sc.nextLine();
		
		CD video = new CD(identificationNumber,title,numberOfCopies,runtime,artist,genre);
		
		do{
			System.out.println("Enter\n1 for Check In\n2 for Check Out\n3 for Add Item");
			choice=sc.nextInt();
			switch(choice) {
				case 1: video.checkIn();
						video.print();
						break;
				case 2: video.checkOut();
						video.print();
						break;
				case 3: video.addItem();
						video.print();
						break;
				default: System.out.println("Invalid Choice");
			}
			System.out.print("Do you want to continue?(y/n)");
			sc.nextLine();
			c=sc.next().charAt(0);
		}while(c=='y'||c=='Y');
		sc.close();
	}
	public static void mediaItemSection() {
		Scanner sc=new Scanner(System.in);
		int choice;
			System.out.println("Enter\n1 for Video\n2 for CD");
			choice=sc.nextInt();
			switch(choice) {
				case 1:
					videoSection();
					break;
				case 2:
					cdSection();
					break;
				default:System.out.println("Invalid Choice");
			}
			
		sc.close();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("Enter\n1 for Written Items\n2 for Media Items");
		choice=sc.nextInt();
		switch(choice) {
			case 1:
				writtenItemSection();
				break;
			case 2:
				mediaItemSection();
				break;
				default: System.out.println("Invalid Choice");
			}
		sc.close();
	}
}