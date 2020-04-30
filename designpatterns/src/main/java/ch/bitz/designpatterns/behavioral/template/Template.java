package ch.bitz.designpatterns.behavioral.template;

public abstract class Template {
	
	// definiere die Reihenfolge
	// aber keine Gedanken über die einzelnen Schritte
	void execute() {
		step1();
		step2();
		step3();
	}
	
	public abstract void step1();
	public abstract void step2();
	public abstract void step3();	
}
