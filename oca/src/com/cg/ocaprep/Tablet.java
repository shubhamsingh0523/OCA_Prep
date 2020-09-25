package com.cg.ocaprep;


interface Gadget{
	void doStuff();
}

abstract class Electronic{
	void getPower()
	{
		System.out.println("plugin");
	}
}
public class Tablet extends Electronic implements Gadget{
	void doStuff()
	{
		System.out.println("show book");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Tablet().getPower();
		new Tablet().doStuff();
	}

}
