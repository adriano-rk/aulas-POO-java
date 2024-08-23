package Aula_1;

public class Veiculo {
	String modelo;
	String marca;
	Integer ano;
	Double valor;
	Double ipva;
	
	void calcIpva () {
		
		if (valor < 4000.0) {
			ipva = valor*2/100;
		} else if (valor < 60000.0) {
			ipva = valor*0.03;
		} else if (valor < 9000.0) {
			ipva = valor*5/100;
		} else {
			ipva = valor*0.05;
		}
	}
}
