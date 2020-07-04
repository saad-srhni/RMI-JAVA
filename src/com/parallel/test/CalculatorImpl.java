package com.parallel.test;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImpl extends UnicastRemoteObject implements Caclulator {

	protected CalculatorImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public long Add(long a, long b) throws RemoteException {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public long Sub(long a, long b) throws RemoteException {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public long Mul(long a, long b) throws RemoteException {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public long Div(long a, long b) throws RemoteException {
		// TODO Auto-generated method stub
		if (b!=0) {
			return a/b;
			
		}else {
			return a ;
			
		}
	}

	@Override
	public int[] tri(int[] tab) throws RemoteException {
		for (int i = 0; i < tab.length; i++) {
			for (int j = i+1; j < tab.length; j++) {
				if (tab[i]<=tab[j]) {
					int k=tab[j];
					tab[j]=tab[i];
					tab[i]=k;
				}
			}
		}
		return tab;
	}
	

}
