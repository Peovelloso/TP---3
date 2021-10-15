package tp3;

public class AlunoTeste {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.nomes = "Paulo";
		aluno1.av1 = 10;
		aluno1.av2  = 10;
		aluno1.media  = 10;
		aluno1.impressao();
		
		Aluno aluno2 = new Aluno();
		aluno2.nomes = "Joao";
		aluno2.av1 = 7;
		aluno2.av2  = 7;
		aluno2.media  = 7;
		aluno2.impressao();
		
		Aluno aluno3 = new Aluno("Carlinhos", 8, 0, 0);
		aluno3.nomes = "Carlinhos";
	    aluno3.av1 = 8;
		aluno3.av2  = 9;
		aluno3.media  = (float) 8.5;
		aluno3.impressao();	
		
		Aluno aluno4 = new Aluno("Zequinha", 8, 8, 8);
		aluno4.impressao();		

		System.out.println("Fim!");
		
	}

}
