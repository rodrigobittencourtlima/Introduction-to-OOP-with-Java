package application;

import java.util.Scanner;

import entities.Rent;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rent[] rooms = new Rent[10];

		System.out.print("How many rooms will be rented? ");
		int roomsToBeRented = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < roomsToBeRented; i++) {
			System.out.println();
			System.out.println("Room #" + (i + 1));
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			rooms[room] = new Rent(name, email);
		}

		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] != null) {
				System.out.println(i + ": " + rooms[i]);
			}
		}

		sc.close();
	}
}
