/*
 * my mistake
 * 1 easy one public static void main(String[] args)
 * 2 careful for capital letter and small letter
 * 
 */


public class rationalNumberTest {
	public static void main(String[] args){

		rationalNumber p = new rationalNumber(3, 4);
		rationalNumber q = new rationalNumber(1, 3);
		rationalNumber t = new rationalNumber(1, 1);
		rationalNumber u = new rationalNumber(3, 1);
		rationalNumber v = new rationalNumber(-1, 1);
		
		

		rationalNumber r = p.addNumber(t);
		rationalNumber s = (u.multyNumber(q.invNumber())).addNumber(p.multyNumber(v));
		
		r.check();
		s.check();

		}

}
