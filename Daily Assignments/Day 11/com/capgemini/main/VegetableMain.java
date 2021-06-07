package com.capgemini.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.capgemini.model.Vegetable;
import com.capgemini.service.VegetableManager;

public class VegetableMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		ArrayList<Vegetable> vegetableList = new ArrayList<Vegetable>();
		VegetableManager vm=new VegetableManager();
		char c;
		do
		{
			System.out.println("Enter\n1 for adding a vegetable\n2 for removing a vegetable by id\n3 for updating a vegetable by id\n4 for displaying all the vegetables");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				vegetableList.add(vm.createVegetable());
				break;
			case 2:
				if(vegetableList.size()<1)
				{
					System.out.println("Empty vegetable list!");
				}
				else
				{
					vegetableList=vm.removeVegetableById(vegetableList);
				}
				break;
			case 3:
				if(vegetableList.size()<1)
				{
					System.out.println("Empty vegetable list!");
				}
				else
				{
					vegetableList=vm.updateVegetableById(vegetableList);
				}
				break;
			case 4:
				if(vegetableList.size()<1)
				{
					System.out.println("Empty vegetable list!");
				}
				else
				{
					vm.displayVegetable(vegetableList);
				}
				break;
				default:
					System.out.println("Wrong input!");
			}
			System.out.print("Do you want to continue?(y/n)");
			c=sc.next().charAt(0);
		}while(c=='y');
	}
}
