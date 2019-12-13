
public class Animal {
	private double peso;
	private String Nombre;
	private int edad;
	
	public void comer(Object comida) {
		
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Animal [peso=" + peso + ", Nombre=" + Nombre + ", edad=" + edad + "]";
	}
	

}
