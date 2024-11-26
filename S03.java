package ejercicios1;

public class S03 {
	/*
	 * S3.- Crea la función deletrearCadena que pasando una cadena por parámetro, 
	 * muestre cada uno de sus caracteres por consola en una misma línea y separados por espacio. 
	 * */
	
	public static void deletrearCadena(String cadena) {
        //Recorremos la cadena y mostramos cada carácter separado por un espacio
        for (int i = 0; i < cadena.length(); i++) {
            System.out.print(cadena.charAt(i) + " ");
        }
    }

    public static void main(String[] args) {
        deletrearCadena("Hola a todo el que lea esto");
    }
}
