package com.capgemini.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import com.capgemini.model.Vegetable;
public class VegetableManager {
	Scanner sc=new Scanner(System.in);
	public Vegetable createVegetable()
	{
		System.out.print("Enter vegetable id:");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter vegetable name:");
		String name=sc.nextLine();
		System.out.print("Enter the vegetable price:");
		double price=sc.nextDouble();
		Vegetable v=new Vegetable(id,name,price);
		return v;
	}
	public ArrayList<Vegetable> removeVegetableById(ArrayList<Vegetable> vegList)
	{
		System.out.print("Enter the id of the vegetable to be removed:");
		int id=sc.nextInt();
		Iterator<Vegetable> iter=vegList.iterator();
		Vegetable v;
		while(iter.hasNext())
		{
			v=iter.next();
			if(v.getVegId()==id)
			{
				vegList.remove(v);
				return vegList;
			}
		}
		System.out.println("Vegetable not found!");
		return vegList;
	}
	public ArrayList<Vegetable> updateVegetableById(ArrayList<Vegetable> vegList)
	{
		System.out.print("Enter the id of the vegetable to be updated:");
		int id=sc.nextInt();
		Iterator<Vegetable> iter=vegList.iterator();
		Vegetable v;
		while(iter.hasNext())
		{
			v=iter.next();
			if(v.getVegId()==id)
			{
				int i=vegList.indexOf(v);
				sc.nextLine();
				System.out.print("Enter new vegetable name:");
				String name=sc.nextLine();
				System.out.print("Enter the new vegetable price:");
				double price=sc.nextDouble();
				v.setVegName(name);
				v.setVegPrice(price);
				vegList.set(i,v);
				return vegList;
			}
		}
		System.out.println("Vegetable not found!");
		return vegList;
	}
	public void displayVegetable(ArrayList<Vegetable> vegList)
	{
		Iterator<Vegetable> iter=vegList.iterator();
		while(iter.hasNext())
		{
			iter.next().toString();
		}
	}
}
