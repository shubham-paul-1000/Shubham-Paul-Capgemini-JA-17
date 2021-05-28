import java.util.Scanner;
public class MainProduct {
	public static Product[] createProduct()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no. of products:");
		int n=sc.nextInt();
		Product p[]=new Product[n];
		int i;
		String s;
		Double d;
		for(i=0;i<n;i++)
		{
			p[i]=new Product();
			System.out.println("Enter the product name and price of product no."+i+":");
			s=sc.next();
			d=sc.nextDouble();
			p[i].setProductName(s);
			p[i].setProductPrice(d);
			p[i].setProductID(p[i].hashCode());
		}
		sc.close();
		return p;
	}
	public static void updateProductById(Product p[],int id)
	{
		Scanner sc=new Scanner(System.in);
		if(p.length<1)
		{
			System.out.println("Product List is empty!!!");
			return;
		}
		String s;
		Double d;
		for(int i=0;i<p.length;i++)
		{
			if(p[i].getProductID()==id)
			{
				System.out.println("Enter the new product name and price");
				s=sc.nextLine();
				d=sc.nextDouble();
				p[i].setProductName(s);
				p[i].setProductPrice(d);
				System.out.println("Product updated!!!");
				return;
			}
		}
		System.out.println("Product not found!!!");
		sc.close();
	}
	public static Product[] deleteProductById(Product p[],int id)
	{
		Scanner sc=new Scanner(System.in);
		int i,j;
		if(p.length<1)
		{
			System.out.println("Product List is empty!!!");
			return p;
		}
		for(i=0;i<p.length;i++)
		{
			if(p[i].getProductID()==id)
			{
				for(j=i;j<p.length-1;j++)
				{
					p[j]=p[j+1];
				}
				break;
			}
		}
		Product[]pnew=new Product[p.length-1];
		for(i=0;i<pnew.length;i++)
		{
			pnew[i]=p[i];
		}
		return pnew;
	}
	public static void displayAllProduct(Product p[])
	{
		if(p.length<1)
		{
			System.out.println("Product List is empty!!!");
			return;
		}
		System.out.println("\t\t\tProducts");
		System.out.println("\tId\tName\tPrice");
		System.out.println("________________________");
		System.out.println();
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i].getProductID()+"\t"+p[i].getProductName()+"\t"+p[i].getProductPrice());
		}
	}
	public static void displayProductById(Product p[],int id)
	{
		if(p.length<1)
		{
			System.out.println("Product List is empty!!!");
			return;
		}
		for(int i=0;i<p.length;i++)
		{
			if(p[i].getProductID()==id)
			{
				System.out.println("Product Id\tProduct Name\tPrice");
				System.out.println(p[i].getProductID()+"\t"+p[i].getProductName()+"\t"+p[i].getProductPrice());
				return;
			}
		}
		System.out.println("Product Not Found!!!");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int id;
		int choice;
		Product p[]=new Product[0];
		do
		{
			System.out.println("Enter\n1 for creating new product list\n2 for updating product by id\n3 for deleting product by id\n4 for displaying all the products\n5 for displaying product by id\n6 to exit");
			choice=sc.nextInt();
			if(choice==1)
				p=createProduct();
			else if(choice==2)
			{
				System.out.print("Enter the product id to be updated:");
				id=sc.nextInt();
				updateProductById(p,id);
			}
			else if(choice==3)
			{
				System.out.print("Enter the product id to be deleted:");
				id=sc.nextInt();
				p=deleteProductById(p,id);
			}
			else if(choice==4)
			{
				displayAllProduct(p);
			}
			else if(choice==5)
			{
				System.out.print("Enter the product id to be displayed:");
				id=sc.nextInt();
				displayProductById(p,id);
			}
			else if(choice==6);
			else
				System.out.println("Invalid choice!!!");
		}while(choice!=6);
	}
}
