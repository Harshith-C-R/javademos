package javademosproject;

public class operations {
	public static void main(String[] args) {
		int a=10;
		int b=30;
		
		//Arthmetic operators
		int res=a+b;
		System.out.println(res);
		res=a-b;
		System.out.println(res);
		res=a%b;
		System.out.println(res);
		res=a*b;
		System.out.println(res);
		res=a/b;
		System.out.println(res);
		
		
		//Unary Operators
		
		a++;
		++a;
		
		//binary operator
		
		if(a==10 && b==20)
		{
			System.out.println("True");
		}
		
		//ternary operator
		int ab=(a>b)?a:b;
		
		
	}

}
