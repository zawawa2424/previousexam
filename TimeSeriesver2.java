/*
 * my mistakes...
 * 1 forget to put [] with my attribute "data"
 * 2 in java, unlike c++, you can't use "1" and "0" instead of "true" and "false"
 * 3 typo (not =<, but <=)
 * 4 in the same method you can't use the same counter for iteration (I used two "i"s in the same method)
 * 5 CHECK THE NUMBER OF { AND } !!!!!!
 * 6 not possible int d = 1.3;	double f = d;
 * but possible double d = 1.3;	double f = d;
 */


public class TimeSeriesver2 {

		private double t0;
		private double dt;
		private double[] data;

		public TimeSeriesver2(double t0, double dt, double[] data){
			this.t0 = t0;
			this.dt = dt;
			this.data = data;
		}

		public double duration(){
			return this.dt*this.data.length;
		}

		public double getTime(int ti){
			return (t0 + dt*(ti-1));
		}

		public double count(double a, double b){
			int counter = 0;
			for(int i = 0; i<data.length; i++){
				if(a <= data[i] && data[i] <= b){
					counter ++;
				}
			}
			return counter;
		}
		
		

		public double valueAt(double t){
			int index = (int)((t - this.t0)/dt);
			return data[index];
		}

		public boolean isMonotonous(){
			double start = this.data[0];
			boolean monotonous = true;
			boolean descending = true;
			boolean ascending = true;
			for(int i = 1; i < this.data.length; i++){
				if(start < data[i]){
					descending = false;
					break;
				}
			}
			for(int k = 1; k < this.data.length; k++){
				if(start > data[k]){
					ascending = false;
					break;
				}
			}
			if (ascending == false && descending == false){
				monotonous = false;
			}
			
		
			return monotonous;
	}
		
}

