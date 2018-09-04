package geometry;

import java.util.Scanner;

public class Rectangle {

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
				System.out.println(" enter the width size and length size of a rectangle");
				int w=obj.nextInt();
				int l=obj.nextInt();
				p=2*w+2*l;
				System.out.println(p);
				break;
		case 1 :int a;
				System.out.println(" enter the width size and length size of a rectangle ");
				int w1=obj.nextInt();
				int l1=obj.nextInt();
				a=w1*l1;
				System.out.println(a);
				break;
		case 2 :int w2;
				System.out.println("enter perimeter value and length value to find width side of rectangle");
				int p1=obj.nextInt();
				int l2=obj.nextInt();
				w2=(p1-(2*l2))/2;
				System.out.println(w2);
				break;
		case 3 :int l3;
				System.out.println(" enter perimeter value and width value to find length of rectangle");
				int p2=obj.nextInt();
				int w3=obj.nextInt();
				l3=(p2-(2*w3))/2;
				System.out.println(l3);
				break;
		case 4 :int l4;
				System.out.println("enter the area value and width value to find length");
				int a1=obj.nextInt();
				int w4=obj.nextInt();
				l4=a1/w4;
				System.out.println(l4);
				break;
		case 5 :int w5;
				System.out.println("enter the area value and length value to find width ");
				int a2=obj.nextInt();
				int l5=obj.nextInt();
				w5=a2/l5;
				System.out.println(w5);
		}
		}
	}

}
