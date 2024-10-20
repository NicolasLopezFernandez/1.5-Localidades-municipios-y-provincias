import java.util.ArrayList;

public class Municipio {
  private List<Localidad> localidades;

  public Municipio(String) {
    this.localidades = new ArrayList<>();
  }
  public void agregarLocalidad(Localidad localidad) {
    localidades.add(localidad)
      }
}
