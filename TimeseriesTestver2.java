//checked
public class TimeseriesTestver2 {
	public static void main(String[] args) {
		
		double[] dataset = {2, 3, 4, 5, 6};
		TimeSeriesver2 test = new TimeSeriesver2(5, 0.1, dataset) ;//why can't I directly insert the values of dataset?
		

	
		
		
		System.out.println(test.isMonotonous());
	
		System.out.println(test.duration());
		System.out.println(test.count(1, 2));
		System.out.println(test.getTime(3));
		System.out.println(test.valueAt(5.23));
	}
}
