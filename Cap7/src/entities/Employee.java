package entities;

public class Employee {

	public String nome;
	public double grossSalary;
	public double taxa;

	public double netSalary() {
		return grossSalary - taxa;
	}

	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100.0;
	}

	public String toString() {
		return nome + ", $ " + String.format("%.2f", netSalary());
	}
}
