package ejercicios1;

public class S13 {
	/*
	 * S13.- Crea la función contieneCadena que recibirá dos parámetros de entrada. 
	 * El primero será la cadena donde se buscará, el segundo será el parámetro que se buscará. 
	 * La función devolverá verdadero en caso de que esté contenida, y falso en caso contrario. 
	 * */

    public static boolean contieneCadena(String cadena, String subcadena) {
        //Recorremos la cadena principal
        for (int i = 0; i <= cadena.length() - subcadena.length(); i++) {           
        	boolean encontrada = true;
            //Comprobamos si la subcadena empieza en la posición i de la cadena
            for (int j = 0; j < subcadena.length(); j++) {
                if (cadena.charAt(i + j) != subcadena.charAt(j)) {
                    encontrada = false; //Si no coinciden, rompemos el bucle
                    break; //Con esto salimos al punto (**)
                    //j = subcadena.length(); //El break equivale a hacer esto
                }
            }
            //(**)
            
            // Si hemos encontrado una coincidencia, devolvemos true
            if (encontrada) {
                return true;
            }
        }
        
        //Si no encontramos la subcadena en ningún punto de la cadena principal, devolvemos false
        return false;
    }

    public static void main(String[] args) {
        String cadena1 = "Hola Mundo";
        String subcadena1 = "Mund";
        String subcadena2 = "mundo";
        
        System.out.println("¿'Hola Mundo' contiene 'Mund'? " + contieneCadena(cadena1, subcadena1));  // true
        System.out.println("¿'Hola Mundo' contiene 'mundo'? " + contieneCadena(cadena1, subcadena2));  // false
    }
}
