import java.rmi.*;
import java.rmi.server.*;

public class CalculatorImpl extends UnicastRemoteObject implements CalculatorInterface {
	public CalculatorImpl() throws RemoteException {}

	public int add(int a, int b){
		return a + b;
	}

	public int subtract(int a, int b){
		return a - b;
	}

	public int multiply(int a, int b){
		return a * b;
	}

	public int divide(int a, int b){
		return a / b;
	}

	public static void main(String args[]){
		try{
			CalculatorImpl calc = new CalculatorImpl();
			Naming.rebind("CalcServer", calc);
		} catch(Exception e){
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
	}
}