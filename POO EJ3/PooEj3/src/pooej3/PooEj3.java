//Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación, se deben crear los siguientes métodos:
//Método constructor con todos los atributos pasados por parámetro.
//Método constructor sin los atributos pasados por parámetro.
//Métodos get y set.
//Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
//Método sumar(): calcular la suma de los números y devolver el resultado al main.
//Método restar(): calcular la resta de los números y devolver el resultado al main
//Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, 
//el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main
//Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, 
//el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
package pooej3;
import java.util.Scanner;
import pooej3.Op.Operacion;

public class PooEj3 {
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese dos numeros:");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        Operacion op1 = new Operacion(num1, num2);
        System.out.println("El resultado de la suma es:" + op1.getSuma());
        System.out.println("El resultado de la resta es: " + op1.getResta());
        System.out.println("El resultado de la multiplicacion es: " + op1.getMulti());
        System.out.println("El resultado de la division es: " + op1.getDivi());
    }    
}

