package Entidad;
import java.util.Scanner;

public class Persona {
    Scanner leer = new Scanner (System.in);
    public String nombre;
    public int edad;
    public double altura;

    public Persona(String nombre, int edad, double altura) { 
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }
}
