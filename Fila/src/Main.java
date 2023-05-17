import java.util.Scanner;
import java.util.ArrayList;
class Main {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
	    ArrayList<Pessoa> lista= new ArrayList<>();
	  String pacientes = "Pacientes em espera: ";
int op; 
do {
	pacientes = "Pacientes em espera: ";
	if(lista.size()>0) {
		
	for(Pessoa p: lista) {
		pacientes +="-"+p.getNome();
	}	
	}
	
	System.out.println(pacientes);
	System.out.println(" 1 - Cadastrar");
	System.out.println(" 2 - Consultar");
	System.out.println(" 0 - Finalizar");
	op=leia.nextInt();
	Pessoa j = null;
	if(op==1) {
		System.out.println("Cadastre seu Cpf:");
		int novocpf= leia.nextInt();
		System.out.println("Cadastre seu nome:");
		String novonome= leia.next();
		Pessoa p= new Pessoa(novocpf, novonome);
		lista.add(p);
		System.out.println("Pessoa Cadastrada!");
	}else if(op==2) {
		System.out.println("Digite o CPF da pessoa que deseja consultar:");
		int remover= leia.nextInt();
		int qtd =0;
		for(Pessoa i: lista) {
			if(remover==i.getCpf()) {
				j =lista.get(qtd);
			}
			qtd++;
		}	
		lista.remove(j);
	}else if(op==0) {
		System.out.println("Programa finalizado");
	}else {
		System.out.println("Opção inválida");
	}
}while(op!=0);
	}

	

}
