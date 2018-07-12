package parameterDemo;

public class DynamicCalculatorNonStatic {

	public static void main(String[] args) {
		
		
		DynamicCalculator obj1 = new DynamicCalculator();
		
		int sum = obj1.add(200, 300);
		
		System.out.println("The values are " +sum);
		
		double sub = obj1.sub(20.11, 10.23);
		
		System.out.println("The values are " +sub);
		

	}

}
