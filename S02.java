package ejercicios1;

public class S02 {
	/*
	 * S2.- Crea una función llamada concatenar que dadas tres cadenas, devuelva su concatenación. 
	 */
	
	public static String concatenar(String cadena1, String cadena2, String cadena3) {
        return cadena1 + cadena2 + cadena3;
    }

    public static void main(String[] args) {
        String resultado = concatenar("Hola ", "a todo", " el mundo");
        
        System.out.println(resultado);
    }
}
