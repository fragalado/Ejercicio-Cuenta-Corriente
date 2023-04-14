package EjercicioValorReferencia;

public class RefTest {

	public static void main (String[] args){

	     RefTest test = new RefTest();
	     Person p =new Person();
	     p.name = "Juan";
	     test.changeName(p,"Luis");
	     System.out.println(p.name);     //¿Qué se imprimirá por pantalla?
	}
	void changeName(Person pers, String other){
	     pers.name = other;
	}

}
