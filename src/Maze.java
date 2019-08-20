import java.util.Scanner;

/*

 6 10
 . . . . # . . # . .
 . . . . . . . . . #
 # . # # . . # . . #
 # . # . . . # . . .
 . . . . # . . # . .
 # # . . . . . . . .

 6 6
 . # # # # #
 . . . . . #
 # . # # # #
 # . # # . .
 . . . # # #
 # # . . . .

 6 6
 . # # # # #
 . . . . . #
 # . # # # #
 # . . # . .
 . . . # # #
 # # . . . .

 */

public class Maze {
	static int row;
	static int col;
	static char arr[][];

	public static boolean findPath(int x, int y) {

		if (x < 0 || x >= row || y < 0 || y >= col)
			return false;

		if (x == row - 1 && y == col - 1) {
			arr[x][y] = '+';
			print(arr);
			return true;
		}

		if (arr[x][y] == '#' || arr[x][y] == '+')
			return false;

		arr[x][y] = '+';

		if (findPath(x, y + 1))
			return true;
		if (findPath(x + 1, y))
			return true;
		if (findPath(x, y - 1))
			return true;
		if (findPath(x - 1, y))
			return true;

		arr[x][y] = '.';

		return false;
	}

	public static void print(char[][] arr) {
		System.out.println("-----------------");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		row = kb.nextInt();
		col = kb.nextInt();

		arr = new char[row][col];

		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++)
				arr[i][j] = kb.next().charAt(0);

		findPath(0, 0);

	}

}
