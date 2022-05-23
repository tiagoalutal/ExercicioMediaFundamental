import java.util.Scanner;

 class fundamental {
	public static void main(String[]args) {
		
		Scanner ler = new Scanner(System.in); //criando o scanner 
		double nota1,nota2,nota3; 
		//declarando as variaveis.
		double notaF = 0; 
		//variavel que guarda a nota final.
		int Codigo = 1; 
		//varaivel que guarda o codigo do aluno.
		
		System.out.println("Digite seu codigo ");
		Codigo = ler.nextInt(); 
		//ler o codigo digitado.
		
		
		while(Codigo != 0)
		//excuta o programa caso o codigo do aluno nao seja 0.
		{
			
			System.out.println("Digite a primeira nota ");
			nota1 = ler.nextInt(); 
			System.out.println("Digite a segunda nota ");
			nota2 = ler.nextInt(); 
			System.out.println("Digite a terceira nota ");
			nota3 = ler.nextInt();
			
			notaF = (nota1+nota2+nota3)/3;
			//calculando a media das 3 notas.
			
			break; 
			// para parar o loop apos o processo ser executado.
		}
		if(notaF >= 8)
		//se a media for maior ou igual a 8 printar na tela a mensagem abaixo.
		{ 
			System.out.println("Voce esta Aprovado !");
			
		}
		else if(notaF <8 && notaF > 6 )
		//se a media for maior que 6 e menor que 8 printar na tela a mensagem abaixo.
		{ 
			System.out.println("Voce Ficou de recuperacao");
			
		}
		else 
		// caso a nota seja menor que 6 printar na tela a mensagem abaixo
			System.out.println("Voce esta Reprovado");
	}
}
