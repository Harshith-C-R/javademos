package inheritance;
public class jdkdemo {
public static void main(String[] args) {
	JDK7 jdk=new JDK7();
	
	System.out.println(jdk.a);
	
	
}
}

class JDK5{
	int a=8;
	JDK5(){
		System.out.println("Installing JDK5");
	}
}

class JDK6 extends JDK5{
	JDK6(){
		System.out.println("Installing JDK6");
	}
}

class JDK7 extends JDK6{
	JDK7(){
		System.out.println("Installing JDK5");
	}
}