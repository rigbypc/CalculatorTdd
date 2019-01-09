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
	
	public Double average() {
		Double total = 0.0;
		
		for (Double value : values) {
			total += value;
		}
		
		return total/(double)values.size();
		
		
	}

}
