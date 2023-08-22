package application;

import java.text.ParseException;
import java.util.Scanner;

import Entities.Rent;

public class Program {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Rent[] vect = new Rent[10];
		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Aluguel #" + i + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int room = sc.nextInt();
			vect[room] = new Rent(nome, email);
		}
		System.out.println();
		System.out.println("Quartos Ocupados:");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		sc.close();
	}
}