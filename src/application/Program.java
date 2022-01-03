package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.OutsourcedEmployee;
import entities.employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<employee> list = new ArrayList<>();
		
		
		System.out.print(" Entre com a quantidade de funcionarios: ");
		
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Funcionario #" + i +  " dados:");
			System.out.print("Terceirizado (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Horas: ");
			int hours = sc.nextInt();
			System.out.print("Valor por Hora: ");
			double valuePerHour = sc.nextDouble();
			
			if (ch == 'y') {
				System.out.print("Taxa de adicional: ");
				double additionalCharge = sc.nextDouble();
				
				
				employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(emp);
			}
			else {
				employee emp = new employee(name, hours, valuePerHour);
				list.add(emp);
			}
		}
		    System.out.println();
		    System.out.println("Pagamentos: ");
		    
		    for(employee emp : list) {
		    	System.out.println(emp.getName() + " - $ " + String.format("%.2f",emp.payment()));
		    }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}
