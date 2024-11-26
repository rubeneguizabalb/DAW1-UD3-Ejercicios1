package ejercicios1;

public class C02 {
	
	/* 
	 * C2.- Crea una función llamada convertirCaracter que dado un carácter de tipo letra 
	 * lo convierta en mayúscula si es minúscula y en minúscula si es mayúscula. 
	 * */
	
	
    public static char convertirCaracter(char c) {
    	
        //Si el carácter es una letra
        if (Character.isLetter(c)) {
            //Si es minúscula, lo convertimos en mayúscula
            if (Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
            } else {
                //Si es mayúscula, lo convertimos en minúscula
            	c = Character.toLowerCase(c);
            }
        } 
        
        return c;
    	
        /*
        //Si el carácter es una letra
        if (Character.isLetter(c)) {
            //Si es minúscula, lo convertimos en mayúscula
            if (Character.isLowerCase(c)) {
                return Character.toUpperCase(c);
            } else {
                //Si es mayúscula, lo convertimos en minúscula
                return Character.toLowerCase(c);
            }
        } else {
            //Si no es una letra, devolvemos el mismo carácter sin cambios
            return c;
        } */
    }
    
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        System.out.println(convertirCaracter('a')); // 'A' (de minúscula a mayúscula)
        System.out.println(convertirCaracter('@')); // ' ' (no es letra)
        System.out.println(convertirCaracter('Z')); // 'z' (de mayúscula a minúscula)
        System.out.println(convertirCaracter('1')); // '1' (no es letra)
        
    }
}
