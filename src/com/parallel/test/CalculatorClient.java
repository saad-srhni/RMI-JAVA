package com.parallel.test;

import java.rmi.Naming;
import java.util.Scanner;

public class CalculatorClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Caclulator c = (Caclulator)Naming.lookup("rmi://localhost:1095/cm");
			Scanner sc= new Scanner(System.in);
			while (true) {
				long x=sc.nextLong();
				long y=sc.nextLong();
				
				System.out.println(c.Sub(x, y));

				System.out.println(c.Add(x, y));

				System.out.println(c.Mul(x, y));

				System.out.println(c.Div(x, y));
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("hello Client Exception  :"+e);
		}
	}

}
