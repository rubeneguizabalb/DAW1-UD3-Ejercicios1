package ejercicios1;

public class S08 {
	/*
	 * S8.- Crea una función llamada contarEspacios que reciba por parámetro una cadena
	 * y devuelva el número de espacios que contiene. 
	 * */
	
    public static int contarEspacios(String cadena) {
        int numEspacios = 0;

        //Recorremos la cadena caracter por caracter
        for (int i = 0; i < cadena.length(); i++) {
            //Si encontramos un espacio, incrementamos el contador
            if (cadena.charAt(i) == ' ') {
                numEspacios++;
            }
        }

        return numEspacios;  //Devolvemos el número de espacios
    }

    public static void main(String[] args) {
        String cadena = "Este es un ejemplo de cadena";
        int numeroDeEspacios = contarEspacios(cadena);
        System.out.println("El número de espacios es: " + numeroDeEspacios); //Ej: 5
    }
}
