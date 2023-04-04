//Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura. 
//La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. 
//También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo. 
//Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. 
//Se deberán además definir los métodos getters, setters y constructores correspondientes.
//Superficie = base * altura / Perímetro = (base + altura) * 2.
package pooej4.Cuadrado;

public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo(double base,double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
        this.base = 0;
        this.altura = 0;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return this.base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return this.altura;
    }

    public double getSuper() {
        return base * altura;
    }

    public double getPeri() {
        return (base + altura) * 2;
    }
    public int getRectangulo() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("  ");
                System.out.print("*");
            }
            System.out.println();
        }
        return 0;
    }
}
