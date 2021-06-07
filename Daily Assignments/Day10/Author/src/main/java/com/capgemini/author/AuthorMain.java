package com.capgemini.author;

import java.util.Scanner;

import com.capgemini.author.model.Author;

public class AuthorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sm=new Scanner(System.in);
		System.out.print("\nEnter the name:");
		String name=sm.next();
		System.out.print("\nEnter the email:");
		String email=sm.next();
		System.out.print("\nEnter the gender:");
		char gender=sm.next().trim().charAt(0);
		Author a=new Author(name,email,gender);
		a.print();
	}

}
