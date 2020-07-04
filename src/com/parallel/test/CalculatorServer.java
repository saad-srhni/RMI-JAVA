package com.parallel.test;

import java.rmi.Naming;

public class CalculatorServer {
	public CalculatorServer() {
		try {
			java.rmi.registry.LocateRegistry.createRegistry(1095);
			CalculatorImpl c = new CalculatorImpl();
			Naming.rebind("rmi://localhost:1095/cm", c);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erreur "+e);
		}
		
	}
public static void main(String args[]) {
	
	new CalculatorServer();
}

}
