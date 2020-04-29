package App;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Filme;

public class Programa {

	public static void main(String[] args) {
		
		Scanner in  = new Scanner(System.in);
		
		char escolha = 's';
		
		// Instancia da lista de filmes que serão Adcionados
		List<Filme> filmes = new ArrayList<>();
		
		
		// Menu Para Usuário
		System.out.println("--------------------------------");
		System.out.println("L I S T A DE F I L M E S");
		System.out.println("--------------------------------");
		
		while(escolha == 's') {
			System.out.println("Digite: ");
			System.out.println("1 - Cadastrar Filme");
			System.out.println("2 - Pesquisar Filme");
			System.out.println("3 - Editar Filme");
			System.out.println("4 - Deletar Filme");
			
			System.out.print("Insira sua opção: ");
			int op = in.nextInt();
			
			// switch de acordo com as opções selecionadas
			switch(op) {
			// cadastro de filme
			case 1:
				System.out.println("Insira Título do Filme: ");
				in.nextLine();
				String titulo = in.nextLine();
				System.out.println("Insira ano de lançamento: ");
				int anoLancamento = in.nextInt();
				in.nextLine();
				System.out.println("Insira Gênero do filme: ");
				String genero = in.nextLine();
				System.out.println("Insira a descrição do filme: ");
				String descricao = in.nextLine();
				
				filmes.add(new Filme(titulo, anoLancamento, genero, descricao));
				
				break;
				
			case 2:
				System.out.println("Insira o nome do filme qual deseja buscar: ");
				String nome = in.next();
				Filme f = filmes.stream().filter(x -> nome.equals(x.getTitulo())).findAny().orElse(null);
				
				if(f == null) {
					System.out.println("Filme Não existe!");
				} else {
					System.out.println(f);
				}
				
				break;
			}
			
			System.out.println("Deseja Continuar? (s/n)");
			escolha = in.next().charAt(0);
	}
		in.close();

	}

}
