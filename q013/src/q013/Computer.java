package q013;

public class Computer {
	
	int sum2(int ... values) {
		int sum = 0;
		for(int value : values) {
			sum += value;
		}		
		return sum;
	}
	
	
}
