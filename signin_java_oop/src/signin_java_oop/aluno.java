/* 
 * 
 * @Author: MateusLeviDev
 * */

package signin_java_oop;

import java.util.ArrayList;

public class aluno {
	// cria��o do construtor aluno alt+shift+s constructor using fields
	
	private String nome, cpf, situa�ao = "reprovado";
	ArrayList<Float> notasAluno = new ArrayList<Float>();
	float total = 0;
	
	public ArrayList<Float> getNotasAluno() {
		return notasAluno;
	}

	public void setNotasAluno(ArrayList<Float> notasAluno) {
		this.notasAluno = notasAluno;
	}

	public aluno() {} //vazio n�o precisa repassar dados.
	
	public aluno(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	void insereNotas(float grades) {
		notasAluno.add(grades);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	void listar() {
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		
		for (int i = 0; 1 < notasAluno.size(); i++) {
			System.out.println("Nota " + (i + 1) + ": " + this.notasAluno.get(i));
		}
	}
	
	void situacao() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Total: " + this.total);
		System.out.println("Situa��o: " + this.situa�ao);
		
	}
	
	void sumGrade() {
		for (float notaDaLista:notasAluno) {
			total += notaDaLista;
		}
		
		if (total >= 70) {
			this.situa�ao = "aprovado";
		} else {
			this.situa�ao = "reprovado";
		}
	}
}
