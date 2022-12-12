package Ejercicio_1;

// Clase
public class SuperHeroe {
  private String nombre;
  private String descripcion;
  private boolean capa;

  // Constructores
  public SuperHeroe() {

  }

  public SuperHeroe(String nombre) {
    this.nombre = nombre;
    this.descripcion = "";
    this.capa = false;
  }

  // setter
  public void SetNombre(String nombre) {
    this.nombre = nombre;
  }

  public void SetDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public void SetCapa(boolean capa) {
    this.capa = capa;
  }

  // Getter
  public String GetNombre() {
    return nombre;
  }

  public String GetDescripcion() {
    return descripcion;
  }

  public boolean IsCapa() {
    return capa;
  }

  // ToString Method
  public String toString() {
    String superHeroe = "SuperHeroe : -Nombre " + GetNombre() + "\n - Descripcion" + GetDescripcion() + " \n - Capa:" + capa;

    return superHeroe;
  }

}