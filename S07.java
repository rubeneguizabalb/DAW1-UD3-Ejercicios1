package ejercicios1;

public class S07 {
	/*
	 * S7.- Crea una función llamada esMayor que reciba por parámetro dos cadenas, 
	 * y devuelva aquella que tiene más caracteres. 
	 * */
	
    public static String esMayor(String cadena1, String cadena2) {
        
        int longitud1 = cadena1.length(); //Contamos la longitud de la primera cadena
        int longitud2 = cadena2.length(); //Contamos la longitud de la segunda cadena

        //Devolver la cadena que tiene más caracteres
        if (longitud1 >= longitud2) {
            return cadena1;
        } else {
            return cadena2;
        }
    }

    public static void main(String[] args) {
        String cadena1 = "Hola Mundo";
        String cadena2 = "frase mas larga";
        String resultado = esMayor(cadena1, cadena2);
        System.out.println("La cadena con más caracteres es: " + resultado);
    }
}
