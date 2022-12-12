package Ejercicio_2;


public class Electrodomestico {
    protected String Tipo;
    protected String Marca;
    protected double Potencia;


//Constructor
    public Electrodomestico(String tipo, String marca, double potencia) {
        this.Tipo = tipo
        this.Marca = marca;
        this.Potencia = potencia;
    }

  
//Setters

    public void setTipo(String tipo) {
        this.Tipo = tipo;
    }

    public void setMarca(String marca) {
        this.Marca = marca;
    }

    public void setPotencia(double potencia) {
        this.Potencia = potencia;
    }


  //Getters
    public String getTipo() {
        return Tipo;
    }

    public String getMarca() {
        return Marca;
    }

    public double getPotencia() {
        return Potencia;
    }



  // Metodos
    @Override
    public String toString() {
        return "Electrodomestico ==> " + "tipo:" + Tipo + ", marca:" + Marca + ", potencia:" + Potencia + " kW" + '}';
    }
    
    public double getConsumo(int horas) {
        return Potencia * horas;
    }
    
    public double getCosteConsumo(int horas, double costeHora) {
        return getConsumo(horas) * costeHora;
    }
    
}
