package parameterDemo;

public class Passpara2 {
	

	public static void main(String[] args) {
		
		
		Passpara2 obj1 = new Passpara2();
		
		int sum = obj1.add(200, 123);
		
		System.out.println("Sum result is " +sum);
		
		double sub = obj1.sub(200.23, 100.32);
		
		System.out.println("Sum result is " +sub);
		
	}
	
	public int add(int a , int b){
		
		int c = a+b;
		
		return c;
				
	}

	
	public double sub(double x , double y){
		
		double z = x-y;
		
		return z;
		
	}
}
