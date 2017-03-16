import java.rmi.*;

public class CalculatorClient {
	public static void main(String []args){
		//System.setSecurityManager(new RMISecurityManager());

		try{
			CalculatorInterface obj = (CalculatorInterface) Naming.lookup("//" + "localhost" + "/CalcServer");
			System.out.println("10 + 5 equals " + obj.add(10, 5));
			System.out.println("10 - 5 equals " + obj.subtract(10, 5));
			System.out.println("10 * 5 equals " + obj.multiply(10, 5));
			System.out.println("10 / 5 equals " + obj.divide(10, 5));
		} catch(Exception e){
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
	}
}