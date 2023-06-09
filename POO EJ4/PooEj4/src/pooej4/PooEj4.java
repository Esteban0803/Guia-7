//Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura. 
//La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. 
//También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo. 
//Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. 
//Se deberán además definir los métodos getters, setters y constructores correspondientes.
//Superficie = base * altura / Perímetro = (base + altura) * 2.
package pooej4;
import java.util.Scanner;
import pooej4.Cuadrado.Rectangulo;

public class PooEj4 {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base");
        double base = leer.nextInt();
        System.out.println("Ingrese la altura");
        double altura = leer.nextInt();
        Rectangulo r1 = new Rectangulo(base, altura);
        System.out.println("La superficie es: " + r1.getSuper());
        System.out.println("El perimetro es: " + r1.getPeri());
        System.out.println("--------------------");
        System.out.println(r1.getRectangulo());
    }
}
