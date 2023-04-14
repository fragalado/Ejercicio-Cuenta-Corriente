package EjercicioValorReferencia;

public class ChangeTest{
	
    public static void main(String[] args){
          ChangeTest test = new ChangeTest();
          Person p = new Person();
          p.name = "Juan";
          test.changeName(p,"Luis");
          System.out.println(p.name); //¿Qué se imprimirá por pantalla?
     }
     void changeName (Person pers, String other){
         pers = new Person();
         pers.name = other;
     }
}
