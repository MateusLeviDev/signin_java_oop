/* 
 * 
 * @Author: MateusLeviDev
 * */ 

package signin_java_oop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//options
		
		String nome, cpf;
		int opc, gradesQtd;
		sala novaSala = new sala();
		aluno novoAluno = new aluno(); //objeto do tipo aluno
		float grade = 0;
		
		do {
			System.out.println("\n---------------");
			System.out.println("        MENU");
			System.out.println("Escolher uma opção");
			System.out.println("1 - inserir aluno");
			System.out.println("2 - listar aluno");
			System.out.println("3 - situações");
			System.out.println("0 - sair");
			opc = sc.nextInt();
			
			switch (opc) {
			
			case 1: 
				
				System.out.print("Nome");
				sc.nextLine();
				
				nome = sc.nextLine();
				
				System.out.println("CPF");
				cpf = sc.nextLine();
				
				novoAluno = new aluno(nome, cpf);
				
				//loop para número indefinido de notas. Arbitrária
				System.out.println("Número de notas: ");
				gradesQtd = sc.nextInt();
				for (int i = 0; i < gradesQtd; i++) {
					System.out.println("Nota: " + (i + 1));
					grade = sc.nextFloat();
					novoAluno.insereNotas(grade);
				} 
				
				novaSala.insereAluno(novoAluno);
				
				break;
				
			case 2: //menu options
				novaSala.listarAlunos();;
				break;
				
			case 3: 
				novaSala.listarSituacao();;
				break;
				
			case 0: 
				System.out.println("Autodestruição...");
				
			default:
				System.out.println("\nOpção inválida");
				
			}
			
			
		} while (opc != 0); 
		
		sc.close();
	}

}
