package ejercicios1;

public class S15 {
	/*
	 * S15.- Crea una función reemplazarVocales que reciba como parámetro de entrada un String y 
	 * un Character que sea vocal. 
	 * La función deberá devolver la misma cadena sustituyendo cada vocal por la vocal que se pasa 
	 * como parámetro. 
	 * */

    public static String reemplazarVocales(String cadena, char vocalReemplazo) {
        //StringBuilder para almacenar la nueva cadena con las vocales reemplazadas
        StringBuilder resultado = new StringBuilder();
        //Cadena con todas las vocales
        String vocales = "AEIOUaeiou";

        //Recorrer cada carácter de la cadena
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);  //Obtener el carácter en la posición i

            //Si el caracter es vocal, la reemplazamos
            if (vocales.indexOf(c) != -1){
                resultado.append(vocalReemplazo);
            } else {
                resultado.append(c);  //Si no es una vocal, lo dejamos igual
            }
        }

        //Devolver la cadena resultante
        return resultado.toString();
    }

    public static void main(String[] args) {
        String cadena = "Hola Mundo";
        char vocalReemplazo = 'e';
        
        String resultado = reemplazarVocales(cadena, vocalReemplazo);
        
        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena con vocales reemplazadas: " + resultado);  // "Hele Mende"
    }
}
