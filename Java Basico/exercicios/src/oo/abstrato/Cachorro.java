package oo.abstrato;

public class Cachorro extends Mamifero{
	
//	Não pode ser sobrescrito, já que na classe mamífero este método está como final!
//	public String mover() {
//		return "Usando as patas";
//
//	}

	public String mamar() {
		return "Usando leite";
	}
	
}
