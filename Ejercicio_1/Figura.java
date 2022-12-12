package Ejercicio_1;

class Figura {

  private int Codigo;
  private double Precio;

  private SuperHeroe super_heroe;
  private Dimension dimension;

  // Constructor
  public Figura(int codigo, double precio, Dimension dimension, SuperHeroe super_heroe) {

    this.Codigo = codigo;
    this.Precio = precio;
    this.super_heroe = super_heroe;
    this.dimension = dimension;
  }

  // Setters
  public void SetCodigo(int codigo) {
    this.Codigo = codigo;
  }

  public void SetPrecio(double precio) {
    this.Precio = precio;
  }

  public void SetHeroe(SuperHeroe heroe) {
    this.super_heroe = heroe;
  }

  public void SetDimension(Dimension dimension){
    this.dimension = dimension;
  }

  // Getters

  public int  GetCodigo(){
    return Codigo;
  }

  public double GetPrecio(){
    return Precio;
  }

  public SuperHeroe GetHeroe(){
    return super_heroe;
  }
  
  public Dimension Getdimension(){
    return dimension;
  }

  // Metodos

  public String toString(){
    return "Figura ==> Codigo: "+GetCodigo()+"Precio:"+GetPrecio()+"SuperHeroe: "+GetHeroe()+"Dimension:"+Getdimension();
  }

  public void SubirPrecio(double monto){
    this.Precio = this.Precio + monto;
  }

}
