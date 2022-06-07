package alua_1;

public class Programa {
	
	public static void main(String[] args) {
		Conta c1 = new ContaPoupanca("1234A", 50f, null, true);
		System.out.println(c1);
		
		c1.depositar(30f);
		System.out.println(c1);
		
		c1.sacar(10f);
		System.out.println(c1);
		
		Conta c2 = new ContaCorrente("4321B", 40f, null, true);
		System.out.println(c2);
		
		c1.transferir(c2, 15f);
		System.out.println(c1);
		System.out.println(c2);
		
	}

}
