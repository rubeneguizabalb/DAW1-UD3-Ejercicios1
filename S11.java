package ejercicios1;

public class S11 {
	/*
	 * S11.- Crea la función de nombre esPalindromo que recibe un String como parámetro y 
	 * devuelva true en caso de que sea un palíndromo y falso en caso contrario. 
	 * */

    public static boolean esPalindromo(String cadena) {
        int inicio = 0; //Inicio de la cadena
        int fin = cadena.length() - 1; //Final de la cadena
        boolean esPalindromo = true;

        //Recorremos la cadena desde los dos extremos hacia el centro
        //para parar antes sin return puede usarse: while ((inicio < fin) && (esPalindromo)){
        while (inicio < fin){ 
            //Si los caracteres no coinciden, no es un palíndromo
            if (cadena.charAt(inicio) != cadena.charAt(fin)) {
                esPalindromo = false; //Puede usarse return false
            }
            //Avanzamos el índice de inicio y retrocedemos el de fin
            inicio++;
            fin--;
        }

        //Si no hemos encontrado ninguna diferencia, la cadena es un palíndromo
        return esPalindromo; //puede usarse return true
    }

    public static void main(String[] args) {
        //Ejemplos de uso
        String cadena1 = "radar";  // Palíndromo
        String cadena2 = "hola";   // No es palíndromo
        String cadena3 = "reconocer";  // Palíndromo

        //Probamos las cadenas
        System.out.println("¿'" + cadena1 + "' es palíndromo? " + esPalindromo(cadena1)); //true
        System.out.println("¿'" + cadena2 + "' es palíndromo? " + esPalindromo(cadena2)); //false
        System.out.println("¿'" + cadena3 + "' es palíndromo? " + esPalindromo(cadena3)); //true
    }
}
