package com.cg.ocaprep;

class clidder{
	private final void flipper() {
		System.out.println("clidder");
	}
}
public class Clidlet extends clidder{
	
	public final void flipper()
	{
		System.out.println("Clidlet");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Clidlet().flipper();
	}

}
// output :clidlet