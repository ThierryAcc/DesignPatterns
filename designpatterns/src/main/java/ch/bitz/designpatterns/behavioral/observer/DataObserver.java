package ch.bitz.designpatterns.behavioral.observer;

public interface DataObserver {
	void changed(int oldInternalValue, int newInternalValue);
}
