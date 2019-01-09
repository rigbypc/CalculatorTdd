package calculator;

import java.util.ArrayList;

public class Calculator {

	ArrayList<Double> values;
	
	public Calculator() {
		values = new ArrayList<Double>();
	}
	
	public void add(Double value) {
		values.add(value);
		
	}
	
	public Double average() throws NoElementsException {
		Double total = 0.0;
		
		if(values.isEmpty()) {
			throw new NoElementsException();
		}
		
		for (Double value : values) {
			total += value;
		}
		
		return total/(double)values.size();
		
		
	}

	public Double median() {
		return values.get((int)Math.ceil(values.size()/2));
	}

}
