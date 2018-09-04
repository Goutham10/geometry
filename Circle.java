package geometry;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) 
	{
		while(true)
		{
		Scanner obj=new Scanner(System.in);
		System.out.println(" enter a number ");
		int n=obj.nextInt();
		switch(n)
		{
		case 0 :int d;
				System.out.println(" enter radius value to find the diameter of a circle");
				int r=obj.nextInt();
				d=2*r;
				System.out.println(d);
				break;
		case 1 :int r1;
				System.out.println(" enter diameter value to find the radius of a circle ");
				int d1=obj.nextInt();
				r1=d1/2;
				System.out.println(r1);
				break;
		case 2 :double c;
				System.out.println("enter radius value to find the circumference of a circle");
				int r2=obj.nextInt();
				c=2*3.14*r2;
				System.out.println(c);
				break;
		case 3 :double c1;
				System.out.println(" enter diameter value to find the circumference of a circle");
				int d2=obj.nextInt();
				c1=3.14*d2;
				System.out.println(c1);
				break;
		case 4 :double r3;
				System.out.println(" enter circumference value to find the radius of a circle");
				int c2=obj.nextInt();
				r3=c2*2*3.14;
				System.out.println(r3);
				break;
		case 5 :double d3;
				System.out.println("enter circumference value to find the radius of a circle");
				int c3=obj.nextInt();
				d3=c3/3.14;
				System.out.println(d3);
				break;
		case 6 :double a;
				System.out.println(" enter the radius to find area of circle");
				int r4=obj.nextInt();
				a=3.14*r4*r4;
				System.out.println(a);
				break;
		case 7 :double r5;
				System.out.println(" enter the area to find radius of circle");
				int a1=obj.nextInt();
				r5=Math.sqrt(a1/3.14);
				System.out.println(r5);
		}
		}
	}
}
