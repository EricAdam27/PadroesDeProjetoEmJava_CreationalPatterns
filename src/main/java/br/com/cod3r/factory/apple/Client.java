package br.com.cod3r.factory.apple;

import br.com.cod3r.factory.apple.factory.IPhone11Factory;
import br.com.cod3r.factory.apple.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.factory.IPhoneXFactory;
import br.com.cod3r.factory.apple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {

		IPhoneFactory genXFactory = new IPhoneXFactory();
		IPhoneFactory gen11Factory = new IPhone11Factory();

		System.out.println("### Ordering an iPhone X");
		IPhone iPhone1 = genXFactory.orderIPhone("standard");
		System.out.println(iPhone1);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iPhone2 = gen11Factory.orderIPhone("highEnd");
		System.out.println(iPhone2);
	}
}
