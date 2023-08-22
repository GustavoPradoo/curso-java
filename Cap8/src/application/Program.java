package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product product = new Product();
		System.out.println("Informações do produto: ");
		System.out.print("Nome: ");
		product.name = sc.nextLine();
		System.out.print("Preço: ");
		product.price = sc.nextDouble();
		System.out.print("Quantidade no stock: ");
		product.quantity = sc.nextInt();
		System.out.println();
		System.out.println("informações do produto: " + product);
		System.out.println();
		System.out.print("Digite o numero de produtos para adicionar no stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Informações atualizadas: " + product);
		System.out.println();
		System.out.print("Digite o numero de produtos para remover do stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Informações atualizadas: " + product);
		sc.close();
	}
}
