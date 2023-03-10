/* 
 * 
 * @Author: MateusLeviDev
 * */

package signin_java_oop;
import java.util.ArrayList;


public class sala {
	ArrayList<aluno> ListaDeAlunos;
	
	public sala() {
			this.ListaDeAlunos = new ArrayList<>();
	}

	void insereAluno(aluno novoRegristro) {
		novoRegristro.sumGrade();
		ListaDeAlunos.add(novoRegristro);
	}
	
	void listarAlunos() {
		System.out.println("Lista de alunos: ");
		
		for (aluno a:ListaDeAlunos) { //var a do tipo aluno
			a.listar();
		}
	}
	
	void listarSituacao() {
		System.out.println("Status: ");
		for (aluno alunoNaLista:ListaDeAlunos) {
			alunoNaLista.situacao();
		}
	}
	
}
