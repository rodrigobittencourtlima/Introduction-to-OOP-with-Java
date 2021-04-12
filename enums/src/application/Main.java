package application;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Main {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Client client = generateClient(sc);
		Order order = generateOrder(sc, client);
		System.out.println();
		System.out.println(order);

		sc.close();
	}

	public static Client generateClient(Scanner sc) throws ParseException {
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth Date (DD/MM/YYYY): ");
		String birthDate = sc.nextLine();

		return new Client(name, email, birthDate);
	}

	public static Order generateOrder(Scanner sc, Client client) {
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.nextLine());
		Order order = new Order(status, client);
		System.out.print("How many items to this order? ");
		int orderItemsQuantity = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= orderItemsQuantity; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			sc.nextLine();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			sc.nextLine();
			Product product = new Product(productName, productPrice);
			order.addItem(new OrderItem(quantity, product.getPrice(), product));
		}
		return order;
	}

}
