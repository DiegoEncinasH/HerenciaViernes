
public class Oso extends Animal {

	@Override
	public void comer(Object comida) {

	if (comida instanceof Oso) {
		return;
	}else if (comida instanceof Animal) {
		Animal a = (Animal)comida;
		System.out.println("Soy un oso y voy a comerme al animal " + a.getNombre() );
		double engordar = a.getPeso()/2;
		this.setPeso(this.getPeso() + engordar);
	}else {
		System.out.println("Como de todo menos osoooooooooooos");
	}
	
	}
			
	
	
}
