package br.edu.fu.fariaiago.t081123;

public abstract class Pessoa {
	protected String nome;

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "{Pessoa[nome=" + nome + "]}";
	}
}