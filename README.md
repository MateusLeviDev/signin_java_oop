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

a classe "aluno" contém atributos e métodos para lidar com informações relacionadas a um aluno.

A classe possui os seguintes atributos:

nome: uma string que representa o nome do aluno
cpf: uma string que representa o CPF do aluno
situação: uma string que indica se o aluno está aprovado ou reprovado (por padrão, é definido como "reprovado")
notasAluno: um ArrayList que armazena as notas do aluno
total: um float que representa a soma das notas do aluno
A classe possui os seguintes métodos:

- construtores: um construtor vazio e um construtor com dois parâmetros (nome e cpf) para criar um novo objeto "aluno"
- insereNotas(): um método que recebe uma nota e a adiciona à lista de notas do aluno
- getNome() e getCpf(): métodos que retornam o nome e o CPF do aluno, respectivamente
- setNome() e setCpf(): métodos que permitem alterar o nome e o CPF do aluno, respectivamente
- listar(): um método que imprime na tela o nome e o CPF do aluno, bem como suas notas
- situacao(): um método que imprime na tela o nome, a soma das notas e a situação (aprovado ou reprovado) do aluno
- sumGrade(): um método que calcula a soma das notas do aluno e atualiza sua situação de acordo com o total de notas.
> A classe é usada para armazenar informações de um único aluno e permite que essas informações sejam acessadas e atualizadas por outros programas.

a classe "sala" contém uma lista de objetos "aluno". A classe possui os seguintes atributos e métodos:

- ListaDeAlunos: um ArrayList que armazena objetos "aluno"
- construtor: um construtor vazio que inicializa a lista de alunos
- insereAluno(): um método que recebe um objeto "aluno" e o adiciona à lista de alunos. Antes de adicionar o aluno, o método chama o método "sumGrade()" do objeto "aluno", que calcula a soma das notas do aluno e atualiza sua situação (aprovado ou reprovado).
- listarAlunos(): um método que imprime na tela a lista de alunos, utilizando o método "listar()" de cada objeto "aluno" na lista.
- listarSituacao(): um método que imprime na tela a situação (aprovado ou reprovado) de cada aluno na lista, utilizando o método "situacao()" de cada objeto "aluno" na - lista.
> Essa classe pode ser usada para armazenar informações de uma sala de aula, como a lista de alunos matriculados e suas notas, permitindo que essas informações sejam acessadas e atualizadas por outros programas.

A classe aluno é responsável por armazenar os dados do aluno, como nome, CPF e notas, e calcular a situação do aluno com base na soma de suas notas. A classe sala é responsável por manter uma lista de alunos e permitir que o usuário insira novos alunos, liste todos os alunos e suas notas e situações.

A classe Main é a classe principal do programa. Ela contém o método main, que é o ponto de entrada do programa. O método main contém um loop do-while que apresenta um menu para o usuário e executa diferentes opções com base na entrada do usuário.

Por exemplo, se o usuário escolher a opção "inserir aluno", o programa solicita o nome e o CPF do aluno e, em seguida, solicita o número de notas que o aluno terá. Em seguida, o programa solicita cada nota e insere as notas na instância de aluno e adiciona o objeto aluno à lista de alunos na instância de sala. Se o usuário escolher a opção "listar alunos", o programa imprime na tela uma lista de todos os alunos na sala, juntamente com suas notas. Se o usuário escolher a opção "situações", o programa imprime na tela uma lista de todos os alunos na sala, juntamente com suas situações (aprovado ou reprovado).

O programa é interativo e permite que o usuário insira qualquer número de alunos e notas antes de sair do programa. Ele também usa classes, objetos, arrays e loops para armazenar e manipular dados e oferecer uma funcionalidade completa para o usuário.

### `casos`
contém exemplos de encapsulamento e polimorfismo.

- O encapsulamento é observado na classe "aluno", em que as variáveis "nome", "cpf", "situaçao", "notasAluno" e "total" são privadas e só podem ser acessadas através de métodos públicos de acesso e modificação, como os métodos "getNome", "setNome", "getCpf", "setCpf", "getNotasAluno" e "setNotasAluno". Dessa forma, o estado interno do objeto é protegido e pode ser manipulado de forma controlada.

- O polimorfismo é observado em duas situações diferentes:

Na classe "sala", em que a lista de alunos é definida como um ArrayList do tipo "aluno". Isso significa que a lista pode conter objetos de qualquer subclasse de "aluno" que estenda a classe base. Portanto, a classe "sala" pode trabalhar com diferentes tipos de objetos "aluno" de forma polimórfica.
 Na classe "Main", em que é feita uma chamada polimórfica para o método "listarAlunos" da classe "sala". Isso significa que, independentemente da implementação específica do método "listarAlunos" na classe "sala", o método será chamado para todos os objetos "sala" de forma polimórfica.

> Em resumo, o encapsulamento é uma técnica de programação para proteger o estado interno de um objeto, enquanto o polimorfismo é uma técnica para trabalhar com diferentes tipos de objetos de forma genérica. Ambos são conceitos importantes da programação orientada a objetos.
