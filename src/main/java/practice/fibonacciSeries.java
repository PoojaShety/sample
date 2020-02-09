package practice;

public class fibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a=0;
		long b =1;
		System.out.println(a);
		System.out.println(b);
		long c;
		for(int i=2;i<100;i++)
		{
			c=a+b;
			System.out.println("fibonacci of"+i+"="+c);
			a=b;
			b=c;
		}
	}

}
