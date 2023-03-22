import java.util.Scanner;

public class optimizacion {
    static Scanner sc = new Scanner(System.in);
    
    // Esto es un comentario

    public static void main(String[] args) {
    	
        String texto = text();
        
        String[] palabras = separateText(texto);
        
        int[] numeros = new int[palabras.length];
        numeros = stringToInt(palabras, numeros);
        
        int suma = sum(numeros);

        showResult(suma);
    }
    
    // Pedimos el texto
    public static String text() {
    	System.out.println("Introduce números separados por comas");
    	String text = sc.nextLine();
    	
    	return text;
    }
    
    // Separa el texto
    public static String[] separateText(String texto) {
    	String[] palabras = texto.split(",");
    	
    	return palabras;
    }
    
    // convierte el texto a números
    public static int[] stringToInt(String[] palabras, int[] numeros) {
    	numeros = new int[palabras.length];
    	
        for (int i = 0; i < numeros.length; i++) {
            int numero = Integer.parseInt(palabras[i]);
            numeros[i] = numero;
        }
        
        return numeros;
    }
    
    // Realizamos la suma
    public static int sum(int[] numeros) {
    	int suma = 0;
    	
    	for (int numero : numeros) {
            suma = suma + numero;
        }
    	
    	return suma;
    }
    
    // Muestra resultado suma
    public static void showResult(int suma) {
    	System.out.println("El resultado es " + suma);
    }
}
