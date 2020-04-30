package ch.bitz.designpatterns.structural.proxy;

public class RealSubject implements Subject {

	@Override
	public void doOps() {
		System.out.println("Real Subject");
	}
	
}
