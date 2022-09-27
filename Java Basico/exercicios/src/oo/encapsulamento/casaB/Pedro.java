package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{

	void testeAcessos() {
		//OBS: Desnecessário Criar uma instancia de 'Ana algo = new Ana()', pois já há uma herança;
		
		// System.out.println(esposa.segredo); // private
		// System.out.println(facoDentroDeCasa); // apenas no mesmo Pacote
		System.out.println(formaDeFalar); // protected porém herdado
		System.out.println(todosSabem); // publico
		
	}
}
