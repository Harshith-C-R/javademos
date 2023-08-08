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
}
}
