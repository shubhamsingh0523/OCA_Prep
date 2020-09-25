package com.cg.ocaprep;
class Alpha{
	static String s=" ";
	protected Alpha() {
		s+="alpha";
	}
}

class subAlpha extends Alpha{
	private subAlpha() {
		s+="sub";
	}
}
public class SubSubAlpha extends Alpha{
	private SubSubAlpha() {
		s+="subsub";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SubSubAlpha();
		System.out.println(s);
	}

}
