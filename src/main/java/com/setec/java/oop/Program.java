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

    public static String pad(String str, int length, char paddingChar, boolean padRight) {
        if (str == null) {
            str = ""; // Handle null input safely
        }
        if (str.length() >= length) {
            return str; // No padding needed, or string is too long
        }

        int paddingLength = length - str.length();
        // Create the padding string (e.g., "   " or "***")
        String padding = String.valueOf(paddingChar).repeat(paddingLength);

        if (padRight) {
            // Pad Right: "Hello   "
            return str + padding;
        } else {
            // Pad Left: "   Hello"
            return padding + str;
        }
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
                if (choose > 0 && choose <= 5) {
                    break;
                } else {
                    System.out.println("choice must be 1 to 5");
                }
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
            System.out.println("\n++ Product[" + id + "]: ");
            while (true) {
                System.out.print("Enter name:");
                name = cin.nextLine();
                if (name != null && name.trim() != "")
                    break;
                else {
                    System.out.println("name must be not null or empty");
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
                    System.out.print("Enter qty:");
                    qty = cin.nextInt();
                    if (qty > 0) {
                        break;
                    } else {
                        System.out.println("Price must be integer and greater than 0");
                        cin.nextLine();
                    }
                } catch (Exception e) {
                    System.out.println("Price must be number");
                    cin.nextLine();
                }
            }
            cin.nextLine();

            Product product = new Product(id, name, price, qty);
            products.add(product);
            id++;
        }
        System.out.println("Products add successfully");

    }

    public static void editProduct(List<Product> products) {
        // input id for edit
        // if found please input new data for product
        // validate when input
        if (products.isEmpty()) {
            System.out.println("No products to edit");
            return;
        }

        String name;
        double price;
        int qty;

        Scanner cin = new Scanner(System.in);
        int id;
        while (true) {
            try {
                System.out.print("Enter ID:");
                id = cin.nextInt();
                if (id > 0) {
                    break;
                } else {
                    System.out.println("ID must be integer and greater than 0");
                    cin.nextLine();
                }
            } catch (Exception e) {
                System.out.println("ID must be number");
                cin.nextLine();
            }
        }

        cin.nextLine();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                System.out.println("Please enter new data for product[" + products.get(i).getId() + "]:");
                while (true) {
                    System.out.print("Enter name:");
                    name = cin.nextLine();
                    if (name != null && name.trim() != "")
                        break;
                    else {
                        System.out.println("name must be not null or empty");
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
                        System.out.print("Enter qty:");
                        qty = cin.nextInt();
                        if (qty > 0) {
                            break;
                        } else {
                            System.out.println("Price must be integer and greater than 0");
                            cin.nextLine();
                        }
                    } catch (Exception e) {
                        System.out.println("Price must be number");
                        cin.nextLine();
                    }
                }
                cin.nextLine();
                products.get(i).setName(name);
                products.get(i).setPrice(price);
                products.get(i).setQty(qty);

                System.out.print("Product update successfully");
                return;
            }
        }
        System.out.println("Product not found");

    }

    public static void deleteProduct(List<Product> products) {
        if (products.isEmpty()) {
            System.out.println("No products to delete");
            return;
        }
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
                    System.out.println("ID must be integer and greater than 0");
                    cin.nextLine();
                }
            } catch (Exception e) {
                System.out.println("ID must be number");
                cin.nextLine();
            }
        }

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                String op = null;
                cin.nextLine();
                while (true) {
                    System.out.print("Enter Yes/No to delete or not:");
                    op = cin.nextLine();
                    if (op.equalsIgnoreCase("YES") || op.equalsIgnoreCase("NO")) {
                        break;
                    }
                }

                if (op.toUpperCase().equals("YES")) {
                    products.remove(products.get(i));
                    System.out.print("Product delete successfully");
                    return;
                }
                System.out.print("Cancelled delete product");
                return;

            }
        }
        System.out.println("Product not found");

    }

    public static void showProduct(List<Product> products) {
        if (products.isEmpty()) {
            System.out.println("No products to display");
            return;
        }
        System.out.println("-----------------------------");
        System.out.print(pad(String.valueOf("ID"), 5, ' ', true));
        System.out.print(pad(String.valueOf("Name"), 20, ' ', true));
        System.out.print(pad(String.valueOf("Price"), 8, ' ', true));
        System.out.println(pad(String.valueOf("Qty"), 8, ' ', true));
        for (Product product : products) {
            String id = pad(String.valueOf(product.getId()), 5, ' ', true);
            String name = pad(product.getName(), 20, ' ', true);
            String price = pad(String.valueOf(product.getPrice()), 8, ' ', true);
            String qty = pad(String.valueOf(product.getQty()), 8, ' ', true);

            System.out.println(id + name + price + qty);
        }
    }

}
