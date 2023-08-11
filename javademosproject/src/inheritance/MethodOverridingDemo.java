package inheritance;

public class MethodOverridingDemo {
	public static void main(String[] args) {
		
	
	car car1=new car(1,2);
	car1.fuel();
	
	bike b1=new bike(1,3);
	b1.fuel();
	
	bus bu1=new bus(1,19);
	bu1.fuel();
	
	
	
	}
}

class vehicle{
	int a,b;
	vehicle(int a, int b){
		this.a=a;
		this.b=b;
		
	}
	void fuel() {
		System.out.println("Petrol");
	}
	
}

class bus extends vehicle{
	int c, d;
	bus(int c,int d){
		super(c,d);
		this.c=c;
		this.d=d;
	}
	void fuel() {
		super.fuel();
		System.out.println("Diesel");
	}
}
class car extends vehicle{

	car(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	
}
class bike extends vehicle{

	bike(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	
}