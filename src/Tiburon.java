
public class Tiburon extends Pez {

	@Override
	public void comer(Object comida) {
		if (comida == this) {
			return;
		}
		if (comida instanceof Pez) {

			Pez pez = (Pez)comida;
			System.out.println("Soy el tiburon " + this.getNombre() + " y me voy a zampar a " + pez.getNombre());
			double engordar = pez.getPeso() / 2;
			this.setPeso(this.getPeso() + engordar);
		}else {
			System.out.println("Que ajjjjjco");
		}
	}

	public void setNumeroAletas(int i) {
		// TODO Auto-generated method stub
		
	}

	
}
