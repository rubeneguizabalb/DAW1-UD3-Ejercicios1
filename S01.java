package ejercicios1;

public class S01 {
	
	/*
	 * S1.- Crea la función compararCadenas que dadas dos cadenas por parámetro, 
	 * devolverá verdadero en caso de que sean iguales o falso en caso contrario. 
	 * */

	 public static boolean compararCadenas(String str1, String str2) {
        //Usamos equals para comparar las cadenas
        return str1.equals(str2);
    }

    public static void main(String[] args) {
        System.out.println(compararCadenas("hola", "hola"));   //true
        System.out.println(compararCadenas("hola", "adios"));  //false
        System.out.println(compararCadenas("Hola", "hola"));   //false (la comparación es sensible a mayúsculas y minúsculas)
        System.out.println(compararCadenas("123", "123"));     //true
    }	
}
