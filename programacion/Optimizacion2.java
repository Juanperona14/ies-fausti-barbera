import java.util.Scanner;

public class Optimizacion2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        int option = option();
        
        boolean resp = true;
        while (resp) {
            if (option == 1) {
                int num = positiveNum();
                
                int suma = sum(num);
                
                showResult(suma);
            } else if (option == 2) {
            	resp = exit(resp);
            }
            
            if (resp){            
            	option = option();
            }
        }
    }
    
    // Elige opción
    public static int option() {
    	System.out.println("Elige una opción:");
        System.out.println("1. Calcular sumatorio");
        System.out.println("2. Salir");
        int option = sc.nextInt();
        sc.nextLine();
        
        while (option != 1 && option != 2) {
            System.out.println("Error, elija un opción válida (1 o 2)");
            option = sc.nextInt();
            sc.nextLine();
        }
    	return option;
    }
    
    // Pedimos un número positivo
    public static int positiveNum() {
    	System.out.println("Introduce un número mayor que cero");
        int num = sc.nextInt();
        sc.nextLine();

        while (num < 1) {
            System.out.println("Error, el número debe ser mayor que cero");
            num = sc.nextInt();
            sc.nextLine();
        }
        return num;
    }
    
    // Realizamos la suma
    public static int sum(int num) {
    	int suma = 0;
        for (int i = 0; i <= num; i++) {
            suma += i;
        }
    	
    	return suma;
    }
    
    //Muestra suma
    public static void showResult(int suma) {
    	System.out.println("El resultado es " + suma);

    }
    
    //Devuelve false
    public static boolean exit(boolean resp) {
    	System.out.println("Hasta luego.");
        resp = false;
    	
    	return resp;
    }
} 