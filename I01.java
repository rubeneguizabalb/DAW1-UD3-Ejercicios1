package ejercicios1;

public class I01 {
	/*
	 * I1.- Crea una función string2Integer que dado un entero como String, devolverá un entero de tipo Integer. 
	 */

	public static int string2Integer(String str) {
		int devolver;
		boolean enteroValido = true;
		
		//Si esta vacio
		if(str.isEmpty()) 
		{
			enteroValido = false;
		}
		else
		{
			//Recorremos el string
			for(int i = 0; i < str.length(); i++) {
				//Si el primer caracter es -
				if(i == 0 && str.charAt(i) == '-') {
					//Y la longitud del string es 1
		            if(str.length() == 1) {
		            	enteroValido = false;
		            }
		        }
				//Si no es digito
		        if(!(Character.isDigit(str.charAt(i)))) 
		        {
		        	enteroValido = false;
		        }
			}
		}
		
		if (enteroValido) {
			devolver = Integer.parseInt(str);  //Convierte el String a int
		}
		else
		{
			devolver = -98789614;
		}
		
		return devolver;
    }

    public static void main(String[] args) {
        System.out.println(string2Integer("123"));  // 123 (convertido de String a int)
        System.out.println(string2Integer("456"));  // 456 (convertido de String a int)
        System.out.println(string2Integer("abc"));  // 0 (no es un número válido)
        System.out.println(string2Integer(""));     // 0 (String vacío)
    }
}
