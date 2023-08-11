package abstractiondemo;
public class AbstractionDemo {
	public static void main(String[] args) {
		
		NS160 n1=new NS160();
		n1.start();
		n1.cc();
		
	}

}
abstract class NS {
	void start() {
		System.out.println("The bike has started");
		
	}
	
	abstract void cc();
}

class NS200 extends NS{

	@Override
	void cc() {
		System.out.println("The Bike Has More than 23.5 HS");
		
	}
	
}

class NS160 extends NS{

	@Override
	void cc() {
		System.out.println("The Bike Has less than 20 HS");
		
	}
	
}
