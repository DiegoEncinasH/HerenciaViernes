package Videojuego;

public class Arco extends Arma {
	
	@Override
	public void usar(Personaje p) {
		aux = (int) ((Math.random() * 100) + 1);
		if (aux > getFallo()) {
			aux = (int) ((Math.random() * 100) + 1);
			if (aux > getCritico()) {
				p.setVida(p.getVida() - getDa�o());	
			}else {
				p.setVida(p.getVida() - (getDa�o()*2));	
				System.out.println("crit");
			}
		}else {
			System.out.println("La" + getTipoArma()  + " no ha sido certera...");
		}
		
		
	}


}
