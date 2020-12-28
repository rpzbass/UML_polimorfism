package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		List<Employee> list = new ArrayList<Employee>();

		System.out.print("Enter the number of employees: ");
		int n = input.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.print("Employee #" + i + " data: ");
			System.out.print("OutSorced (y/n)?");
			char opc = input.next().charAt(0);
			System.out.print("Name: ");
			String name = input.next();
			System.out.print("Hours: ");
			Integer hours = input.nextInt();
			System.out.print("Value per hour: ");
			Double value = input.nextDouble();

			if (opc == 'y') {
				System.out.print("Additional charge: ");
				Double charge = input.nextDouble();
				list.add(new OutsourcedEmployee(name, hours, value, charge));

			} else {

				list.add(new Employee(name, hours, value));

			}

		}

		System.out.print("PAYMENTS : \n");
		for (Employee emp : list) {
			
			System.out.print("------------------\n" + emp.toString());

		}

		input.close();
	}

}
