package tp3;

public class Aluno {
	
	String nomes;
	static float av1;
	static float av2;
	static float media;
	
	private int posicao;
	
	private final static int qtde = 100;
	
	Aluno(){
		this.nomes ="Aluno não cadastrado";
		
	}
		Aluno(String nomes, float av1) {
		this();
		this.nomes = nomes;
		this.av1 = av1;
	}
	Aluno(String nomes, float av1, float av2, float media) {
		this(nomes, av1);
		this.media = media;
	}
	
	private static String situacaoMedia(float media) {
        String result = "";

            if(media < 4) {
                result = "Reprovado";
            } else if (media >= 4 && media <= 7) {
                    result = "Prova Final";
                } else {
                    result = "Aprovado";
                    }

                    System.out.println(result);
                    return result;
                }
	
	private float calculoMediaLiquida() {
		float calculoMedia = (av1 + av2) / 2;
		media = calculoMedia;
			return calculoMedia;
	}
	
	void impressao() {
		
		float mediaTotal = calculoMediaLiquida();
	
		System.out.printf("[%d] %s - || R$%.2f : %s\n", 
				posicao, 
				nomes, 
				mediaTotal, 
				situacaoMedia(mediaTotal));
	}

	
	
	@Override
	public String toString() {
		return  nomes + ", minhas notas AV1: " + av1 + " AV2: " + av2 + " como media de: " + media;
	}

}
