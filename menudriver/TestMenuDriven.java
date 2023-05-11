package com.menudriver;

import java.util.Scanner;

public class TestMenuDriven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ch;
		String s;
		
		do{
			System.out.println("1. Call Input Function : ");
			System.out.println("2. Call power Function : ");
			
			System.out.println("Enter Your Choice : ");
			ch = sc.nextInt();
			
			switch(ch)
			{
				case 1 :
					System.out.println("Input");
					break;
				case 2 :
					System.out.println("Power");
					break;
				default:
					System.out.println("Wrong Choice : ");
			}
			System.out.println("Do You Want To Continue : 'y' or 'n' ");
			s = sc.next();
		}
		while(s.equals("y"));
		System.out.println("Program Exit ");
	}

}
