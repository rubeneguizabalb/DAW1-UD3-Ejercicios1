package ejercicios1;

public class C01 {
	
	/* 
	 * C1.- Crea una función llamada caracteristicaCaracter que dado un carácter por parámetro devuelva: 
	 * 1 si es un dígito.
	 * 2 si es una letra minúscula.
	 * 3 si es una letra mayúscula.
	 * 4 si es un espacio en blanco. 
	 * 5 si es un carácter que no es alfanumérico.
	 * */

	public static int caracteristicaCaracter(char c) {
		
	    if (Character.isDigit(c)) {
	        return 1; //Si es un dígito
	    } else if (Character.isLowerCase(c)) {
	        return 2; // Si es una letra minúscula
	    } else if (Character.isUpperCase(c)) {
	        return 3; //Si es una letra mayúscula
	    } else if (Character.isWhitespace(c)) {
	        return 4; //Si es un espacio en blanco
	    } else {
	        return 5; //Si es un carácter no alfanumérico
	    }
	   
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("EJEMPLO 1");
		System.out.println(caracteristicaCaracter('9')); //1 dígito
	    System.out.println(caracteristicaCaracter('a')); //2 minúscula
	    System.out.println(caracteristicaCaracter('Z')); //3 mayúscula
	    System.out.println(caracteristicaCaracter(' ')); //4 espacio en blanco
	    System.out.println(caracteristicaCaracter('@')); //5 carácter no alfanumérico
	    System.out.println("-------\n");
	    
	    System.out.println("EJEMPLO 2");
	    System.out.println(caracteristicaCaracter('@')); //5 carácter no alfanumérico
	    System.out.println(caracteristicaCaracter('9')); //1 dígito        
	    System.out.println(caracteristicaCaracter('Z')); //3 mayúscula
	    System.out.println(caracteristicaCaracter(' ')); //4 espacio en blanco        
	    System.out.println(caracteristicaCaracter('a')); //2 minúscula
	}

}
