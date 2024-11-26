package ejercicios1;

public class S06 {
	
	/*
	 * S6.- Crea la función subcadena que reciba tres parámetros. 
	 * Primero, la cadena de la que vamos a obtener la subcadena. 
	 * Segundo, el índice de inicio (comenzando por 1) desde donde voy a tomar la subcadena. 
	 * Tercero, el índice del final donde voy a cortar la subcadena. 
	 * Debe devolver la subcadena que vaya de la posición inicial a la final que indican los parámetros. 
	 * */
	
	//Función que extrae una subcadena entre los índices 'inicio' y 'fin' (basado en 1)
    public static String subcadena(String cadena, int inicio, int fin) {
        //Verificar si los índices son válidos
        if (inicio < 1 || fin < 1 || inicio > fin || inicio > cadena.length() || fin > cadena.length()) {
            return "";  // Retorna una cadena vacía si los índices no son válidos
        }

        //StringBuilder para almacenar la subcadena resultante
        StringBuilder resultado = new StringBuilder();

        //Recorrer la cadena entre los índices (convertidos a 0 al estar en Java)
        for (int i = inicio - 1; i < fin; i++) {
            resultado.append(cadena.charAt(i)); //Añadir cada carácter al StringBuilder
        }

        return resultado.toString();  //Devolver la subcadena generada
    }

    public static void main(String[] args) {
        String cadena = "Hola Mundo a1234 b5678";
        String sub = subcadena(cadena, 6, 15);
        System.out.println(sub);  //Debería imprimir: Mundo a123
    }
}
