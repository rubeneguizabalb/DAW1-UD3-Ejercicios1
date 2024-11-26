package ejercicios1;

public class C03 {
	
	/*
	 * C3.-  Crea una función llamada anteriorCaracter que dados dos caracteres cualesquiera, 
	 * devuelva cuál es el menor independientemente de si es mayúscula o minúscula. 
	 * */
	
	public static char anteriorCaracter(char c1, char c2) {
        //Convertimos los caracteres a minúsculas (se podría hacer tambien con mayúsculas)
        char c1minuscula = Character.toLowerCase(c1);
        char c2minuscula = Character.toLowerCase(c2);
        
        //Comparamos los caracteres normalizados
        if (c1minuscula < c2minuscula) {
            return c1; //c1 es menor
        } else {
            return c2; //c2 es menor (o igual a c1)
        }
    }

    public static void main(String[] args) {
        System.out.println(anteriorCaracter('a', 'Z')); //Z (comparado sin tener en cuenta mayúsculas/minúsculas)
        System.out.println(anteriorCaracter('B', 'b')); //B (ambos son iguales)
        System.out.println(anteriorCaracter('X', 'w')); //w (comparado sin tener en cuenta mayúsculas/minúsculas)
        System.out.println(anteriorCaracter('z', 'A')); //A (comparado sin tener en cuenta mayúsculas/minúsculas)
    }
}
