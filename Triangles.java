package geometry;

public class Triangles {

	public static void main(String[] args) 
	{
		int p;
		int a=2,b=4,c=6;
		p=a+b+c;
		System.out.println("perimeter of  triangle "+p);
		System.out.println();

		int a1,p1=44;
		a1=p1/(b+c);
		System.out.println("the a side is "+a1);
		System.out.println();

		int b1,p2=54;
		b1=p2/(a+c);
		System.out.println("the b side is "+b1);
		System.out.println();

		int c1,p3=42;
		c1=p3/(a+b);
		System.out.println("the c side is "+c1);
		System.out.println();

		int area;
		int b2=5,l=20;
		area=(1/2)*(b2*l);
		System.out.println("area of triangle "+area);
		System.out.println();

		int b3,area1=24;
		b3=(2*area1)/l;
		System.out.println("breath of trianle "+b3);
		System.out.println();

		int l1,area2=46;
		l1=(2*area2)/b3;
		System.out.println("length of trianle"+l1);
		System.out.println();

		System.out.println();
		System.out.println("Phythogorean theorem ");
		int q=2,w=3;
		double e;
		e=Math.sqrt((q*q)+(w*w));
		System.out.println(e);
		
	}

}
