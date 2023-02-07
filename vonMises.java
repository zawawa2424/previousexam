/*
 * Seems like with this code I couldn't get the exact eigenvalue
 * if you find any suggestion please give me some feedback
 * but I don't think the answer from the senior is correct one as well and 
 * I'm sure it's waste of time to seek flawlessness 
 * (to me it's the problem of von Mises, rather than java in itself so 
 * in my opinion it's better to spend more time to other question
 *  once you grab the big picture of the question and answer
 * 
 * 
 * my mistakes
 * 1 the index number should be integer.
 * 2 how to express 1.0*10^15??  A. use e(1e15,1e-15)
 * 
 * not mistake, but the things to keep in mind
 * 1 difference between "do while" and "while"
 * "do while" ... do at least 1 time
 * "while" ... possibly 0
 * 
 *  for "do while" don't forget to put ; at the end of the method;)
 */


public class vonMises {
	private double lamda = 1e15; // another way??
	private int n;
	private double lamdaold = 0;
	
public vonMises(int n) {
	this.n = n;
}

public  double vonMisesm(double[][] a, double[] x){
	double[] y = new double[n];
	double s = 0;
	while(Math.abs(lamda-lamdaold) >= 1e-15){
		for(int i = 0; i < n; i++){
			s += x[i]*x[i];
		}
		s = Math.sqrt(s);
		lamdaold = lamda;
		for(int k = 0; k < n; k++){
			y[k] = x[k]/s;
		}
		double lamdanew =0;
		for(int j = 0; j < n; j++){
			double tempo = 0;
			for(int l = 0; l < n; l++){		
			 	tempo += a[j][l]*y[l];
			}
			x[j] = tempo;
		lamdanew += x[j]*y[j];
		x[j] = y[j];
		}
		lamda = lamdanew;

	};
	System.out.println(lamda);
	return lamda;
}

/*
 * 
 * answer from senior
 * public static double vonMisess (double[][]a,double[]x) {
double Lambda=10E15;
double Lold=0;
int n=x.length; double s; double []y=new double[n];
while (Math.abs(Lambda-Lold)>10E-15) {
s=0;
for (int i=0; i<n; i++) {
s=s+x[i]*x[i];
}
s=Math.sqrt(s);
for (int i=0; i<=n; i++) {
y[i]=x[i]/s;
}
for (int j=0; j<=n; j++) {
x[i]=x[i]+a[i][j]*y[j];
}
}
Lold=Lambda;
Lambda=0;
for (int i=0; i<=n; i++) {
Lambda=Lambda+x[i]*y[i];
}
}
for (int i=0; i<n; i++) {
x[i]=y[i];
}
return Lambda;
}
 * 
 * 
 */


}
