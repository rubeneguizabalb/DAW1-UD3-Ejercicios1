package ejercicios1;

public class S09 {
	/*
	 * S9.- Crea una función llamada contarCaracter que reciba dos parámetros de entrada. 
	 * El primer parámetro será un String y el segundo un Character. 
	 * La función tendrá que devolver el número de apariciones del Character dentro del String. 
	 * */
	
    public static int contarCaracter(String cadena, char caracter) {
        int numCaracterDado = 0;

        //Recorremos la cadena carácter por carácter
        for (int i = 0; i < cadena.length(); i++) {
            //Comparamos el carácter actual con el carácter que nos han pasado de parametro
            if (cadena.charAt(i) == caracter) {
                numCaracterDado++;  //Incrementamos el contador si hay coincidencia
            }
        }

        return numCaracterDado;  //Devolvemos el número de apariciones
    }

    public static void main(String[] args) {
        String cadena = "Este es un ejemplo de cadena";
        char caracter = 'e';
        int numeroDeApariciones = contarCaracter(cadena, caracter);
        System.out.println("El carácter '" + caracter + "' aparece " + numeroDeApariciones + " veces."); //Ej = 'e'
    }
}
