import Entidad.Persona;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        Persona p1 = new Persona (leer.next(),leer.nextInt(),1.70);
        System.out.println(" "+p1.nombre+" "+p1.edad+" "+p1.altura);
    }
}
