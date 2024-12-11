package ejercicios1;

public class S14 {
	/*
	 * S14.- Crea una función eliminarVocales que reciba como parámetro de entrada un String 
	 * y la devuelva sin ninguna vocal. 
	 * */
	
	public static String eliminarVocales(String cadena) {
        //StringBuilder para almacenar la cadena resultante
        //StringBuilder resultado = new StringBuilder();
        String resultado = "";
        
        //Cadena con todas las vocales
        String vocales = "AEIOUaeiou";

        //Recorrer cada carácter de la cadena
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i); //Obtener el carácter en la posición i

            //Si el caracter no esta entre las vocales la añadimos porque es consonante
            if (vocales.indexOf(c) == -1){
                //resultado.append(c);
            	resultado = resultado + c;
            }
        }

        //Devolver la cadena resultante
        return resultado.toString();
    }

    public static void main(String[] args) {
        String cadena = "Hola Mundo";
        String resultado = eliminarVocales(cadena);
        
        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena sin vocales: " + resultado);  // "Ej: Hl Mnd"
    }
}
