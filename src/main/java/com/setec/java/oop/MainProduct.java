package com.setec.java.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProduct {

	public static void main(String[] args) {
	
		List<Product> products = new ArrayList<>();
		Scanner cin = new Scanner(System.in);
		System.out.println("OOP Practice");
		
		while(true) {
			
			System.out.println("\n\n");
			int choose = Program.showMenu();
			
			switch(choose) {
				case 1:{Program.addProduts(products);cin.nextLine();break;}
				case 2:{Program.editProduct(products);cin.nextLine();break;}
				case 3:{Program.deleteProduct(products);cin.nextLine();break;}
				case 4:{Program.showProduct(products);cin.nextLine();break;}
				default: System.exit(0);
			}
		}

	}

}
