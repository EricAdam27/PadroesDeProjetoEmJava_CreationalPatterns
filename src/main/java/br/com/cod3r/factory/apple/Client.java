package br.com.cod3r.factory.apple;

import br.com.cod3r.factory.apple.factory.IPhone11ProFactory;
import br.com.cod3r.factory.apple.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.factory.IPhoneXFactory;
import br.com.cod3r.factory.apple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {

		IPhoneFactory iPhoneXFactory = new IPhoneXFactory();
		IPhoneFactory iPhone11ProFactory = new IPhone11ProFactory();

		System.out.println("### Ordering an iPhone X");
		IPhone iPhone1 = iPhoneXFactory.orderIPhone();
		System.out.println(iPhone1);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iPhone2 = iPhone11ProFactory.orderIPhone();
		System.out.println(iPhone2);
	}
}
