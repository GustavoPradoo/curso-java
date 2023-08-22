package aplicacao;

import java.util.Scanner;

public class EstrturaER2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		System.out.println("Possiveis Divisores");
		
		for (int y= 1; y <= a; y++) {
			if (a % y == 0) {
				System.out.println(y);
			}
		}

		sc.close();
	}

}
