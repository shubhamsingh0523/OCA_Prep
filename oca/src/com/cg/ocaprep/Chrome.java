package com.cg.ocaprep;

class X{
	void do1() {
		
	}
}
class Y extends X{
	void do2() {
		
	}
}
public class Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X x1=new X();
		X x2=new Y();
		Y y1=new Y();
		((Y)x2).do2();
	}

}
