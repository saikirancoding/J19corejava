package com.menudriver;

import java.util.Scanner;

class DemoMenuDriven
{
	private int num, exp;
	Scanner sc = new Scanner(System.in);
	
	public void input()
	{
		System.out.println("enter number : ");
		num = sc.nextInt();
		
		System.out.println("enter exponential : ");
		exp = sc.nextInt();
			
	}
	
	public int power()
	{
		int result = 1;
		for(int i = 1; i<exp ; i++)
			result *= num;
			
		return result;
		//System.out.println("Power of a Number : "+result);
		
	}
}


public class DemoMenu {

	public static void main(String[] args) {

		int ch;
		String sa;
		
		DemoMenuDriven ob = new DemoMenuDriven();
		
		Scanner sca = new Scanner(System.in);
		
		
		do{
			System.out.println("1. Call Input Function : ");
			System.out.println("2. call Power FUnction : ");
			
			System.out.println("Enter Your Choice : ");
		 	ch = sca.nextInt();
		 	
			 	MenuDriven md = new MenuDriven();
			 	switch(ch)
			 	{
			 		case 1: 
			 			//System.out.println("Input : \n");
			 				ob.input();
				 		break;
			 		case 2 :
			 			//System.out.println("Power : \n");
			 			int p = ob.power();	//if method type is integer
			 			System.out.println("Power is "+p);
				 			//	ob.power();
			 				//ob.input();
				 			
			 			break;
			 		default:
						System.out.println("Wrong Choice : ");
			 	}	
						System.out.println("Do You Want To Continue : 'y' or 'n' ");
						sa = sca.next();
						
			 	
		}while(sa.equals("y"));
			System.out.println("Program Exit ");
	}

}
