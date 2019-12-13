import java.util.ArrayList;

public class MainAnimales {
		
	public static void main(String[] args) {
		Tiburon t = new Tiburon();
		t.setNombre("Calamardo");
		t.setEdad(5);
		t.setNumeroAletas(27);
		t.setPeso(250);
		
		Trucha trucha = new Trucha();
		t.setNombre("Nemo");
		t.setEdad(2);
		t.setNumeroAletas(1);
		t.setPeso(3.5);
		
		Oso oso = new Oso();
		t.setNombre("EEEEEEE");
		t.setEdad(5);
		t.setNumeroAletas(27);
		t.setPeso(250);
		
		ArrayList<Animal> listaAnimales = new ArrayList<Animal>();
		listaAnimales.add(t);
		listaAnimales.add(trucha);
		listaAnimales.add(oso);
		Trucha comida = new Trucha();
		comida.setNombre("bob");
		comida.setPeso(5);
		System.out.println(listaAnimales);
		for (Animal a : listaAnimales) {
			a.comer(comida);
		}
		System.out.println(listaAnimales);
	}

}
