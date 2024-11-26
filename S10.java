package ejercicios1;

public class S10 {
	/*
	 * S10.- Crea una función llamada invertirCadena que reciba un String como 
	 * parámetro y devuelva el mismo String invertido. 
	 * */
	
    public static String invertirCadena(String cadena) {
        StringBuilder cadenaInvertida = new StringBuilder();

        //Recorremos la cadena desde el final hasta el principio
        //Hacemos un for con recorrido inverso (i--)
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida.append(cadena.charAt(i));  //Añadimos el carácter al StringBuilder
        }

        return cadenaInvertida.toString();  
    }

    public static void main(String[] args) {
        String cadena = "Hola Mundo";
        String resultado = invertirCadena(cadena);
        System.out.println("La cadena invertida es: " + resultado); //Ej: odnuM aloH
    }
}
