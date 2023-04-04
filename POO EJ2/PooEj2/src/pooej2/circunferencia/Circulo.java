//Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. 
//A continuación, se deben crear los siguientes métodos:
//* Método constructor que inicialice el radio pasado como parámetro.
//* Métodos get y set para el atributo radio de la clase Circunferencia.
//* Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
//* Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
//* Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
package pooej2.circunferencia;
public class Circulo {
    private double radio;
    public Circulo(double radio){
        this.radio = radio;
    }
    public void setRadio(double radio){
        this.radio = radio;
    }
    public double getRadio(){
        return this.radio;
    }
    public double getArea(){
        return (Math.pow((3.14 * this.radio),2));
    }
    public double getPerimetro(){
        return 2 * 3.14 * this.radio;
    }
}
