package test;

public class Child extends Parents {

	
	
	@Override
	public int getSum(int array[]) {
		sum = (array[0] * array[1] )+ array[2] + 10;
		
		return sum;
	}
}
