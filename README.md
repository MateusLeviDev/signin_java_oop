## `Java - OOP, students record`
Developing my expertise in OOP studies. Also, a material for an academic case

> Java, OOP.

### `Initial concepts`
- Implementando uma ArrayList das `grades` [Main.java - Case 1], para armazenar todas as notas. 
- Criando um constructor using fields. Para instanciar um objeto da classe `aluno`.
- Em seguida aplicando os conceitos de `encapsulamento`, em virtude das var serem privadas, devemos criar os `getters and setters`. 
> breve explicação: o encapsulamento permite a proteção ao acesso inicial de uma classe instanciada a um objeto. Proteção de dados.
- Chamando os respectivos scanners e, sem seguida, chamando o objeto: 

`novoAluno = new aluno(nome, cpf);`

- Em seguida. No arq sala.java será feita a listagem dos alunos. Filtrando-os, de certa froma. Armazendo-os em uma lista.
> insereAluno é um método da classe sala que recebe um objeto do tipo aluno como parâmetro e adiciona esse objeto à lista de alunos da sala.
> insereAluno é uma função que foi definida para permitir que novos alunos sejam adicionados à lista de alunos da sala. Ela usa o método add() da classe ArrayList para > adicionar o objeto novoRegristro à lista de alunos da sala:

```
package signin_java_oop;
import java.util.ArrayList;


public class sala {
	ArrayList<aluno> ListaDeAlunos;
	
	public sala() {
			
	}

	public sala(ArrayList<aluno> listaDeAlunos) {
		ListaDeAlunos = listaDeAlunos;
	}

	void insereAluno(aluno novoRegristro) {
		ListaDeAlunos.add(novoRegristro);
	}
	
}

```
