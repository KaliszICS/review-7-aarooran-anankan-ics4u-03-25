public class PracticeProblem {

	public static void main(String args[]) {

	}

	//Write your functions here

	public static String evenOrOdd(int num) { //1
		
		String even;
		
		if (num%2 == 0) {
			even = "Even";
		}

		else {
			even = "Odd";
		}

		return even;
	}

	public static String teacherOrStudent(String word) { //2
		
		String teacherOrStudent;

		if (word == "Kalisz") {
			teacherOrStudent = "Teacher";
		}

		else {
			teacherOrStudent = "Student";
		}

		return teacherOrStudent;
	}

	public static int fartherFromZero(int num1) { //3

		int result = 0;

		if (num1 > 0) {
			result = num1 + 5;
		}

		if (num1 < 0) {
			result = num1 - 5;
		}

		return result;
	}

	public static String isFive(int num1) { //4

		String result;

		if (num1 == 5) {
			result = "The number is Five";
		}

		else {
			result = "The number is not Five";
		}

		return result;
	}

	public static String positiveOrNegative(double num1) { //5

		String result;

		if (num1 != 0 && num1 > 0) {
			result = "Positive";
		}

		else {
			result = "Negative";
		}

		return result;
	}

	public static String highOrLow(int num1) { //6
		
		String result;

		if (num1 > 100) {
			result = "High";
		}

		else {
			result = "Low";
		}

		return result;
	}

	public static String isHello(String word) {

		String result;

		if (word == "Hello") {
			result = "The word is Hello";
		}

		else {
			result = "The word is not Hello";
		}

		return result;
	}
}
