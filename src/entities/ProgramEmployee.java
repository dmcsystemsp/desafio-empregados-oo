package entities;

import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do departamento: ");
		String departamentName = sc.nextLine();
		System.out.print("Dia do pagamento: ");
		Integer dayPay = sc.nextInt();
		sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Telefone: ");
		String phone = sc.nextLine();
		
		Address address =new Address(email, phone);
		Departament dep = new Departament(departamentName, dayPay, address);
		
		System.out.print("Quantos Funcionários tem o Departamento? ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println("Dados do Funcionário "+i+":");
			sc.nextLine();
			System.out.print("Nome: ");
			String employeeName = sc.nextLine();
			System.out.print("Salário: ");
			double salary = sc.nextDouble();
			Employee emp = new Employee(employeeName, salary);
			dep.addEmployee(emp);
			
		}
		
		showReport(dep);
		
		sc.close();
	}
	
	private static void showReport(Departament dept) {
		System.out.println();
		System.out.println("FOLHA DE PAGAMENTO:");
		System.out.println(dept);
	}

}
