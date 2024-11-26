package ejercicios1;

public class S12 {
	/*
	 * S12.- Crea la función posicionLetra que dada una String como parámetro y un Character. 
	 * Devuelva la posición de la primera vez que aparece dicho carácter. Si no aparece devolverá -1. 
	 * */
	
    public static int posicionLetra(String cadena, char caracter) {
    	int posicion = -1;
        //Recorremos la cadena desde el primer carácter hasta el último
        for (int i = 0; i < cadena.length(); i++) {
            //Si encontramos el carácter, devolvemos su posición
            if (cadena.charAt(i) == caracter) {
                //return i;
            	
            	posicion = i; //Guardamos la posicion
                //Al encontrar el caracter forzamos la salida del bucle for poniendo la i a cadena.length()
                i = cadena.length(); 
                
            }
        }
        //Si no encontramos el carácter, devolvemos -1       
        //return -1;
        return posicion;
    }

    public static void main(String[] args) {
        //Ejemplos de uso
        String cadena = "Hola Mundo";
        char caracter = 'M';
        
        int posicion = posicionLetra(cadena, caracter);
        System.out.println("La posición de '" + caracter + "' es: " + posicion);  // Debería mostrar 5

        //Caso en que el carácter no existe en la cadena
        char caracterNoEncontrado = 'z';
        int posicionNoEncontrado = posicionLetra(cadena, caracterNoEncontrado);
        System.out.println("La posición de '" + caracterNoEncontrado + "' es: " + posicionNoEncontrado);  // Debería mostrar -1
    }
}
