package multiinheritance;

public class multipleinheritence {
	public static void main(String[] args) {
		Ns ns=new Ns();
		ns.start();
		
		duke Duk=new duke();
		Duk.start();
		
		baja b=new baja();
		b.start();
	}
}

class Bike{
	void start() {
		System.out.println("The Bike has started");
		
	}
}

class Ns extends Bike{
	void start() {
		System.out.println("NS has started");
	}
}

class duke extends Bike{
	void start() {
		System.out.println("Duke is on the move");
	}
}


interface N{
	default void  start(){
		System.out.println("The NS is on the move ");
	}
	
}

interface D{
	default void start() {
		System.out.println("The Duke is on the move");
	}
}
class baja implements N,D{

	@Override
	public void start() {
		N.super.start();
		D.super.start();
	}
	
}