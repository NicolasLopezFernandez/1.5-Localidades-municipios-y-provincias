import java.util.ArrayList;

public class Municipio {
  private List<Localidad> localidades;

  public Municipio(String) {
    this.localidades = new ArrayList<>();
  }
  public void agregarLocalidad(Localidad localidad) {
    localidades.add(localidad)
      }
  public int contarHabitantes() {
    int totalhabitantes = 0
      for (Localidad localidad : localidades) {
      totalhabitantes += localidad.getNumeroDeHabitantes();
    }
    return totalHabitantes;
  }
  public String toString(){
    return "Localidad{" + "nombre= " + nombre + "\ " + ", Numero de Habitantes= " + numeroDeHanitantes + "}" ;
}
