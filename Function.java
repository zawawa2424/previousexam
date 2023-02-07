
public class Function {
	
	//not relevant to the exam question
	public double eval(double x) {
		return x;
	}
	//answer starts below
	
	public static int countRoots(int n, double a, double b, double eps, Function f){
		
		double deltax = (b - a)/n;
		int counter = 0;

		for(int i = 0; i < n; i++){
			if(Math.abs(f.eval(a+deltax*i)) < eps){
				counter ++;
			}else if((Math.abs(f.eval(a+deltax*(i+1))) > eps) && (f.eval(a+deltax*i))*(f.eval(a+deltax*(i+1))) < -eps*eps){
				counter ++;
			}
		}
		System.out.println(counter);
		return counter;
		
	}
	}

