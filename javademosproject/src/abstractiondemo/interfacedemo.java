package abstractiondemo;

public class interfacedemo {
	
	public static void main(String[] args) {
		tata c1=new tata();
		honda c2=new honda();
		c1.go();
		c1.stop();
		c2.go();
		c2.stop();
		
	}

}
interface car{
	void go();
	void stop();
}

class honda implements car{

	@Override
	public void go() {
		System.out.println("Inside honda go()....");
		
	}

	@Override
	public void stop() {
		System.out.println("Inside honda stop().....");
		
	}
	
}

class tata implements car{

	@Override
	public void go() {
		System.out.println("Inside tata go().....");		
	}

	@Override
	public void stop() {
		System.out.println("Inside tata stop().....");
		
	}
	
}