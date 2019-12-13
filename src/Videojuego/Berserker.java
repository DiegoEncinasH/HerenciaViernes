package Videojuego;

public class Berserker extends Personaje{

	@Override
	public void atacar(Personaje p) {
		System.out.println("DEMACIAAAAAAAAAA!!!!HOY Y POR SIEMPRE!");
		getArma().usar(p);
	}


}