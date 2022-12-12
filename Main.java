import Ejercicio_1.SuperHeroe;

class Main {
  public static void main(String[] args) {

    SuperHeroe super2 = new SuperHeroe();

    super2.SetNombre("Batman");
    super2.SetDescripcion("El caballero de la noche, el cual tiene capa negra o roja");
    super2.SetCapa(true);

    System.out.println(super2);

  }
}