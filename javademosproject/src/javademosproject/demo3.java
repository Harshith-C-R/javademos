package javademosproject;

public class demo3 {
	public static void main(String[] args) {
		 System.out.println("From the main block");
		 method1();
		 method2();
		 demo3 d3=new demo3();
		 d3.method3();
		 
		 }
	 static void method1() {
		 System.out.println("From the static block1");
		 
	 }
	 static void method2() {
		 System.out.println("From the static block2");
		 
	 }
	 void method3() {
		 System.out.println("From the static block3");
		 
	 }
	 
}
