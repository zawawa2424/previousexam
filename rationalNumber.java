/* mistakes
 * 
 * 1 don't forget to declare the type for method
 * 2(not mistake, but useful tip...) you don't have to put getter and setter if you only try to manipulate these private attribute within its own class
 * for example, this class you don't need to use getter, but you can use r.n or r.m for example
 * 
 * almost perfect!! time: 23:30(with testclass)
 */
public class rationalNumber {
	

		private int m;
		private int n;
		
		public rationalNumber(int m, int n){
			this.m = m;
			this.n = n;
		}

		

		public rationalNumber addNumber(rationalNumber r){
			// this simplified way to write is from the answer of seniors
			return new rationalNumber(this.m*r.n +this.n*r.m, this.n*r.n) ;
		}

		
			// this way is more wordy, so not preferable
		public rationalNumber multyNumber(rationalNumber r){
			rationalNumber r2 = new rationalNumber(this.m*r.getm(), this.n*r.getn());
			return r2;
		}

	public rationalNumber invNumber(){
			return  new rationalNumber(this.n,this.m);
		}

	public boolean equalNumber(rationalNumber r){
		boolean result = false;
		if(this.m*r.getn() == this.n*r.getm()){
			result = true;
		}
		return result;
	 
	}


	public int  getm(){
	 return this.m;
	}

	public int  getn(){
	 return  this.n;
	}
	
	//for check
	public void check() {
		System.out.println(this.getm());
		System.out.println(this.getn());
	}



	
}
