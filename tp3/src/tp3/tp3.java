package tp3;


import java.util.Scanner;

public class tp3 {
	
	
	private static String[] nomes;
	private static float[] av1;
	private static float[] av2;
	private static float[] media;

	private final static int qtde = 100;

	
	private static void impressao(int posicao) {
		
		float mediaTotal = calculoMediaLiquida(posicao);
	
		System.out.printf("[%d] %s - || R$%.2f : %s\n", 
				posicao, 
				nomes[posicao], 
				mediaTotal, 
				situacaoMedia(mediaTotal)
			);
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

	
	private static float calculoMediaLiquida(int posicao) {
		float calculoMedia = (av1[posicao] + av2[posicao]) / 2;
		media[posicao] = calculoMedia;
			return calculoMedia;
	}
	
	public static void main(String[] args) {
		nomes = new String[qtde];
		av1 = new float[qtde];
		av2 = new float[qtde];
		media = new float[qtde];
		
		Scanner in = new Scanner(System.in);
		
		String opcao = null;

		int index = 0;
		
		do {
			System.out.println("[1] Registrar as notas de um novo aluno. ");
			System.out.println("[2] Consultar boletim de um aluno.");
			System.out.println("[3] Consultar notas da turma.");
			System.out.println("[4] Sair");
			System.out.print("Informe a opção desejada: ");
			
			opcao = in.next();

			switch (opcao) {
			case "1":
				if(index < qtde) {
					System.out.println("Nome do Aluno: ");
					nomes[index] = in.next();
	
					System.out.println("Nota da AV1:  ");
					av1[index] = in.nextFloat();
	
					System.out.println("Nota da AV2: ");
					av2[index] = in.nextFloat();
	
					System.out.println("Media total: " + calculoMediaLiquida(index));
			
					
					System.out.println("-----------------------------------");
					System.out.println("Aluno e Notas cadastrado com sucesso:");
					impressao(index);
					System.out.println("-----------------------------------");
					System.out.println("");
					
					index++;
				} else {
					System.out.println("-----------------------------------");
					System.out.println("Seu plano permite 100 cadastros! ");
					System.out.println("Entre em contato com suporte p/ Alteração de plano!");
					System.out.println("-----------------------------------");
					System.out.println("");
				}
				break;
			case "2":
				System.out.println("Informe o código do funcionário: ");
				int codigo = in.nextInt();
								
				if(codigo >= 0 && codigo < index) {
					impressao(codigo);
				} else {
					System.out.println("-----------------------------------");
					System.out.println("Este código não existe!!!");
					System.out.println("-----------------------------------");
					System.out.println("");
				}
				
				break;
				
			case "3":
				for(int i = 0;i<index;i++) {
					impressao(i);
				}
				break;
				
			case "4":
				System.out.println("Saindo.");
				break;

			default:
				System.out.println("Opção inválida!");
				break;
			}
			
		} while (!"4".equals(opcao));
		
		System.out.println("Terminou!!!");
		
		in.close();
	}

}
