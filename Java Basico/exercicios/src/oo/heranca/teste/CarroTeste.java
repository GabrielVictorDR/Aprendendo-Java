package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {

	public static void main(String[] args) {

		Carro c1 = new Civic();

		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		System.out.println("Civic: " + c1.toString());

		Ferrari c2 = new Ferrari();

		c2.acelerar();
		System.out.println("Ferrari: " + c2.toString());
		c2.ligarTurbo();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		System.out.println("Ferrari: " + c2.toString());
		c2.desligarTurbo();
		c2.acelerar();
		System.out.println("Ferrari: " + c2.toString());
	}

}
