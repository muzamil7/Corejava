package conditionalst;

public class IfelseDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		System.out.println("Test Started");
		
		String browser = "Chr";
		
		if(browser.equalsIgnoreCase("Firefox"))
		
		{
			System.out.println("TC executed on Firefox");
		}
		else if(browser.equalsIgnoreCase("Chrome"))
		{
			System.out.println("TC executed on chrome");
		}
		else if (browser.equalsIgnoreCase("IE"))
		{
			System.out.println("TC executed on IE");
		}
		
		else
		{
		System.out.println("Can you provide the browsers name");
		}
		
		System.out.println("Test End");
	}

}
