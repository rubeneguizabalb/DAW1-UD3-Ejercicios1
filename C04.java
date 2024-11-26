package ejercicios1;

public class C04 {
	/*
	 * C4.- Crea una función llamada caracter2Integer que dado un entero como Character, devuelva el mismo entero de tipo Integer. 
	 */

	public static int caracter2Integer(char c) {
		int devolver = -999999; 
        //Si el carácter es un dígito
		if (Character.isDigit(c)) {
            //Convertimos el carácter en un número entero
            devolver = Integer.parseInt(String.valueOf(c));  // Convierte el carácter en un String y luego lo parsea a Integer
        } 
		
		return devolver;
    }

    public static void main(String[] args) {
    	System.out.println(caracter2Integer('9')); // 9 (carácter convertido a entero)
        System.out.println(caracter2Integer('5')); // 5 (carácter convertido a entero)        
        System.out.println(caracter2Integer('a')); // -999999
        System.out.println(caracter2Integer('0')); // 0 (carácter convertido a entero)
    }	
}
