package br.edu.fu.fariaiago.t081123;

public class PessoaJuridica extends Pessoa {
	private String CNPJ;
	private TipoPessoaJuridica tipo;
	
	public PessoaJuridica(String nome, String CNPJ, TipoPessoaJuridica tipo) {
		this.nome = nome;
		this.CNPJ = CNPJ;
		this.tipo = tipo;
	}
	
	public PessoaJuridica(String nome, String CNPJ) {
		this(nome, CNPJ, TipoPessoaJuridica.DIREITO_PRIVADO);
	}
	
	public String getCNPJ() {
		return this.CNPJ;
	}
	
	public void setCNPJ(String CNPJ) {
		this.CNPJ = CNPJ;
	}
	
	public TipoPessoaJuridica getTipo() {
		return tipo;
	}
	
	public void setTipo(TipoPessoaJuridica tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "{PessoaJuridica[nome=" + CNPJ + "|CNPJ=" + tipo + "|tipo=" + nome + "]}";
	}
}