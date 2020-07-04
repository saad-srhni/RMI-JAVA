package com.parallel.test;

import java.rmi.Naming;
import java.util.Scanner;

public class TabClient {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Caclulator c = (Caclulator)Naming.lookup("rmi://localhost:1095/cm");
			Scanner sc= new Scanner(System.in);
			int tab[]=new int[5];
			System.out.println("donner les element de tab");
			for (int i = 0; i < tab.length; i++) {
				int x=sc.nextInt();
				tab[i]=x;
			}
			for (int i : c.tri(tab)) {
				System.out.print(i+" ");
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("hello Client Exception  :"+e);
		}
	}


}
