import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
public class MainFlower {
	static HashSet<Flower> flowers = new HashSet<Flower>();
	static Iterator<Flower> fitr = flowers.iterator();
	static Scanner sc=new Scanner(System.in);
	public static void addFlowers(int n)
	{
		int i,fid;
		String fname;
		double pricePerKg,qty;
		Flower f;
		for(i=1;i<=n;i++)
		{
			System.out.println("Enter the details for flower no."+i);
			System.out.print("Enter the Flower ID:");
			fid=sc.nextInt();
			System.out.print("Enter the Flower name:");
			sc.nextLine();
			fname=sc.nextLine();
			System.out.print("Enter the Price per kg:");
			pricePerKg=sc.nextDouble();
			System.out.print("Enter the Flower quantity:");
			qty=sc.nextDouble();
			f= new Flower(fid,fname,pricePerKg,qty);
			flowers.add(f);
		}
	}
	public static void updateFlower(int id)
	{
		String fname;
		double pricePerKg,qty;
		Flower f,fnew;
		while(fitr.hasNext())
		{
			f=fitr.next();
			if(f.getFid()==id)
			{
				System.out.println("Enter the new details of the flower");
				System.out.print("Enter the Flower name:");
				fname=sc.nextLine();
				System.out.print("Enter the Price per kg:");
				pricePerKg=sc.nextDouble();
				System.out.print("Enter the Flower quantity:");
				qty=sc.nextDouble();
				fnew= new Flower(id,fname,pricePerKg,qty);
				flowers.remove(f);
				flowers.add(fnew);
				flowers.iterator();
				return;
			}
		}
		flowers.iterator();
		System.out.println("Flower couldn't be found!");
	}
	public static void removeFlower(int id)
	{
		Flower f;
		while(fitr.hasNext())
		{
			f=fitr.next();
			if(f.getFid()==id)
			{
				flowers.remove(f);
				flowers.iterator();
				return;
			}
		}
		flowers.iterator();
		System.out.println("Flower couldn't be found!");
	}
	public static void displayFlowers()
	{
		int i=1;
		Flower f;
		while(fitr.hasNext())
		{
			f=fitr.next();
			System.out.println(f.toString(i++));
		}
		fitr=flowers.iterator();
	}
	public static void main(String[] args) {
		int n;
		char c;
		int choice;
		do
		{
			System.out.println("Enter\n1 for adding flowers to the list\n2 for updating flower details\n3 for removing flower from the list\n4 for displaying the flower list");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.print("Enter the no. of flowers to be added:");
					n=sc.nextInt();
					if(n<1)
					{
						System.out.println("Enter a valid amount!");
					}
					else
					{
						addFlowers(n);
					}
					break;
				case 2:
					if(flowers.size()<1)
					{
						System.out.println("Empty list, can't update flowers!");
					}
					else
					{
						System.out.print("Enter the id of the flower to be updated:");
						n=sc.nextInt();
						updateFlower(n);
					}
					break;
				case 3:
					if(flowers.size()<1)
					{
						System.out.println("Empty list, can't remove flowers!");
					}
					else
					{
						System.out.print("Enter the id of the flower to be removed:");
						n=sc.nextInt();
						removeFlower(n);
					}
					break;
				case 4:
					if(flowers.size()<1)
					{
						System.out.println("Empty list, can't display flowers!");
					}
					else
					{
						displayFlowers();
					}
					break;
				default:
					System.out.println("Wrong choice!");
			}
			System.out.println("Do you want to continue?(y/n)");
			c=sc.next().trim().charAt(0);
		}while(c=='y'||c=='Y');
		sc.close();
	}

}
