package ejercicios1;

public class S05 {	
	/*
	 * S5.- Crea la función toCamelCase que reciba dos parámetros, el primer carácter será la cadena que 
	 *      transformaremos a camel case y el segundo parámetro será un Boolean que si es verdadero hará 
	 *      que la función devuelva la cadena en camel case comenzando en minúscula, 
	 *      y si es falso comenzando en mayúscula. 
	 * */
	
	
    public static String toCamelCase(String cadena, boolean minusculaInicial) {
        //StringBuilder para almacenar el resultado
        StringBuilder camelCase = new StringBuilder();

        //Variable que nos indica si la siguiente letra debe ir en mayúscula
        boolean primeraLetraPalabra = false;

        //Recorremos cada carácter de la cadena
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            //Si el carácter es un espacio, la siguiente letra debe ser mayúscula
            if (c == ' ') {
                primeraLetraPalabra = true;
                camelCase.append(c); 
            } else {                
                //Convertimos el primer carácter de la palabra en minúscula
            	//o mayúscula según el parámetro
                if (camelCase.length() == 0) {
                    if (minusculaInicial) {
                        camelCase.append(Character.toLowerCase(c)); //Primera letra minúscula
                    } else {
                        camelCase.append(Character.toUpperCase(c)); //Primera letra mayúscula
                    }
                } else {
                	if (primeraLetraPalabra) {
                		primeraLetraPalabra = false;
                        if (minusculaInicial) {
                            camelCase.append(Character.toLowerCase(c)); //Primera letra minúscula
                        } else {
                            camelCase.append(Character.toUpperCase(c)); //Primera letra mayúscula
                        }
                    }
                	else {
	                	//El resto se convierten al reves segun el parametro
	                	//Si empieza en mayuscula el resto en minusculas
	                	//Si empieza en minuscula el resto en mayusculas
	                	if (minusculaInicial) {
	                        camelCase.append(Character.toUpperCase(c)); //resto de letras en mayuscula
	                    } else {
	                        camelCase.append(Character.toLowerCase(c)); //resto de letras en minuscula
	                    }
                	}
                }
            }
        }

        return camelCase.toString();
    }

    public static void main(String[] args) {
        // Ejemplo de uso con la opción de minúscula al inicio
        String resultado1 = toCamelCase("MINuscula al inicio", true);
        System.out.println(resultado1);  //mINUSCULA aL iNICIO

        // Ejemplo de uso con la opción de mayúscula al inicio
        String resultado2 = toCamelCase("maYUScula al FInal", false);
        System.out.println(resultado2);  //Mayuscula Al Final
    }
}
