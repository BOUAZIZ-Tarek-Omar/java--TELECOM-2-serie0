package org.tob.model;

import java.math.BigInteger;

public class Factorielle {

	public int intFactorielle(int n) {
		int produit=1;
		for(int i=1;i<=n;i++) {
			produit=produit*i;
		}
		return produit ;
	}
	public double doubleFactorielle(int n) {
		double produit=1;
		for(int i=1;i<=n;i++) {
			produit=produit*i;
		}
		return produit ;
	}
	public BigInteger bigIntFactorielle(int n) {
		BigInteger produit=BigInteger.ONE;
		for(int i=1;i<=n;i++) {
			  // convert int to BigInteger
	        BigInteger bigInteger = BigInteger.valueOf(i);
			produit=produit.multiply(bigInteger);
		}
		return produit ;
	}
}


