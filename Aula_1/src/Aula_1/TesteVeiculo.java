package Aula_1;

import java.util.Scanner;

public class TesteVeiculo {
	public static void main(String[] arg) {
		
		Veiculo vei1 = new Veiculo();
		Veiculo vei2 = new Veiculo();
		
		Scanner into = new Scanner(System.in);
		
		System.out.println("Digite o modelo do carro: ");
		vei1.modelo = into.next();
		System.out.println("Digite a marca do carro: ");
		vei1.marca = into.next();
		System.out.println("Digite o ano do carro: ");
		vei1.ano = into.nextInt();
		System.out.println("Digite o valor do carro: ");
		vei1.valor = into.nextDouble();
		
		vei1.calcIpva();
		
		System.out.println("Digite o modelo do carro: ");
		vei2.modelo = into.next();
		System.out.println("Digite a marca do carro: ");
		vei2.marca = into.next();
		System.out.println("Digite o ano do carro: ");
		vei2.ano = into.nextInt();
		System.out.println("Digite o valor do carro: ");
		vei2.valor = into.nextDouble();
		
		vei2.calcIpva();
		
		System.out.println("O modelo: "+vei1.modelo);
		System.out.println("O valor: RS$"+vei1.valor);
		System.out.println("O valo do IPVA: RS$"+vei1.ipva);
		
		System.out.println("O modelo: "+vei2.modelo);
		System.out.println("O valor: RS$"+vei2.valor);
		System.out.println("O valo do IPVA: RS$"+vei2.ipva);
		
	}
	
}
