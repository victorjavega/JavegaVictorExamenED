package codigo;

/*
 * Clase que nos devuelve el n�mero mayor entre dos n�meros
 * */
public class Mayor {
	//Inicializaci�n
	private int a;
	private int b;

	//Constructor
	public Mayor() {
		a=0;
		b=0;
	}
	
	public void setA(int a){
		this.a=a;
	}

	public void setB(int b){
		this.b=b;
	}
	
	//M�todo que permite decolver el n�mero mayor
	public int mayor(){
		if(a>b) return a;
		else return b;
	}
}
