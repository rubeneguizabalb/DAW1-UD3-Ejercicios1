package ejercicios1;

public class S04 {
	/*
	 * S4.- Crea la función toCamelCase que pasando una cadena por parámetro, 
	 * devuelva la misma cadena en formato CamelCase comenzando con minúscula. 
	 * */
	
	public static String toCamelCase(String cadena) {
        //StringBuilder para almacenar el resultado
        StringBuilder camelCase = new StringBuilder();
        //Caracter para cada letra
        char c;
        //Para controlar si la siguiente letra debe ser mayúscula
        boolean siguienteMayuscula = false; 

        //Recorremos la cadena carácter a carácter
        for (int i = 0; i < cadena.length(); i++) {
            c = cadena.charAt(i);

            //Si encontramos un espacio, la siguiente letra ha de ser mayúscula
            if (c == ' ') {
                siguienteMayuscula = true;
                camelCase.append(c);
            } else {                
            	//Despues de cada espacio vendría una mayuscula
                if (siguienteMayuscula) {
                    camelCase.append(Character.toLowerCase(c)); //La guardamos en minuscula
                    siguienteMayuscula = false; //Las siguientes letras son minusculas hasta encontrar un espacio
                } else {
                	//Si es la primera letra de toda la cadena, la ponemos en minuscula
                	if (camelCase.length()== 0) {
	                    //Sino la añadimos en mminuscula
                		camelCase.append(Character.toLowerCase(c));
                	}
                	else {
	                    //Sino la añadimos en mayuscula
	                    camelCase.append(Character.toUpperCase(c));  
                	}
                }
            }
        }

        return camelCase.toString();
    }

    public static void main(String[] args) {
        String resultado = toCamelCase("Una frase PAra Camel CaSe");
        System.out.println(resultado);
    }
}
