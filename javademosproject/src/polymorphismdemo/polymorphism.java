package polymorphismdemo;

public class polymorphism {
public static void main(String[] args) {
	sum s=new sum();
	s.add(10, 20);
	s.add(2.44f,3.65f);
	s.add(10,20,20);
}
}

class sum{
	
	
	void add(int a,int b) {
	int	res=a+b;
	System.out.println("The sum of 2 integers = "+res);	
	}
	
	void add(float a, float b) {
		float res=a+b;
		System.out.println("The sum of 2 floating point numbers = "+res);
	}
	
	void add(int a,int b,int c) {
		int	res=a+b+c;
		System.out.println("The sum of 3 integers = "+res);	
		}
}