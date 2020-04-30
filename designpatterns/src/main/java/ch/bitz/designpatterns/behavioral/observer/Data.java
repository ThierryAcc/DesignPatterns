package ch.bitz.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

// Benachrichtigung bei Änderungen
public class Data {
	
	// who is interested?
	List<DataObserver> observers = new ArrayList<>();
	
	public void setObserver(DataObserver observer) {
		
	}

	static int oldInternalValue = 0;
	int internalValue = 0;

	public int getInternalValue() {
		return internalValue;
	}

	public void setInternalValue(int internalValue) {
		int oldInternalValue = this.internalValue;
		this.internalValue = internalValue;
		observers.stream().forEach(o -> o.changed(oldInternalValue, internalValue));
	}
	
	public void addObserver(DataObserver observer) {
		observers.add(observer); 
	}
	
	
	
	// ugly
	public static void checkData(Data data) {
		if(oldInternalValue != data.getInternalValue()) {
			System.out.println(data.getInternalValue());
			oldInternalValue = data.getInternalValue();
		}
	}
	
	public static void main(String[] args) {
		Data data = new Data();
		data.addObserver(new LoggingDataObserver());
		data.addObserver(new LoggingDataObserver());
		
		data.setInternalValue(123);
		data.setInternalValue(333);
		
//		checkData(data);
//		checkData(data);
//		data.setInternalValue(10);
//		
//		
//		checkData(data);
//		data.setInternalValue(14);
//		data.setInternalValue(15);
//		checkData(data);
//		
		
	}
}
;