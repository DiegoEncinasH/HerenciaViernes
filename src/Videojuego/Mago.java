package Videojuego;

public class Mago extends Personaje{

	@Override
	public void atacar(Personaje p) {
		System.out.println("alcazam!!!");
		getArma().usar(p);
	}

	


	}
