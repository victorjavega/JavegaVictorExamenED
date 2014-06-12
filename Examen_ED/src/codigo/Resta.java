package codigo;


/*
 * Clase que nos permite restar dos números enteros
 * */
public class Resta {
	//Inicialización
	private int a;
	private int b;

	//Constructor
	public Resta(int a, int b) {
	this.a=a;
	this.b=b;
	}
	
	public void setA(int a){
		this.a=a;
	}

	public void setB(int b){
		this.b=b;
	}
	
	//Método que permite restar dos números enteros
	public int resta(){
		return a-b;
	}
}
