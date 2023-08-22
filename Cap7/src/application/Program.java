package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		System.out.print("Nome: ");
		emp.nome = sc.nextLine();
		System.out.print("Salário bruto: ");
		emp.grossSalary = sc.nextDouble();
		
		System.out.print("Taxa: ");
		emp.taxa = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("Pessoa: " + emp);
		System.out.println();
		
		System.out.print("Qual percentual aumentar o salário? ");
		double percentage = sc.nextDouble();
		
		emp.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("dados atualizados\r\n" + "" + emp);
		sc.close();
	}
}