package alua_1;

import java.sql.Date;
import java.util.Objects;

public abstract class Conta {
	String numeroConta;
	float saldo;
	Date dataAbertura;
	boolean status;
	
	public Conta() {
		
	}
	public Conta(String numeroConta, float saldo, Date dataAbertura, boolean status) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.dataAbertura = dataAbertura;
		this.status = status;
	}
	
	public int hashCode() {
		return Objects.hash(numeroConta,saldo,dataAbertura,status);
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		return Objects.equals(numeroConta, other.numeroConta);
	}
	@Override
	public String toString() {
		return "Conta [numeroConta=" + numeroConta + ", saldo=" + saldo + ", dataAbertura=" + dataAbertura + ", status="
				+ status + "]";
	}
	

	public String getNumeroConta() {
		return numeroConta;
	}


	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}


	public float getSaldo() {
		return saldo;
	}


	public void setSaldo(float saldo) {
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


	public float consultarSalso() {
		if(this.getStatus() == true ) {
			return this.saldo;
		}else {
			System.out.println("Não foi possivelconsultar Saldo");
		}
		return saldo;
	}
	public void sacar(float quantia) {
		if(this.getStatus() == true) {
			if(this.getSaldo() >= quantia) {
				this.setSaldo(this.getSaldo()-quantia);
				System.out.println("Saque realizado com sucesso na conta "+ this.getNumeroConta());
			}else {
				System.out.println("Saldo insuficiente para saque!");
			}
		}else {
			System.out.println("Impossivel realizar o saque, conta inativada!");
		}
	}
	
	public void depositar(float valor) {
		if(this.getStatus()== true) {
			this.setSaldo(this.getSaldo()+ valor);
			System.out.println("Deposito realizado com sucesso na conta "+ this.getNumeroConta());
		}else {
			System.out.println("Deposito não realizado pois conta encontra-se fechada!");
		}
	}
	abstract void transferir(Conta destino, float quantidade);

}
