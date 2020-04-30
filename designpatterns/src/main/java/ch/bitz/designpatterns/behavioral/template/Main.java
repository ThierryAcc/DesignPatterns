package ch.bitz.designpatterns.behavioral.template;

public class Main {

	public static void main(String[] args) {
		Template template = new TemplateImpl();
		template.execute();
	}
}
