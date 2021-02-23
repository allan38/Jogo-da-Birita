package course;

import java.util.Random;
import java.util.Scanner;



public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Random gerador = new Random();
		 Scanner sc = new Scanner(System.in);
		 
		 int numeroSorteado = gerador.nextInt(101);
		 int maior = 100;
		 int menor = 0;
		 
		 System.out.println("Escolha um numero entre " + menor + " e " + maior + ": ");
		 int numeroEscolhido = sc.nextInt();
		 
		 while(numeroEscolhido != numeroSorteado) {
			 if(numeroEscolhido < numeroSorteado) {
				 menor = numeroEscolhido;
				 System.out.println("Escolha um numero entre " + menor + " e " + maior + ": ");
				 numeroEscolhido = sc.nextInt();
				 sc.nextLine();
				 while(numeroEscolhido < menor || numeroEscolhido > maior) {
					 menor = menor;
					 maior = maior;
					 System.out.println("Escolha um numero entre " + menor + " e " + maior + ": ");
					 numeroEscolhido = sc.nextInt();
				 }
			 }else if (numeroEscolhido > numeroSorteado) {
				 maior = numeroEscolhido;
				 System.out.println("Escolha um numero entre " + menor + " e " + maior + ": ");
				 numeroEscolhido = sc.nextInt();
				 while(numeroEscolhido < menor || numeroEscolhido > maior) {
					 menor = menor;
					 maior = maior;
					 System.out.println("Escolha um numero entre " + menor + " e " + maior + ": ");
					 numeroEscolhido = sc.nextInt();
				 }
			 }
		 }
		 
		 System.out.println("Você acertou! o numero sorteado foi o: " + numeroSorteado);
		
	}

}
