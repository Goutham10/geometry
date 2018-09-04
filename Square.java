package geometry;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) 
	{
		while(true)
		{
		Scanner obj=new Scanner(System.in);
		System.out.println(" enter a number ");
		int n=obj.nextInt();
		switch(n)
		{
		case 0 :int p;
				System.out.println(" enter size value of a square");
				int s=obj.nextInt();
				p=4*s;
				System.out.println(p);
				break;
		case 1 :int a;
				System.out.println(" enter the size of a square ");
				int s1=obj.nextInt();
				a=s1*s1;
				System.out.println(a);
				break;
		case 2 :int s2;
				System.out.println("enter perimeter value to find side of square");
				int p1=obj.nextInt();
				s2=p1/4;
				System.out.println(s2);
				break;
		case 3 :int s3;
				System.out.println(" enter perimeter value to find side of square");
				int a1=obj.nextInt();
				s3=(int) Math.sqrt(a1);
				System.out.println(s3);
		}
		}
		
	}

}
