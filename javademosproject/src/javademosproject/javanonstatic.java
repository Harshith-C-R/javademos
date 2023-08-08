package javademosproject;

public class javanonstatic {
public javanonstatic(){
	System.out.println("From the constructor");
	
}
{
	System.out.println("From the non static block");
}

public static void main(String[] args) {
	System.out.println("From inside the block");
	javanonstatic jns=new javanonstatic();
	//Every time new object is delclared the non static class and the constructor will be called again
	javanonstatic jns1=new javanonstatic();
	
	//Calling from different Class
	
	car car1=new car();
	System.out.println(car1.no);
	System.out.println(car1.color);
	
	car car2=new car();
	car2.color="Red";
	car2.no=8665;

	System.out.println(car2.color+"\n"+car2.no);
}

 }

