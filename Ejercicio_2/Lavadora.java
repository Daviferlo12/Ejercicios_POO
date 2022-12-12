package Ejercicio_2;

public class Lavadora extends Electrodomestico {
    
    private double precio;
    private boolean aguaCaliente;

//Constructores
    public Lavadora(String marca, double potencia) {
        super("Lavadora",marca,potencia);
        precio = 0;
        aguaCaliente = false;
    }
    
    public Lavadora(String marca, double precio, double potencia, boolean aguaCaliente) {
        super("Lavadora",marca,potencia);
        this.precio = precio;
        this.aguaCaliente = aguaCaliente;
    }


  //Setters
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

  //Getters

    public double getPrecio() {
        return precio;
    }

    public boolean isAguaCaliente() {
        return aguaCaliente;
    }


  //Metodos
    @Override
    public String toString() {
        return "Lavadora{" + "marca=" + Marca + ", potencia=" + Potencia +
                ", precio=" + precio + ", aguaCaliente=" + aguaCaliente + '}';
    }
    
    @Override
    public double getConsumo(int horas) {
        if(aguaCaliente) {
            return (Potencia + Potencia*0.20) * horas;
        } else {
            return Potencia * horas;
        }
    }
    
}
