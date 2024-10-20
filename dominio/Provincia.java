import .java.util.ArrayList
  
public class Provincia {
  private List<Municipio> municipios;

  public Provincia (String) {
  this.provincia = new ArrayList<>();
}
  public void agregarMunicipios(Municipio municipio) {
    municipios.add(municipio);
  }
  public int contarHabitantes() {
    int totalDeHabitantes = 0
    for (Municipio municipio : municipios);
      totalDeHabitantes += municipio.contarHabitantes();
  
  return totalDehabitantes;
  }
  public String toString() {
      return "Provincia{" + "nombre= " + nombre + "\ " + ", Municipios= " + Municipios + "}" ;

} 
}
