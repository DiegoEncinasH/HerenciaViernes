
public class Pez extends Animal{

	
	private int numeroAletas;	
	
	@Override
	public void comer(Object comida) {
		if (comida instanceof Plactom) {
				System.out.println("Soy un placton que se va a comer a otro placton uhmmmmmmmmmmm...");
				Plactom p = (Plactom) comida;
				double engordar = p.getPeso() / 2;
				this.setPeso(this.getPeso() + engordar);
				System.out.println("Mi nuevo peso: " + this.getPeso());
			}else {
				System.out.println("Que ascoooooooooooooooooooo!");
			}
		}
	public int getNumeroAletas() {
		return numeroAletas;
		
	}

		
}
