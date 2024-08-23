package Aula_1;

public class Aluno {
	String nome;
	String status;
	Double n1;
	Double n2;
	Double media;
	
	void calcMedia() {
		media = (n1 + n2)/2;
		
		if (media >= 5)
			status = "Aprovado";
		else if ( media < 4 ) 
			status = "Reprovado";
			else
				status = "Em exame";
		
	}
}
