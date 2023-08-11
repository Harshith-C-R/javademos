package inheritance;

public class constructorchainingdemo {
	public static void main(String[] args) {
		
		child c2=new child(10,20);
		child c1=new child(10);
	}
		
	}
	
	class parent{
		int a,b;
		parent(){
			System.out.println("NThere is no argument");
		}
		parent(int a){
			this.a=a;
			System.out.println("One argument constructor"+this.a);
						
		}
		parent(int a,int b){
			this.a=a;
			this.b=b;
			System.out.println("Two Argument Constructor "+this.a+"\t"+this.b);
		}
	}
	
	class child extends parent{
		int x,y;
		child(){
			super();
			System.out.println("No argument child class");
	}
		child(int x){
			super(x);
			this.x=x;
			System.out.println("One argument child class"+this.x);
		}
		child(int x,int y){
			super(x,y);
			this.x=x;
			this.y=y;
			System.out.println("Twoi argument child class "+this.x+"\t"+this.y);
					
		}
}
