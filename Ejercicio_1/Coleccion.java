package Ejercicio_1;

import java.util.ArrayList;

public class Coleccion {
  private String nombreColeccion;
  private ArrayList<Figura> listaFiguras;

  // Constructor
  public Coleccion(String nombreColeccion) {
    this.nombreColeccion = nombreColeccion;
    listaFiguras = new ArrayList<>();
  }

  // Setters
  public void setNombreColeccion(String nombreColeccion) {
    this.nombreColeccion = nombreColeccion;
  }

  // Getters
  public String getNombreColeccion() {
    return nombreColeccion;
  }

  // Metodos modificadores
  public void subirPrecio(double cantidad, int id) {
    for (Figura figura : listaFiguras) {
      if (figura.GetCodigo() == id) {
        figura.SubirPrecio(cantidad);
      }
    }
  }

  public void añadirFigura(Figura fig) {
    listaFiguras.add(fig);
  }

  // Metodos

  @Override
  public String toString() {
    String cadena = "Colección " + nombreColeccion + "\n[*][*][*][*][*]\n";

    for (Figura figura : listaFiguras) {
      cadena += figura + "\n";
    }

    return cadena;
  }

  public String conCapa() {
    String cadena = "Figuras de superhéroes con capa\n---------------\n";
    for (Figura figura : listaFiguras) {
      if (figura.GetHeroe().IsCapa()) {
        cadena += figura + "\n";
      }
    }

    return cadena;
  }

  // Metodos observadores
  public Figura masValioso() {
    double precio_mayor = 0.0;
    Figura fi_Mayor = null;

    for (Figura figura : listaFiguras) {
      if (figura.GetPrecio() > precio_mayor) {
        precio_mayor = figura.GetPrecio();
        fi_Mayor = figura;
      }
    }

    return fi_Mayor;
  }

  public double getValorColeccion() {
    double valor = 0;
    for (Figura figura : listaFiguras) {
      valor += figura.GetPrecio();
    }
    return valor;
  }

  public double getVolumenColeccion() {
    double vol = 0;
    for (Figura figura : listaFiguras) {
      vol += figura.Getdimension().getVolumen();
    }
    return vol + 200;
  }

}
