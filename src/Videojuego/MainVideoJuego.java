package Videojuego;

public class MainVideoJuego {

	public static void main(String[] args) {
		Personaje p1;
		Personaje p2;
		
//		Guerrero g1 = new Guerrero();
//		g1.setNombre("Juan el oscuro");
//		g1.setVida(300);
//		Espada e1 = new Espada();
//		e1.setDaño(30);
//		e1.setTipoArma("Espada Corta");
//		g1.setArma(e1);
//		
//		Mago mago = new Mago();
//		mago.setNombre("Lucifer");
//		mago.setVida(150);
//		Varita varita = new Varita();
//		varita.setDaño(90);
//		varita.setTipoArma("palo de sauco");
//		mago.setArma(varita);

		int aux;
		aux = (int) ((Math.random() * 3) + 1);
		if (aux == 1) {
			p1 = new Berserker();
			p1.setNombre("Vicius");
			p1.setVida(1000);
		} else if (aux == 2) {
			p1 = new Mago();
			p1.setNombre("Lucifer");
			p1.setVida(820);
		} else {
			p1 = new Guerrero();
			p1.setNombre("Juan el oscuro");
			p1.setVida(1250);
		}
		int help = aux;
		while (aux == help) {
			aux = (int) ((Math.random() * 3) + 1);
		}
		if (aux == 1) {
			p2 = new Berserker();
			p2.setNombre("Vicius");
			p2.setVida(1000);
		} else if (aux == 2) {
			p2 = new Mago();
			p2.setNombre("Lucifer");
			p2.setVida(820);
		} else {
			p2 = new Guerrero();
			p2.setNombre("Juan el oscuro");
			p2.setVida(1250);
		}

		aux = (int) ((Math.random() * 3) + 1);
		switch (aux) {
		case 1:
			Varita varita = new Varita();
			varita.setDaño(90);
			varita.setCritico(15);
			varita.setFallo(15);
			varita.setTipoArma("Varita");
			if (p1.getClass() == Mago.class) {
				varita.setDaño(120);
				varita.setFallo(10);
				varita.setTipoArma("EL PALITROKE");
			}
			p1.setArma(varita);
			break;
		case 2:
			Espada espada = new Espada();
			espada.setDaño(40);
			espada.setCritico(35);
			espada.setFallo(8);
			espada.setTipoArma("Espada");
			if (p1.getClass() == Guerrero.class) {
				espada.setDaño(60);
				espada.setFallo(3);
				espada.setTipoArma("Scalibur");
			}
			p1.setArma(espada);
			break;
		case 3:
			Arco arco = new Arco();
			arco.setDaño(70);
			arco.setCritico(20);
			arco.setFallo(23);
			arco.setTipoArma("Arco");
			if (p1.getClass() == Berserker.class) {
				arco.setDaño(140);
				arco.setFallo(40);
				arco.setTipoArma("Ballesta");
			}
			p1.setArma(arco);
			break;
		default:
			break;
		}
		help = aux;
		while (aux == help) {
			aux = (int) ((Math.random() * 3) + 1);
		}
		switch (aux) {
		case 1:
			Varita varita = new Varita();
			varita.setDaño(90);
			varita.setCritico(15);
			varita.setFallo(15);
			varita.setTipoArma("Palillo");
			if (p2.getClass() == Mago.class) {
				varita.setDaño(120);
				varita.setFallo(10);
				varita.setTipoArma("EL PALITROKE");
			}
			p2.setArma(varita);
			break;
		case 2:
			Espada espada = new Espada();
			espada.setDaño(40);
			espada.setCritico(35);
			espada.setFallo(8);
			espada.setTipoArma("Espada Corta");
			if (p2.getClass() == Guerrero.class) {
				espada.setDaño(60);
				espada.setFallo(3);
				espada.setTipoArma("Scalibur");
			}
			p2.setArma(espada);
			break;
		case 3:
			Arco arco = new Arco();
			arco.setDaño(70);
			arco.setCritico(25);
			arco.setFallo(23);
			arco.setTipoArma("Arco");
			if (p2.getClass() == Berserker.class) {
				arco.setDaño(140);
				arco.setFallo(40);
				arco.setTipoArma("Ballesta");
			}
			p2.setArma(arco);
			break;
		default:
			break;
		}
		System.out.println(
				"DIN DIN DIN LA BATALLA VA A EMPEZAR, SE ENFRANTARÁN:\n" + p1.getNombre() +   " Con su inugualable "
						+ p1.getArma().getTipoArma() + "\nContra " + p2.getNombre() + " Con su certeza con " + p2.getArma().getTipoArma());
		while (p1.getVida()>0 && p2.getVida()>0) {
			p1.atacar(p2);
			if (p2.getVida()<0) {
				System.out.println(p1.getNombre() + " Ha salido vencedorrr a caido " + p2.getNombre());
			help=21;
			}else {
				System.out.println(p2.getNombre() + "me quedan: " + p2.getVida());
			}
			
			if (help!=21) {
			p2.atacar(p1);
			if (p1.getVida()<0) {
				System.out.println(p2.getNombre() + " Ha salido vencedorrr a caido " + p1.getNombre());
			}else {
				System.out.println(p1.getNombre() + " me quedan: " + p1.getVida());
			}
			}
		}
		

//		
//		//aleatoriamente crearaia uno al p1 y otro al p2
//		
//		int aux;
//		Guerrero g1 = new Guerrero();
//		Mago m1 = new Mago();
//		Berserker b1 = new Berserker();
//		Arco arco = new Arco();
//		Varita varita = new Varita();
//		Espada espada = new Espada();
//		
//		espada.setTipoArma("El filo del mal");
//		varita.setTipoArma("El conjuro oscuro");
//		arco.setTipoArma("La flecha infinita");
//		
//		aux = (int)((Math.random()*3)+1);
//		if (aux==3) {
//			p1 = new Guerrero();
//			p1.setRol("Guerrero");
//		}else if(aux==2) {
//			p1.setRol("Berserker");
//		}else {
//			p1.setRol("Magoo");
//		}
//		aux = (int)((Math.random()*3)+1);
//		if (aux==3) {
//			p2.setRol("Guerrero");
//		}else if(aux==2) {
//			p2.setRol("Berserker");
//		}else {
//			p2.setRol("Magoo");
//		}
//		
//	//2	p1.setArma(espada);
//		g1.atacar();
		
	}
	public void arquero() {
		
	}

}