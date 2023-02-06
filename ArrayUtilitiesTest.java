
public class ArrayUtilitiesTest {

	public static void main(String[] args) {
		int[] x = {3, 1, 5, 4};
		int[] y = {2, 4, 5, 3};
		double[] z = {2.2, 1 ,1.5, 3};
		ArrayUtilities.isDescending(x);
		
		ArrayUtilities.compare(x, y);
		ArrayUtilities.compare(x, x);
		
		ArrayUtilities.printMinMax(z);
		ArrayUtilities.reverse(z);
	}

}
