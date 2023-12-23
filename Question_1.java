package DungeonGame;

import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner sc = new Scanner(System.in);

		System.out.println("Dimensions of the dungeon (Row x Column):");
		int rows = sc.nextInt();
		int cols = sc.nextInt();

		System.out.println("Position of adventurer:");
		int advX = sc.nextInt();
		int advY = sc.nextInt();

		System.out.println("Position of gold:");
		int goldX = sc.nextInt();
		int goldY = sc.nextInt();

		int steps = Math.abs(advX - goldX) + Math.abs(advY - goldY);
		System.out.println("Minimum number of steps: " + steps);

		System.out.println("Path taken:");
		while (advX != goldX || advY != goldY) {
			if (advX < goldX) {
				System.out.println("Move down");
				advX++;
			} else if (advX > goldX) {
				System.out.println("Move up");
				advX--;
			} else if (advY < goldY) {
				System.out.println("Move right");
				advY++;
			} else if (advY > goldY) {
				System.out.println("Move left");
				advY--;
			}
		}
	}
}
