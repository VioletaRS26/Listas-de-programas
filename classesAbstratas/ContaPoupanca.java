package alua_1;

import java.sql.Date;

public class ContaPoupanca extends Conta {
	
	final float TAXA_ADMINISTRATIVA_POUPANCA = 0.01f;

	@Override
	public String toString() {
		return "ContaPoupanca [TAXA_ADMINISTRATIVA_POUPANÇA=" + TAXA_ADMINISTRATIVA_POUPANCA + ", numeroConta="
				+ numeroConta + ", saldo=" + saldo + ", dataAbertura=" + dataAbertura + ", status=" + status + "]";
	}

	public ContaPoupanca(String numeroConta, float saldo, Date dataAbertura, boolean status) {
		super(numeroConta, saldo, dataAbertura, status);
		// TODO Auto-generated constructor stub
	}
	

	void transferir(Conta destino, float quantidade) {
		if(destino instanceof ContaPoupanca) {
			if(this.getSaldo()> quantidade && this.getStatus() == true) {
				this.setSaldo(this.getSaldo() - quantidade );
				destino.setSaldo(destino.getSaldo() + quantidade);
				System.out.println("Transferencia realizada com sucesso!");
			}else {
				System.out.println("Não foi possivel realizar a transferencia!");
			}
		}else {
			if((quantidade+(quantidade* TAXA_ADMINISTRATIVA_POUPANCA))<this.getSaldo() && this.getStatus() == true) {
				this.setSaldo(this.getSaldo() - (quantidade+(quantidade* TAXA_ADMINISTRATIVA_POUPANCA)) );
				destino.setSaldo(destino.getSaldo() + quantidade);
				System.out.println("Transferencia realizada com sucesso!");
			}else {
				System.out.println("Não foi possivel realizar a transferencia!");
			}
		}
	}
}
	

