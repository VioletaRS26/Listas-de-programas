package Projeto_1;

import java.util.Date;
import java.util.Objects;


public class Conta {
	
	public static int contadorConta = 1;
	
	private int numeroConta;
	private Double saldo= 0.0;
	Date dataAbertura;
	private boolean status = true;
	private Cliente cliente;

	
	
	
	public Conta( Cliente cliente) {
		
		this.numeroConta = Conta.contadorConta;
		this.saldo = saldo;
		this.dataAbertura = new Date();
		this.status = status;
		this.cliente = cliente;
		Conta.contadorConta +=10000;
	}
	
	
	
	@Override
	public String toString() {
		return "Conta [numeroConta=" + numeroConta + ", saldo=" + saldo + ", dataAbertura=" + dataAbertura + ", status="
				+ status + ", cliente=" + cliente + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(cliente, dataAbertura, numeroConta, saldo, status);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		return Objects.equals(cliente, other.cliente)
				&& numeroConta == other.numeroConta ;
	}


	public int getNumeroConta() {
		return numeroConta;
	}


	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}


	public Double getSaldo() {
		return saldo;
	}


	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}


	public Date getDataAbertura() {
		return dataAbertura;
	}


	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}


	public boolean getStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public void abrirConta(String t) {
		this.setStatus(true);
		this.setSaldo((double) 0);
		System.out.println("Conta aberta com sucesso!");
	}
	
	public  boolean fecharConta() {
		if(this.getSaldo() > 0) {
			System.out.println("Conta não pode ser fechada porque contem dinheiro.");
		}else if(this.getSaldo() < 0) {
			System.out.println("Conta não pode ser fechada por conter débito!");
		} else {
			this.setStatus(false);
				System.out.println("Conta fechada co sucesso!");
			}
		return this.getStatus();
	}
	
	public Double consultarSalso() {
		if(this.getStatus()) {
			return this.saldo;
		}else {
			System.out.println("Não foi possivelconsultar Saldo");
		}
		return saldo;
	}
	public void sacar(Double quantia) {
		if(this.getStatus() == true) {
			if(this.getSaldo() >= quantia) {
				this.setSaldo(this.getSaldo()-quantia);
				System.out.println("Saque realizado com sucesso na conta "+ cliente);
			}else {
				System.out.println("Saldo insuficiente para saque!");
			}
		}else {
			System.out.println("Impossivel realizar o saque, conta inativada!");
		}
	}
	
	public void depositar(Double valor) {
		if(this.getStatus()== true) {
			this.setSaldo(this.getSaldo()+ valor);
			System.out.println("Deposito realizado com sucesso na conta do cliente "+ cliente);
		}else {
			System.out.println("Deposito não realizado pois conta encontra-se fechada!");
		}
	}
	public void transferir(Conta destino, Double quantia) {
		if(this.getSaldo()> quantia && this.getStatus() == true) {
			this.setSaldo(this.getSaldo() - quantia );
			destino.setSaldo(destino.getSaldo() + quantia);
			System.out.println("Transferencia realizada com sucesso!");
		}else {
			System.out.println("Não foi possivel realizar a transferencia!");
		}
	}

}
