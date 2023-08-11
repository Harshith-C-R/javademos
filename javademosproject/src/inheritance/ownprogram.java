package inheritance;

public class ownprogram {
	public static void main(String[] args) {
		//Car c=new Car();
			
		
	}
	public class vehicle{
		
		int noft;
	}
	
	public class Car extends vehicle{
		int no;
		Car(){
		System.out.println("It is the car");
		}
	}
	public class lorry extends Car{
		int n;
		
		
	}
}
