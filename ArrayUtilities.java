/*my mistakes
 * 1 check typo (〇boolean length  <= ✖ boolen,lentgh, =<)
 * 2 check whether you use double or int (stay consistent)
 */


public class ArrayUtilities{

	public static boolean isDescending(int[] x){
		boolean result = true;
		int initial = x[0];
		for(int i=1; i < x.length; i++){
			if(initial < x[i]){
				result = false;
				break;
			}
			else{
				initial = x[i];
			}
		}
		//you don't have to put below for the question
		System.out.println(result);
		return result;

	}
	
	public static boolean compare(int[] x, int[] y){
		boolean result = true;
			if(x.length != y.length){
				result = false;
			}
			else
				{for(int i=1; i < x.length; i++){
					if(x[i] != y[i])
						result = false;
						break;
					}
				}
			//you don't have to put below for the question
			System.out.println(result);
			
			return result;
		}

	public static void printMinMax(double[] x){
		double min = x[0];
		double max = x[0];
		for(int i=1; i < x.length; i++){
		
			if(x[i] <= min){
				min = x[i];
			}
			if(x[i] >= max){
				max = x[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
	}

	public static void reverse(double[] x){
		int length = x.length;
		double[] newx = new double[length];
		for(int i=0; i < x.length; i++){
			newx[length-i-1] = x[i];
					//you don't have to put below's code (just for check)
			System.out.println(x[i]);
		}
		x = newx;

		
	}
	

}
