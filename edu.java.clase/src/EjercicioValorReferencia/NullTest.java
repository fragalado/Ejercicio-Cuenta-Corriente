package EjercicioValorReferencia;

public class NullTest {

	public static void main(String[] args) {
	     NullTest test = new NullTest();
	     Person p = new Person();
	     p.name = "Juan";
	     test.nullPerson(p,"Luis");
	     System.out.println(p.name); //¿Qué se imprimirá por pantalla?
	     
	     Person p2 = new Person();

	}
	
	void nullPerson(Person pers, String other){
	     pers=null;
	}

}
