package br.edu.fu.fariaiago.t081123;

public class PessoaFisica extends Pessoa {
	private String sobrenome;
	private String cpf;
	
	public PessoaFisica(String nome, String sobrenome, String cpf) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}
	
	public PessoaFisica(String nome, String sobrenome) {
		this(nome, sobrenome, null);
	}

	public String getCPF() {
		return this.cpf;
	}
	
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	@Override
	public String toString() {
		return "{PessoaFisica[nome=" + nome + "|sobrenome=" + sobrenome + "|cpf=" + cpf + "]}";
	}
}