package Aula_1;

public class TesteAluno {
	
	public static void main(String[] args) {
		
		Aluno alu1 = new Aluno();
		Aluno alu2 = new Aluno();
		Aluno alu3 = new Aluno();
		
	
		alu1.nome = "Lula";
		alu1.n1 = 7.0;
		alu1.n2 = 9.0;
		
		alu1.calcMedia();
		
		alu2.nome = "Bolsonaro";
		alu2.n1 = 5.0;
		alu2.n2 = 4.0;
		
		alu2.calcMedia();

		alu3.nome = "Padre Kelmon";
		alu3.n1 = 2.0;
		alu3.n2 = 1.0;
		
		alu3.calcMedia();
		
		System.out.println("o nome: "+alu1.nome);
		System.out.println("A media: : "+alu1.media);
		System.out.println("o Status: "+alu1.status);
		
		System.out.println("o nome: "+alu2.nome);
		System.out.println("A media: : "+alu2.media);
		System.out.println("o Status: "+alu2.status);
		
		System.out.println("o nome: "+alu3.nome);
		System.out.println("A media: : "+alu3.media);
		System.out.println("o Status: "+alu3.status);
	
	}

}
