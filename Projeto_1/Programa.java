package Projeto_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
	private static Cliente cliente;
	private static ArrayList<Conta> contaBancaria;
	public static ArrayList<Cliente> clienteBancario;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		contaBancaria = new ArrayList<Conta>();
		clienteBancario = new ArrayList<Cliente>();
		escolha();
	}
		
	private static void escolha() {
		// TODO Auto-generated method stub
		
		System.out.println("--------------------------------------------");
		System.out.println("------Bem-vindo ao banco Aqui tem mais------");
		System.out.println("---------------------------------------------");
		
		boolean condicao = true;
		boolean sair = false;
			
		while(condicao == true) {
			System.out.println("---------- Menu de operações ----------");
			System.out.println("1- Cadastrar cliente"); //F
			System.out.println("2- Listar os clientes cadastrados");//F
			System.out.println("3- Listar contas");//F
			System.out.println("4- Depósitar");//F
			System.out.println("5- Sacar");//F
			System.out.println("6- Consultar saldo");//F
			System.out.println("7- Remover cliente");
			System.out.println("8- Sair ");//F
			System.out.println("Digite no número da opção desejada: ");
			
			int escolha = sc.nextInt();
			switch(escolha) {
			case 1:
				criarCliente();
				break;
			case 2:
				listarClientes();
				break;
			case 3:
				listarConta();
				break;
			case 4:
				depositar();
				break;
			case 5:
				sacar();
				break;
			case 6:
				consultarSaldo1();
				break;
			case 7:
				System.out.println("Digite o cpf: ");
				String cpf = sc.next();
				encontrarCliente(cpf);
				break;
			case 8:
				System.out.println("O programa foi finalizado!\n\n\n");
				System.exit(0);
			default:
				System.out.println("Escolha inválida");
				escolha();
				break;
			}
				
			
		  }
	}
	public static void criarCliente() {
		// TODO Auto-generated method stub
		System.out.println("Digite o nome do Cliente:");
		String nome = sc.next();
		System.out.println("Digite o CPF: ");
		String cpf = sc.next();
		System.out.println("Digite o e-mail: ");
		String email = sc.next();
		
		Cliente cliente = new Cliente(cpf,nome,email);
		Conta conta = new Conta(cliente);
		
		contaBancaria.add(conta);
		clienteBancario.add(cliente);
		System.out.println("Conta cadastrada com sucesso");
			
		escolha();
	} 
	public static void listarClientes() {
		if(clienteBancario.size()>0) {
			for(Cliente cliente: clienteBancario) {
				System.out.println(cliente);
			}
		}else {
			System.out.println("Lista de contas vazia");
		}
		escolha();
	}
	
	public static Conta encontrarConta(int numeroConta) {
		Conta conta = null;
		if(contaBancaria.size()>0) {
			for(Conta contas : contaBancaria) {
				if(contas.getNumeroConta() == numeroConta) {
					conta = contas;
				}
			}
		}
		return conta;
	}
	public static Cliente encontrarCliente(String cpf) {
		Cliente cliente = null;
		if(clienteBancario.size()>0) {
			for(Cliente clientes : clienteBancario) {
				if(clientes.getCpf().equals(cpf)) {
					cliente = clientes;
				}else {
					System.out.println("Cliente inexistente!");
				}
			}
		}
		return cliente;
	}
	public static void listarConta() {
		if(contaBancaria.size()>0) {
			for(Conta conta: contaBancaria) {
				System.out.println(conta);
			}
		}else {
			System.out.println("Lista de contas vazia");
		}
		escolha();
	}
	public static void localizarConta() {
		System.out.println("Informe o CPF do cliente: ");
		String cpf = sc.next();
		Cliente cliente = encontrarCliente(cpf);
		System.out.println(cliente);
		escolha();
	}
	public static void depositar() {
		System.out.println("Informe o número da conta: ");
		int numeroConta = sc.nextInt();
		Conta conta = encontrarConta(numeroConta);
		
		if(conta != null) {
			System.out.println("Informe o valor a ser depositado: ");
			Double valor = sc.nextDouble();
			
			conta.depositar(valor);
		}else {
			System.out.println("Conta inexistente");
		}
		escolha();
	}
	public static void sacar() {
		System.out.println("Informe o número da conta: ");
		int numeroConta = sc.nextInt();
		Conta conta = encontrarConta(numeroConta);
		
		if(conta != null) {
			System.out.println("Informe o valor a ser sacado: ");
			Double valor = sc.nextDouble();
			if(valor < conta.consultarSalso() ) {
				conta.sacar(valor);
			}else {
				System.out.println("Não é possivel sacar esse valor!");
			}
		}else {
			System.out.println("Conta inexistente");
		}
		escolha();
	}
	public static void consultarSaldo1() {
		System.out.println("Digite a conta que deseja verificar o saldo: ");
		int numeroConta = sc.nextInt();
		Conta conta = encontrarConta(numeroConta);
		if(conta!= null) {
			System.out.println(conta.consultarSalso());
		}else {
			System.out.println("Conta não encontrada! ");
		}
		escolha();
	}
}
	

	
