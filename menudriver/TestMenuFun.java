package com.menudriver;

import java.util.Scanner;

 class MenuDriven
{
	int inum1 , inum2;
	double res;
	Scanner sc = new Scanner(System.in);
	
	void  input()
	{
		System.out.println("Enter Number  : ");
			inum1 = sc.nextInt();
		
		System.out.println("Enter  Expo : ");
			inum2 = sc.nextInt();
			//return inum1;
			
	}
	
	double disp()
	{
		 res = Math.pow(inum1, inum2);
		return res ; 
	}
}




public class TestMenuFun {

	public static void main(String[] args) {
		
		Scanner ss = new Scanner(System.in);
		int ch;
		String s;
		
		do{
				System.out.println("1. Call Input Function : ");
				System.out.println("2. call Power FUnction : ");
				
				System.out.println("Enter Your Choice : ");
				 	ch = ss.nextInt();
				 	MenuDriven md = new MenuDriven();
				 	switch(ch)
				 	{
				 		case 1: 
				 			System.out.println("Input : \n");
				 			md.input();
					 	//int i  =	md.input();
					 //	System.out.println(i);
					 		break;
				 		case 2 :
				 			System.out.println("Power : \n");
				 			//md.input();
				 			double d = md.disp();
				 			System.out.println("Power is : "+d);
				 			break;
				 		default:
							System.out.println("Wrong Choice : ");
					 			
				 	}
				 	System.out.println("Do You Want To Continue : 'y' or 'n' ");
					s = ss.next();
		}
		while(s.equals("y"));
		System.out.println("Program Exit ");
	}

}
