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
		
		System.out.println("A cor � " + car.cor);
		System.out.println("O modelo � " + car.modelo);
		System.out.println("O motor � " + car.motor);
	}
}
