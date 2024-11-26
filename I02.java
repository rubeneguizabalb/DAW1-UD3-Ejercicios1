package ejercicios1;

public class I02 {
	
	/*
	 * I2.- Crea una función mayorEntero que pasando como arguments dos enteros, devolverá el mayor de los dos (utiliza la función correspondiente de Integer). 
	 * */
	
	public static int mayorEntero(int num1, int num2) {
        /*if (num1 > num2) {
            return num1;  //Si num1 es mayor que num2, lo devolvemos
        } else {
            return num2;  //Si num2 es mayor o igual a num1, devolvemos num2
        }*/
        
        return Integer.max(num1, num2);
    }

    public static void main(String[] args) {
        System.out.println(mayorEntero(10, 20));  //20
        System.out.println(mayorEntero(25, 15));  //25
        System.out.println(mayorEntero(30, 30));  //30 (si son iguales, devuelve cualquiera de los dos)
        System.out.println(mayorEntero(-10, 0));  //0
    }
}
