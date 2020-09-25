package com.cg.ocaprep;

public class Electronic implements device{
	
	public void doIt() {
		
	}	

}

abstract class Phone1 extends Electronic{
	
}

abstract class Phone2 extends Electronic{
	public void doIt(int x) {
		
	}	
	
}
abstract class Phone3 extends Electronic implements device{
	public void doStuff() {
		
	}
	
}
interface device{
	public void doIt();
}