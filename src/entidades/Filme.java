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
		return "Título: "
				+ titulo
				+ ", "
				+ "Ano de Lançamento: "
				+ anoLancamento
				+ ", "
				+ "Gênero: "
				+ genero
				+ ", "
				+ "Descrição: "
				+ descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Filme other = (Filme) obj;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
	

	
	
}
