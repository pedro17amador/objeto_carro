package exercicio;

public class objetocarro {
	public static void main (String[] args) {
		carro car = new carro();
		car.cor = "Azul";
		car.modelo = "Fiat";
		car.motor = "1.6";
		
		car.ligar();
		car.desligar();
		car.acelerar();
		car.mudarMarcha();
		car.brecar();
		
		System.out.println("A cor é " + car.cor);
		System.out.println("O modelo é " + car.modelo);
		System.out.println("O motor é " + car.motor);
	}
}
