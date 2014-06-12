package codigo;

/*
 * Clase que nos devuelve el número menor entre dos números
 * */
public class Menor {
	//Inicialización
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
	
	//Método que permite decolver el número mayor
	public int menor(){
		if(a<b) return a;
		else return b;
	}
}
