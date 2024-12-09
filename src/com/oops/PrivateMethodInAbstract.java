package com.oops;

public abstract class PrivateMethodInAbstract {

	private void fly() { System.out.println("Bird is flying"); }

	public static void main(String[] args) {

		PrivateMethodInAbstract bird = new Pelican();

		bird.fly();

	}

}

class Pelican extends PrivateMethodInAbstract {

	protected void fly() { System.out.println("Pelican is flying"); }

}

