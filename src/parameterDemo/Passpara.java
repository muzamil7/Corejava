package parameterDemo;

public class Passpara {
	

	public static void main(String[] args) {
		
		
		Passpara obj1 = new Passpara();
		
		obj1.add(100, 200);
		
		obj1.sub(200.3, 11.1);
		
	}
	
	public void add(int a , int b){
		
		int c = a+b;
		
		System.out.println("Add result is " +c);		
	}

	
	public void sub(double x , double y){
		
		double z = x-y;
		
		System.out.println("Sub result is " +z);
	}
}
