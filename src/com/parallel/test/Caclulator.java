package com.parallel.test;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Caclulator extends Remote {
	
	public long Add (long a , long b )throws RemoteException;

	public long Sub (long a , long b )throws RemoteException;

	public long Mul (long a , long b )throws RemoteException;

	public long Div (long a , long b )throws RemoteException;
	
	public int[] tri (int[] tab)throws RemoteException;

}
