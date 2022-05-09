package Projeto_1;

import java.util.Objects;

public class Cliente {
	String cpf;
	String nome;
	String email;
	
	public Cliente() {
		
	}
	public Cliente(String cpf, String nome, String email) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cpf, nome, email);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(cpf, other.cpf);
	}
	public static void removerCliente(Cliente cliente) {
		if(Programa.clienteBancario.contains(cliente)) {
			Programa.clienteBancario.remove(cliente);
			System.out.println("Cliente removido com sucesso!");
		}else {
			System.out.println("Cliente não encontrado!");
		}
	}
	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", nome=" + nome + ", email=" + email + "]";
	}
	public static String cliente1(Object nome2) {
		// TODO Auto-generated method stub
		return null;
	}
	public static String cliente(Object nome3) {
		// TODO Auto-generated method stub
		return null;
	}

}