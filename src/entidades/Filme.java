package entidades;

public class Filme {
	
	private String titulo;
	private Integer anoLancamento;
	private String genero;
	private String descricao;
	
	public Filme(String titulo, Integer anoLancamento, String genero, String descricao) {
		this.titulo = titulo;
		this.anoLancamento = anoLancamento;
		this.genero = genero;
		this.descricao = descricao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(Integer anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return titulo
				+ ", "
				+ anoLancamento
				+ ", "
				+ genero
				+ ", "
				+ descricao;
	}
	
	
}
