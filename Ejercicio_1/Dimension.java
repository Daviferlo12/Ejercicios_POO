package Ejercicio_1;


class Dimension{
//Propiedades
  private int Alto;
  private int Ancho;
  private int Profundidad;

//Constructor
  public Dimension(){
    this.Alto = 0;
    this.Ancho= 0;
    this.Profundidad = 0;
  }

  public Dimension(int alto, int ancho, int profundidad){
    this.Alto = alto;
    this.Ancho= ancho;
    this.Profundidad = profundidad;
  }

// Setters
  public void SetAlto(int alto){
    this.Alto = alto;
  }
  
    public void SetAncho(int ancho){
    this.Ancho = ancho;
  }

    public void SetProfundidad(int profundidad){
    this.Profundidad = profundidad;
  }

// Getter
  public int GetAlto(){
    return Alto;
  }
  
  public int GetAncho(){
    return Ancho;
  }

  public int GetProfundidad(){
    return Profundidad;
  }


//Metodos

  public int getVolumen(){
    return Alto * Ancho * Profundidad;
  }

  public String toString(){
    return "Dimension => Alto:"+GetAlto()+"| Ancho:"+GetAncho()+"|         Profundidad:"+GetProfundidad()+"| Volumen: "+ getVolumen();
  }
  
  
}