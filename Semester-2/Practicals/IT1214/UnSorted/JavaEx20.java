/*
	Date:
	Practical Number: 20
	Problem Specification: Find the sum of natural numbers from 1 to 1000
*/

class JavaEx20{
	public static void main(String[] args){

		int sum = 0;

		for(int i=1; i<=1000; i++){
			sum += i;
		}
		System.out.println("Sum: "+ sum);
	}
}