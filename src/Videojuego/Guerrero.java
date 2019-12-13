package Videojuego;

public class Guerrero extends Personaje{

	@Override
	public void atacar(Personaje p) {
		System.out.println("ARGGGGGGGGGGG");
		getArma().usar(p);
	}


}