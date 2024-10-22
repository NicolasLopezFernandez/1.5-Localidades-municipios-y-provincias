public class Localidad {
  private String nombre;
  private int numeroDehabitantes;

  public Localidad(String nombre, int numeroDeHabitantes) {
    this.nombre = nombre;
    this.numeroDehabitantes = numeroDeHabitantes;
  }
  public void setNombre() {
    this.nombre = nombre;
  }
  public String getNombre() {
    return nombre;
  }
  public int setNumeroDeHabitantes{
    this.numeroDehabitantes = numeroDehabitantes;
  }
  public int getNumeroDeHabitantes() {
    return numeroDehabitantes;
  }
    public String toString() {
      StringBuilder sb = new StringBuilder ();
      sb.append("Nombre: ").append(nombre).append("Numero de habitantes= ").append(numeroDehabitantes);
      return sb.toString();
    }
}
