package calc;

public class problemas {

	//Propiedades
	protected static int c;
	protected static int e;
	
	//Constructor
	public problemas (int numero1, int numero2) {
		c = numero1;
		e = numero2;
	}
	
	//Metodos
	public void setNum1 (int numero1) {
		c = numero1;
	}
	public int getNum1 () {
		return c;
	}
	public void setNum2 (int numero2) {
		e = numero2;
	}
	public int getNum2 () {
		return e;
	}
}