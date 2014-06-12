package codigo;

/*
 * Clase que nos devuelve el n�mero menor entre dos n�meros
 * */
public class Menor {
	//Inicializaci�n
	private int a;
	private int b;

	//Constructor
	public Menor(int a , int b) {
		this.a=a;
		this.b=b;
	}
	
	public void setA(int a){
		this.a=a;
	}

	public void setB(int b){
		this.b=b;
	}
	
	//M�todo que permite decolver el n�mero mayor
	public int menor(){
		if(a<b) return a;
		else return b;
	}
}
