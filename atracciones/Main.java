package atracciones;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Composición
		Habitat habitat=new Habitat("Selva", 200);
		Zoologico zoo=new Zoologico("zoologico", "Parque de las Leyendas", "20428729201", 20, habitat);
		
		//Asociación
		Director dir=new Director("Pedro", "Castillo", true);
		zoo.setGuardia(dir);
		
		//Agregación
		Animal panda=new Animal("Panda", "Ursidae", 4);
		Animal leon=new Animal("Leon", "Felidae", 7);
		Animal[] animales= {panda, leon};				
		zoo.setAnimales(animales);
		
		System.out.println(zoo.toString());
		zoo.calcularGanancias();
	}
}
