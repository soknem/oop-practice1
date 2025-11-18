package com.setec.java.oop;

import java.util.List;
import java.util.Scanner;

public class Program {

	private static int id = 1;

	public static double getDiscount(double total) {
		return 0;
	}

	public static double displayReport(double total, double dis, double disPrice) {
		return 0;
	}

	public static int showMenu() {
		Scanner cin = new Scanner(System.in);
		System.out.println("1.Add new products");
		System.out.println("2.Edit product by id");
		System.out.println("3.Delete  product by id");
		System.out.println("4.Show all  products");
		System.out.println("5.Exit");
		int choose = 0;
		while (true) {
			try {
				System.out.print("Enter choice: ");
				choose = cin.nextInt();
				if (choose > 0 && choose <= 5)
					break;
			} catch (Exception e) {
				System.out.println("choice must be 1 to 5");
				cin.nextLine();
			}
		}
		;

		return choose;
	}

	public static void addProduts(List<Product> products) {
		// input n to add more product
		// validate when input

		String name;
		double price;
		int qty;

		Scanner cin = new Scanner(System.in);
		System.out.println("Please input n to add more products");
		int n;
		while (true) {
			try {
				System.out.print("Enter n : ");
				n = cin.nextInt();
				if (n > 0)
					break;
				else {
					System.out.println("n must be greater than 0");
				}
			} catch (Exception e) {
				System.out.println("n must be integer and greater than 0");
				cin.nextLine();
			}
		}
		cin.nextLine();

		for (int i = 0; i < n; i++) {

			while (true) {
				System.out.print("Enter name:");
				name = cin.nextLine();
				if (name != null && name.trim() != "")
					break;
				else {
					System.out.print("name must be not null or empty");
					cin.nextLine();
				}
			}

			while (true) {
				try {
					System.out.print("Enter price:");
					price = cin.nextDouble();
					if (price > 0) {
						break;
					} else {
						System.out.println("Price must be greater than 0");
						cin.nextLine();
					}

				} catch (Exception e) {
					System.out.println("Price must be number");
					cin.nextLine();
				}
			}

			while (true) {
				try {
					System.out.print("qty price:");
					qty = cin.nextInt();
					if (qty > 0) {
						break;
					} else {
						System.out.print("Price must be integer and greater than 0");
						cin.nextLine();
					}
				} catch (Exception e) {
					System.out.print("Price must be number");
					cin.nextLine();
				}
			}
			cin.nextLine();

			Product product = new Product(id, name, price, qty);
			products.add(product);
			id++;
		}

	}

	public static void editProduct(List<Product> products) {
		// input id for edit
		// if found please input new data for product
		// validate when input

	}

	public static void deleteProduct(List<Product> products) {
		// please input id to delete
		// if sound must show message confirm Yes/No to delete
		//
		Scanner cin = new Scanner(System.in);
		int id;
		while (true) {
			try {
				System.out.print("Enter ID:");
				id = cin.nextInt();
				if (id > 0) {
					break;
				} else {
					System.out.print("ID must be integer and greater than 0");
					cin.nextLine();
				}
			} catch (Exception e) {
				System.out.print("ID must be number");
				cin.nextLine();
			}
		}
		
		for(int i =0;i<products.size();i++) {
			if(products.get(i).getId()==id) {
				String op =null;
				while(true) {
					System.out.print("Enter Yes/No to delete or not:");
					op=cin.nextLine();
					if(op.toUpperCase().equals("YES")||op.toUpperCase().equals("NO")) {
						break;
					}
					cin.nextLine();				}

				if(op.toUpperCase().equals("YES")) {
					products.remove(products.get(i));
				}
				break;
			}else {
				System.out.println("Product not found");
			}
		}
	}

	public static void showProduct(List<Product> products) {
		// Show all products and row and columns
		System.out.println("ID\tName\tPrice\tQty");
		for(Product product:products) {
			System.out.println(product.getId()+"\t"+product.getName()+"\t"+product.getPrice()+"\t"+product.getQty());
		}

	}

}
