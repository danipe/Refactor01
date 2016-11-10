/**
 * Ejemplo de código Java Repetido
 * 
 * @author      Paco Gomez <fjgomez@florida-uni.es>
 * @version     1.0 
 * @since       1.2          (the version of the package this class was first added to)
 */
public class Refactor01 {
	 static float area=0;
	
	public static void main(String[] args) {
		
			cuadrado();
			circulo();
			rectangulo();
	
		
		
		
		
		
		
	}
	//Cuadrado
	public static void cuadrado(){
		int lado=3;
		area=lado*lado;
		
		imprime("CUADRADO");
	}
	//Circulo
	public static void circulo(){
		float pi=3.14f;
		int radio=3;
		area=pi*radio*radio;

		imprime("CIRCULO");
	}
	//Rectangulo
	public static void rectangulo(){
		int base=3;
		int altura=6;
		area=base*altura;
		imprime("RECTANGULO");
		
	}
	public static void imprime(String sarea){
		System.out.println("---- AREA DE UN "+sarea+" ------");
		System.out.println(area);
		System.out.println("-------------------------------");
	}
}
