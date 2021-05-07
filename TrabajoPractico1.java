package TpPPO;

import java.util.Scanner;

public class TrabajoPractico1 {

// Ej 2 
    public static void main(String arg[]) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Digite 3 numeros: ");
        int a = Integer.parseInt(lectura.nextLine());
        int b = Integer.parseInt(lectura.nextLine());
        int c = Integer.parseInt(lectura.nextLine());

        if (a >= 0) {
            System.out.println(b * c);
        } else {
            System.out.println("A no es un numero positivo");
            System.out.println(b + c);
        }
        System.out.println("");

// Ej 3 Palindromo
        System.out.println("Ingrese una palabra");
        String palabra = lectura.nextLine();
        palabra = palabra.toUpperCase();

        int charLeft = 0;
        int charRight = palabra.length() - 1;
        var palin = true;

        while ((charLeft < charRight) & (palin)) {
            if (palabra.charAt(charLeft) == palabra.charAt(charRight)) {
                charLeft += 1;
                charRight -= 1;
            } else {
                palin = false;
            }

        }
        if (palin) {
            System.out.println("La palabra es un palindromo");
        } else {
            System.out.println("La palabra no es palindromo");
        }
        System.out.println("");

        // Ej 4
        ejercicioArray();
        
        // Ej 5
        sueldoEmpleado();
    }

    public static void ejercicioArray() {
        int[] numeros = {4, 2, 3, 8, 11};
        System.out.println(numeros.length + " son los numeros dentro del array");
        var mayor = numeros[0];
        var menor = numeros[0];
        var suma = 0.0;
        
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            } else if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("El mayor es: " + mayor);
        System.out.println("El menor es: " + menor);
        
        var promedio = suma / numeros.length;
        System.out.println("El promedio de los numeros es: " + promedio);

        var aux = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] > numeros[j]) {
                    aux = numeros[j];
                    numeros[j] = numeros[i];
                    numeros[i] = aux;
                }
            }
        }
        System.out.println("Ordenado de mayor a menor: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] < numeros[j]) {
                    aux = numeros[j];
                    numeros[j] = numeros[i];
                    numeros[i] = aux;
                }
            }
        }
        System.out.println("Ordenado de menor a mayor: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
    
    public static void sueldoEmpleado(){
        String nombre = "";
        String auxNom = "";
        var sueldo = 0.0;
        var sueldoPromedio = 0.0;
        var auxSueldo = 0.0;
        Scanner lectura = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++){
            System.out.println("Digite el nombre del empleado");
            nombre = lectura.nextLine();
            System.out.println("Digite el sueldo");
            sueldo = Integer.parseInt(lectura.nextLine());
            
            sueldoPromedio += sueldo;
            
            if (sueldo > auxSueldo){
                auxSueldo = sueldo;
                auxNom = nombre;
            }
        }
        System.out.println("El empleado con mayor sueldo es: " + auxNom);
        System.out.println("El sueldo promedio es: " + sueldoPromedio/5);
    }
}
