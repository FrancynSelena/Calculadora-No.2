package calc;

public class suma extends problemas {	
		
		    //Propiedades
	     	private int r;
			private char sign;
			private String oper;
				
			//Constructor
				public suma (int numero1, int numero2) {
					super(numero1, numero2);
				}
				
			//Metodos
			public int getRes () {
				r = c + e;
				return r;
			}
			public String getOperation() {
				oper="suma";
				return oper;
			}
			public char getSign() {
				sign='+';
				return sign;
			}
	}