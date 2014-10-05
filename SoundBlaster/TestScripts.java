
public class TestScripts {

	public static void main(String[] args) {
		double[] test = new double[33];
		for (int i = 0; i < test.length; i++) {
			test[i] = i;
		}
		for (int i = 0; i < test.length; i++) {
			System.out.print(test[i] + " ");
		}
		System.out.println();
		
		DStack arrayTest = new ArrayStack();
		DStack listTest = new ListStack();
		
		fill(arrayTest, test, "ArrayStack");
		fill(arrayTest, test, "ArrayStack 2");
		fill(listTest, test, "ListStack");
		fill(listTest, test, "ListStack 2");
	}
	
	public static void fill(DStack input, double[] test, String print) {
		System.out.println(print);
		for (int i = 0; i < test.length; i++) {
			input.push(test[i]);
		}
		System.out.println("filled");
		System.out.println(input.peek());
		if (input.isEmpty()) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		while (!input.isEmpty()) {
			double x = input.pop();
			System.out.print(x + " ");
		}
		System.out.println("empty");
		if (input.isEmpty()) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		System.out.println();
	}
}
