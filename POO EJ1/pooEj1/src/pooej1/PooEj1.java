//Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas,
//y un constructor con todos los atributos pasados por parámetro y un constructor vacío.
//Crear un método para cargar un libro pidiendo los datos al usuario y luego informar mediante otro 
//método el número de ISBN, el título, el autor del libro y el número de páginas.
package pooej1;

import java.util.Scanner;
import pooej1.Entidad.Libro;

public class PooEj1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Libro L1 = new Libro(leer.nextInt(), leer.next(), leer.next(), leer.nextInt());
        System.out.println("Porfavor, antes de registar el libro, ponga los siguientes datos:");
        System.out.println("El ISBN es: " + L1.isbn + " el titulo es " + L1.titulo + " creado por " + L1.autor + " y contiene " + L1.numPags + " paginas");
    }

}
