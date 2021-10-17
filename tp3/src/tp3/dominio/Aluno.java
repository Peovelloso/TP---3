package tp3.dominio;

public class Aluno {
	
	public String nomes;
	public static float av1;
	public static float av2;
	public static float media;
	
	private int posicao;
		
	public Aluno(){
		this.nomes ="Aluno não cadastrado";
	}
	public Aluno(String nomes, float av1) {
		this();
		this.nomes = nomes;
		this.av1 = av1;
	}
	public Aluno(String nomes, float av1, float av2, float media) {
		this(nomes, av1);
		this.media = media;
	}
	
		public static String situacaoMedia(float media) {
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
	
		public float calculoMediaLiquida() {
		float calculoMedia = (av1 + av2) / 2;
		media = calculoMedia;
			return calculoMedia;
	}
	
	public void impressao() {
		
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
