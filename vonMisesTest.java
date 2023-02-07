/*my mistakes
 * you can't do as follows.
		double[] dataset2 = new double[5];;
		dataset2 = {2, 3, 1.4, 1.5, 2}
		seems like {} can be only used when initialization
 */

public class vonMisesTest {
	public static void main(String[] args) {
		vonMises von = new vonMises(2);
		double[] v = {1, -2};
		
		double[][] a = new double[2][2]; //how to create 33 random matrix
		
		a[0][0] = 4;
		a[1][0] = 2;
		a[0][1] = 1;
		a[1][1] = 3;		
		
		von.vonMisesm(a, v);
	
		
	}

}
