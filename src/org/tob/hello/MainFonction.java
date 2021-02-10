package org.tob.hello;

import org.tob.model.Factorielle;

public class MainFonction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorielle fact = new Factorielle() ;
		int i=25;
		System.out.println("(int )Factorielle de "+ i+"="+ fact.intFactorielle(i)) ;
		System.out.println("(double )Factorielle de "+ i+"="+ fact.doubleFactorielle(i)) ;
		System.out.println("(BigInt )Factorielle de "+ i+"="+ fact.bigIntFactorielle(i)) ;
	}

}
