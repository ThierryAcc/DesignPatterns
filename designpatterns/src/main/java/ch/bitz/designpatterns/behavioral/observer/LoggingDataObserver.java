package ch.bitz.designpatterns.behavioral.observer;

public class LoggingDataObserver implements DataObserver {

	@Override
	public void changed(int oldInternalValue, int newInternalValue) {
		System.out.println(oldInternalValue + " -> " + newInternalValue);;
	}
}
