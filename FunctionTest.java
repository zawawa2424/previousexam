
public class FunctionTest {
	public static void main(String[] args) {
		Function f = new Function();
		
		Function.countRoots(10, -0.5, 9.5, 1e-15, f);
	}
}
