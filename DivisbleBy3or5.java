package week1.day1;

public class DivisbleBy3or5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2;
		if (i % 3 == 0 & i % 5 == 0) {
			System.out.println("The Number is TRIZZ FIZZ");
		} else if (i % 5 == 0) {
			System.out.println("The Number is FIZZ");
		}
		else if (i % 3 == 0) {
			System.out.println("The Number is TRIZZ");
		}
		else {
			System.out.println("Not Divisible by 3 or 5");
		}
	}
}
